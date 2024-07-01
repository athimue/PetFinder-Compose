package com.mathieu.finder.domain.usecase

import com.mathieu.finder.domain.repository.AnimalRepository
import javax.inject.Inject

class GetAnimalsUseCase

    @Inject
    constructor(
        private val animalRepository: AnimalRepository,
    ) {
        suspend operator fun invoke() = animalRepository.getAnimals()
    }
