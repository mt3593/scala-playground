import spray.json.DefaultJsonProtocol

object Models {
  case class Customer(name: String)
  object ServiceJsonProtoocol extends DefaultJsonProtocol {
    implicit val customerProtocol = jsonFormat1(Customer)
  }
}

