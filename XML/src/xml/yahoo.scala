package xml

import scala.xml._
import java.net._
import scala.io.Source

class yahoo {
	val theUrl = "http://weather.yahooapis.com/forecastrss?w=2391279&u=f"
	val xmlString = Source.fromURL(new URL(theUrl)).mkString
	val xml = XML.loadString(xmlString)

	val city = xml \\ "location" \\ "@city"
	val state = xml \\ "location" \\ "@region"
	val temperature = xml \\ "condition" \\ "@temp"
	
	def City: String = city.toString()
	def State: String = state.toString()
	def Temperature: String = temperature.toString()
}