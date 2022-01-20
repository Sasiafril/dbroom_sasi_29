package com.example.dbroom_sasi_29

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dbroom_sasi_29.room.Movie
import kotlinx.android.synthetic.main.adapter_main.view.*

class MovieAdapter (var movies: ArrayList<Movie>, var listener: OnAdapterListener) :
    RecyclerView.Adapter<MovieAdapter.MovieViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(
                    R.layout.adapter_main,
                    parent,
                    false
                )
        )
    }

    override fun getItemCount() = movies.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position]
        holder.view.text_title.text = movie.tite
        holder.view.text_title.setOnClickListener {
            listener.onClick(movie)
        }
        holder.view.icon_edit.setOnClickListener {
            listener.onUpdate(movie)
        }
        holder.view.icon_delete.setOnClickListener {
            listener.onDelete(movie)
        }
    }

    class MovieViewHolder(val view: View) : RecyclerView.ViewHolder(view)

    fun setData(newList: List<Movie>) {
        movies.clear()
        movies.addAll(newList)
    }

    interface OnAdapterListener {
        fun onClick(movie: Movie)
        fun onUpdate(movie: Movie)
        fun onDelete(movie: Movie)
    }
}