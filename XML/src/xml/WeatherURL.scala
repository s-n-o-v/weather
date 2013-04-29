package xml

class WeatherURL {
	private[this] var _Key: String = ""
	private[this] var _URL: String = ""
	
	def Key = _Key
	def Key_=(weatherKey: String) = { _Key = if (weatherKey != 0) weatherKey else "" }

	def URL = _URL
	def URL_=(weatherURL: String) = { _URL = if (weatherURL != 0) weatherURL else "" }
	
	def toXML() = <URL name={ "" + _Key + "" }>{ _URL }</URL>
	
}