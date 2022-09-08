package com.orionedutechfsm.features.weather.api

import com.orionedutechfsm.features.task.api.TaskApi
import com.orionedutechfsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}