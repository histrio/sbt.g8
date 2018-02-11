package {{ cookiecutter.organization|lower }}.{{ cookiecutter.name|lower }}

import com.typesafe.config.ConfigFactory

object {{ cookiecutter.name }}Config {
  private val config = ConfigFactory.load()
  lazy val debug = config.getBoolean("{{ cookiecutter.name }}.debug")
}
