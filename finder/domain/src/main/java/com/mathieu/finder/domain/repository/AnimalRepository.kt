package com.mathieu.finder.domain.repository

import com.mathieu.finder.domain.model.Animal

interface AnimalRepository {
  suspend fun getAnimals(): List<Animal>
}