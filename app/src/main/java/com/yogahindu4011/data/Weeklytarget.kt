/*package com.yogahindu4011.data

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.first

object Weeklytarget {

    private val Context.dataStore by preferencesDataStore("yoga_hindu_app")

    data class Preferences(
        val weeklyTarget: Int = 0
    )

    suspend fun saveWeeklyTarget(context: Context, value: Int){
        context.dataStore.edit { preferences ->
            preferences[KEY_WEEKLY_TARGET] = value
        }
    }

    suspend fun getWeeklyTarget(context: Context){
        val preferences = context.dataStore.data.first()
        return preferences[KEY_WEEKLY_TARGET] ?: 0
    }

    private const val KEY_WEEKLY_TARGET = "weekly_target"
}*/
