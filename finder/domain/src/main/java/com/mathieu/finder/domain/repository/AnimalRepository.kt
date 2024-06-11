package com.athimue.domain.repository

import com.mathieu.finder.domain.model.Animal

interface AnimalRepository {
  suspend fun getAnimals(): List<Animal>
}