package com.orionedutechfsm.features.weather.api

import com.orionedutechfsm.base.BaseResponse
import com.orionedutechfsm.features.task.api.TaskApi
import com.orionedutechfsm.features.task.model.AddTaskInputModel
import com.orionedutechfsm.features.weather.model.ForeCastAPIResponse
import com.orionedutechfsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}