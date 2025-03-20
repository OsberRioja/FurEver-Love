package com.fureverlove.data.remote

import com.fureverlove.domain.model.Dog

class FakeApi {
    suspend fun fetchDogs(): List<Dog> {
        // Simulación de datos, en un futuro conectar con una API real o base de datos
        return listOf(
            Dog(
                "1",
                "Max",
                3,
                "Labrador",
                listOf("url1", "url2"),
                "Sano",
                true,
                "Juguetón",
                listOf("cruce"),
                "Ciudad A",
                true
            ),
            Dog(
                "2",
                "Bella",
                2,
                "Bulldog",
                listOf("url3"),
                "Sano",
                true,
                "Tranquilo",
                listOf("socializacion"),
                "Ciudad B",
                false
            )
        )
    }

    suspend fun likeDog(dogId: String) {
        // Simulación de acción
    }

    suspend fun dislikeDog(dogId: String) {
        // Simulación de acción
    }

}