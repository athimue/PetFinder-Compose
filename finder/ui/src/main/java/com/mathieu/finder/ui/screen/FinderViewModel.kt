package com.mathieu.finder.ui.screen

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mathieu.finder.domain.model.Animal
import com.mathieu.finder.domain.usecase.GetAnimalsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FinderViewModel
    @Inject
    constructor(
        getAnimalsUseCase: GetAnimalsUseCase,
    ) : ViewModel() {

        var animals by mutableStateOf<List<Animal>?>(null)

        init {
            viewModelScope.launch {
                val result = getAnimalsUseCase()
                Log.d("COUCOU", result.toString())
                animals = getAnimalsUseCase()
            }
        }
    }
