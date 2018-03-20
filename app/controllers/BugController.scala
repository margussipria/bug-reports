package controllers

import java.security.MessageDigest

import javax.inject.Inject

import play.api.Application
import play.api.libs.json.{JsObject, JsString}
import play.api.mvc._
import play.api.mvc.request.RequestAttrKey

import scala.concurrent.{ExecutionContext, Future}

class BugController @Inject()(
  application: Application
)(implicit ec: ExecutionContext) extends InjectedController {

  def index(): Action[String] = Action.async[String](parse.tolerantText) { implicit request: Request[String] =>
    val json = JsObject(Seq(
      "name" -> JsString("Matti Meikäläinen")
    ))

    Future {
      Ok(json)
    } flatMap (signResponse(_, request))
  }

  def signResponse(result: Result, request: Request[String]): Future[Result] = {
    result.header.status match {
      case OK =>
        result.body.consumeData(application.materializer) map { body =>
/*
          body.foreach( b =>
            print("%02x " format b)
          )
          println()
          println(body.utf8String)
*/
          val headers = Seq(
            "content-sha256" -> md.digest(body.utf8String.getBytes("UTF-8"))
              .map("%02x" format _)
              .mkString,
            "server" -> request.attrs.get[String](RequestAttrKey.Server).getOrElse("unknown")
          )

          result.withHeaders(headers: _*).as("application/json; charset=utf-8")
        }
      case _ => Future.successful(result)
    }
  }

  val md: MessageDigest = java.security.MessageDigest.getInstance("SHA-256")
}
