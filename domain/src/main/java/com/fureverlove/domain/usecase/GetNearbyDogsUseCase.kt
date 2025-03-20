package com.fureverlove.domain.usecase

import com.fureverlove.domain.model.Dog
import com.fureverlove.domain.repository.DogRepository

class GetNearbyDogsUseCase(private val repository: DogRepository) {
    suspend operator fun invoke(): List<Dog> = repository.getNearbyDogs()
}