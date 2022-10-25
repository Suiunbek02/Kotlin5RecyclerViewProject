package com.example.kotlin5recyclerviewproject.ui.mainrecycler


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kotlin5recyclerviewproject.databinding.ItemFilmBinding
import com.example.kotlin5recyclerviewproject.ui.data.FilmModel

class FilmAdapter(private var filmList: List<FilmModel> = ArrayList()) :
    RecyclerView.Adapter<FilmAdapter.ViewHolder>() {

    class ViewHolder(private val binding: ItemFilmBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: FilmModel) {
            binding.tvText.text = model.filmName
            Glide.with(binding.imageFilm.context).load(model.filmImage).into(binding.imageFilm)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(
        ItemFilmBinding.inflate(LayoutInflater.from(parent.context),parent,false)
       )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(filmList[position])
    }

    override fun getItemCount(): Int = filmList.size
}