package com.example.weatherapp.Repository

import com.example.weatherapp.Server.ApiServices

class WeatherRepository(val api: ApiServices) {
    fun getCurrentWeather(lat:Double,lng:Double,unit:String)=
        api.getCurrentWeather(lat,lng,unit,"dccf533766afd38983675b4d290fbb71")

    fun getForecastWeather(lat:Double,lng:Double,unit:String)=
        api.getForecastWeather(lat,lng,unit,"dccf533766afd38983675b4d290fbb71")
}