package xml

import scala.xml._
import java.net._
import scala.io.Source

object Main {
	def main(args: Array[String]) {
		val yandex = new WeatherURL
		yandex.Key = "yandex"
		yandex.URL = "http://export.yandex.ru/weather-ng/forecasts/28642.xml"

		val ct = new City
		ct.City = "Челябинск"
		ct.State = "Челябинская область"
		ct.ID = 1
		ct.URLs = Nil
		ct.AddURL(yandex)
		
		val yahoo = new WeatherURL
		yahoo.Key = "yahoo"
		yahoo.URL = "http://weather.yahooapis.com/forecastrss?w=1997422&u=f"
		ct.AddURL(yahoo)
		
		
		for(t <- ct.URLs) { println(t.URL) }
		
		
	}
}



		/*
		val ya = new yandex
		val yah = new yahoo
		
		println("[YANDEX] Temperature in " + ya.City + "(" + ya.State + ") is " + ya.Temperature)

		println("[YAHOO] Temperature in " + yah.City + "(" + yah.State + ") is " + yah.Temperature)
		* 
		*/
