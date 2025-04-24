package com.fureverlove.framework

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
import com.fureverlove.domain.model.Dog
import com.fureverlove.tinderdogs.databinding.ItemDogCardBinding


class SwipeAdapter(
    private var dogs: List<Dog>,
    private val onLike: (String) -> Unit,
    private val onDislike: (String) -> Unit
) : RecyclerView.Adapter<SwipeAdapter.DogViewHolder>() {

    inner class DogViewHolder(private val binding: ItemDogCardBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(dog: Dog) {
            binding.textName.text = dog.name
            // Configura imagen, personalidad, etc.
            binding.buttonLike.setOnClickListener { onLike(dog.id) }
            binding.buttonDislike.setOnClickListener { onDislike(dog.id) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val binding = ItemDogCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DogViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        holder.bind(dogs[position])
    }

    override fun getItemCount(): Int = dogs.size

    fun updateData(newDogs: List<Dog>) {
        dogs = newDogs
        notifyDataSetChanged()
    }
}