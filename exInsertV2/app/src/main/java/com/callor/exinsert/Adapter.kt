package com.callor.exinsert

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.callor.exinsert.databinding.FragmentHomeBinding
import com.callor.exinsert.model.Board
import com.callor.exinsert.ui.home.HomeViewModel

class Adapter : ListAdapter<Board, RecyclerView.ViewHolder>(diffUtil) {

    companion object{
        val diffUtil=object:DiffUtil.ItemCallback<Board>(){
            override fun areItemsTheSame(oldItem: Board, newItem: Board): Boolean {
                return oldItem.author == oldItem.author
            }

            override fun areContentsTheSame(oldItem: Board, newItem: Board): Boolean {
                return oldItem == newItem
            }

        }
    }

    inner class ItemViewHolder(
        itemView: View
    ) :
        RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}