package {{ cookiecutter.organization }}.{{ cookiecutter.name }}

import com.typesafe.scalalogging._
import org.slf4j.LoggerFactory

object {{ cookiecutter.name }}App extends App {
  private val logger = Logger(LoggerFactory.getLogger(this.getClass))
  println("Hello world!")
  if ({{ cookiecutter.name }}Config.debug){
    logger.debug(s"")
  }
}
