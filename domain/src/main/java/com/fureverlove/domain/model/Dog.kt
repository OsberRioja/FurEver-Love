package com.fureverlove.domain.model

data class Dog(
    val id: String,
    val name: String,
    val age: Int,
    val breed: String,
    val images: List<String>,
    val healthStatus: String,
    val vaccinated: Boolean,
    val personality: String,
    val availableFor: List<String>, // Ej.: ["cruce", "socializacion"]
    val location: String,
    val pedigree: Boolean
)