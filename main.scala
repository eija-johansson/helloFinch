
import com.twitter.finagle.{Http, http}
import com.twitter.util.Await
import io.finch._
import io.finch.circe._
import io.circe.generic.auto._
import io.circe.{Encoder, Json}
import io.circe.jackson._

object Main extends App {

  val hello: Endpoint[String] = / {Ok("Hello2")} 
 
  val service = hello.toService

  Await.ready(Http.server.serve(":8081", service))
}
