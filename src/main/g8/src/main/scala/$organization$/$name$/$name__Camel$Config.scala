package $organization$.$name;format="norm,word"$

import com.typesafe.config.ConfigFactory

object $name;format="Camel"$Config {
  private val config = ConfigFactory.load()
  lazy val debug = config.getBoolean("$name;format="norm,word"$.debug")
}
