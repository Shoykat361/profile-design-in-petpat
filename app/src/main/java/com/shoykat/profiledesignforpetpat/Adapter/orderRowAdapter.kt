package com.shoykat.profiledesignforpetpat.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.shoykat.profiledesignforpetpat.RowDb
import com.shoykat.profiledesignforpetpat.databinding.OrderowBinding


class orderRowAdapter :ListAdapter<RowDb,orderRowAdapter.OrderRowViewholder>(OrderRowDifutil()) {



    class OrderRowViewholder(val binding:OrderowBinding):
        RecyclerView.ViewHolder(binding.root){
        fun bind(details: RowDb){
            binding.detais=details

        }
    }

    class OrderRowDifutil : DiffUtil.ItemCallback<RowDb>(){
        override fun areItemsTheSame(oldItem: RowDb, newItem: RowDb): Boolean {
            return oldItem.id==newItem.id
        }

        override fun areContentsTheSame(oldItem: RowDb, newItem: RowDb): Boolean {
            return oldItem==newItem
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderRowViewholder {
        val binding=OrderowBinding.
        inflate(LayoutInflater.from(parent.context),parent,false)
        return OrderRowViewholder(binding)
    }

    override fun onBindViewHolder(holder: OrderRowViewholder, position: Int) {
        val row=getItem(position)
        holder.bind(row)
    }
}


