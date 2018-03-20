package controllers

import java.security.MessageDigest

import akka.stream.Materializer
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.time._
import org.scalatest.{FreeSpec, MustMatchers}
import org.scalatestplus.play.guice.GuiceOneServerPerTest
import play.api.libs.ws.ahc.AhcWSClient

class BugControllerSpec extends FreeSpec with GuiceOneServerPerTest with MustMatchers with ScalaFutures {

  implicit override val patienceConfig: PatienceConfig = {
    PatienceConfig(timeout = Span(2, Seconds), interval = Span(15, Millis))
  }

  "A Action" - {

    "should work" in {
      implicit val materializer: Materializer = app.materializer

      val future = AhcWSClient().url(s"http://localhost:$port").get()

      whenReady(future) { response =>
        response.header("content-sha256").getOrElse(
          fail("content-sha256 header not found")
        ) must be (
          md.digest(response.body.getBytes("UTF-8"))
            .map("%02x" format _)
            .mkString
        )
      }
    }
  }

  val md: MessageDigest = java.security.MessageDigest.getInstance("SHA-256")
}
