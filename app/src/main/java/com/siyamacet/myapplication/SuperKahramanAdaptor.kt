package com.siyamacet.myapplication

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.siyamacet.myapplication.databinding.RecyclerRowBinding

class SuperKahramanAdaptor(val superKahramanListesi: ArrayList<SuperKahraman>) :
    RecyclerView.Adapter<SuperKahramanAdaptor.SuperKahramanViewHolder>() {

    class SuperKahramanViewHolder(val binding: RecyclerRowBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanViewHolder {

        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SuperKahramanViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return superKahramanListesi.size
    }

    override fun onBindViewHolder(holder: SuperKahramanViewHolder, position: Int) {

        holder.binding.textViewRecyclerView.text = superKahramanListesi[position].isim
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, TanitimAktivitesi::class.java)
            intent.putExtra("secilenKahraman", superKahramanListesi[position])
            holder.itemView.context.startActivity(intent)


        }
    }
}