package xml

class City {
	private[this] var _id: Int = 0 
	private[this] var _city: String = ""
	private[this] var _state: String = ""

	var URLs: List[WeatherURL] = Nil
	
	def ID = _id
	def ID_=(CityID: Int) = { _id = if (CityID != 0) CityID else 0 }

	def City = _city
	def City_=(CityName: String) = { _city = if (CityName != 0) CityName else "" }

	def State = _state
	def State_=(StateName: String) = { _state = if (StateName != 0) StateName else "" }

	def AddURL(URL: WeatherURL) = { URLs = URL :: URLs }
}
