package xml

import scala.xml._
import java.net._
import scala.io.Source

object Main {
	def main(args: Array[String]) {
		
		testapi
		
	}
	
	def testapi = {
		var yandex = new WeatherURL
		yandex.Key = "yandex"
		yandex.URL = "http://export.yandex.ru/weather-ng/forecasts/28642.xml"

		val ct = new City
		ct.City = "Chelyabinsk"
		ct.State = "Ural"
		ct.ID = 1
		ct.URLs = Nil
		ct.AddURL(yandex)
		
		yandex = new WeatherURL
		yandex.Key = "yahoo"
		yandex.URL = "http://weather.yahooapis.com/forecastrss?w=1997422&u=f"
		ct.AddURL(yandex)
		
		for(t <- ct.URLs) { println(t.URL) }
		
		val xmlOut = ct.city2XML
		println(xmlOut)
		
		scala.xml.XML.save("c:/4e1.xml", xmlOut)
	}
	
}
