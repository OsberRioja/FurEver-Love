package com.fureverlove.domain.usecase

import com.fureverlove.domain.repository.DogRepository

class LikeDogUseCase(private val repository: DogRepository) {
    suspend operator fun invoke(dogId: String) = repository.likeDog(dogId)
}