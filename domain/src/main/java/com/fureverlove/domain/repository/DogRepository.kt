package com.fureverlove.domain.repository
import com.fureverlove.domain.model.Dog

interface DogRepository {
    suspend fun getNearbyDogs(): List<Dog>
    suspend fun likeDog(dogId: String)
    suspend fun dislikeDog(dogId: String)
}
