package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Redirect(routes.Products.list())

//    Ok(views.html.index("Your new application is ready."))
  }

}