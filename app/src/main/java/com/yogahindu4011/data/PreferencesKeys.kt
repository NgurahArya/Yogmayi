package com.yogahindu4011.data

import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey

object PreferencesKeys {
    val NAME = stringPreferencesKey("name")
    val TARGET = intPreferencesKey("target")
    val SCORE = intPreferencesKey("score")
}