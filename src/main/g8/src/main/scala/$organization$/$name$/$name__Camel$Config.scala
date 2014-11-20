package $organization$.$name;format="norm,word"$

import com.typesafe.config.ConfigFactory

object GiflectionConfig {
  private val config = ConfigFactory.load()
  lazy val debug = config.getString("$name;format="norm,word"$.debug")
}
