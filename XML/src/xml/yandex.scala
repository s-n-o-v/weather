package xml

import scala.xml._
import java.net._
import scala.io.Source

class yandex {
	val cityID = 28642
	val theUrl = "http://export.yandex.ru/weather-ng/forecasts/28642.xml"
	val xmlString = Source.fromURL(new URL(theUrl)).mkString
	val xml = { 
		XML.loadString(xmlString)
	}

	val city = xml \\ "@slug"
	val state = xml \\ "@part"
	val temperature = (xml \ "fact" \\ "temperature").text
	
	def City: String = city.toString()
	def State: String = state.toString()
	def Temperature: String = temperature.toString()
}