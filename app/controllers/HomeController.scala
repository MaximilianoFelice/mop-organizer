package controllers

import javax.inject.{Inject, Singleton}

import com.github.tototoshi.play2.scalate._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(scalate: Scalate) extends Controller {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action {
    Ok(scalate.render("index.scaml", Map("attr1" -> "none")))
  }

}