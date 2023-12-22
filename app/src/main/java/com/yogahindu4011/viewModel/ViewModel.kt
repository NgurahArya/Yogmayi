package com.yogahindu4011.viewModel

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.yogahindu4011.data.PreferencesKeys
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

class YogaViewModel(
    private val datastore: DataStore<Preferences>
): ViewModel(){
    val nameFlow: Flow<
            String?> = datastore.data.map { preferences ->
        preferences[PreferencesKeys.NAME]
    }

    fun saveName(name: String){
        viewModelScope.launch (Dispatchers.IO) {
            datastore.edit { preferences ->
                preferences[PreferencesKeys.NAME] = name
            }
        }
    }
}


class YogaViewModelFactory(
    private val datastore: DataStore<Preferences>
): ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return YogaViewModel(
            datastore
        )as T
    }
}