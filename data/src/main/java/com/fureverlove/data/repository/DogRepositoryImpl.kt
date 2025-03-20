package com.fureverlove.data.repository

import com.fureverlove.data.remote.FakeApi
import com.fureverlove.domain.model.Dog
import com.fureverlove.domain.repository.DogRepository

class DogRepositoryImpl(private val api: FakeApi) : DogRepository {
    override suspend fun getNearbyDogs(): List<Dog> = api.fetchDogs()

    override suspend fun likeDog(dogId: String) {
        api.likeDog(dogId)
    }

    override suspend fun dislikeDog(dogId: String) {
        api.dislikeDog(dogId)
    }
}