package com.metehanbolat.kotlinlandmarkviewbindingcustomized

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.recyclerview.widget.RecyclerView
import com.metehanbolat.kotlinlandmarkviewbindingcustomized.databinding.RecyclerRowBinding

class LandmarkAdapter(private val landmarkList: ArrayList<Landmark>): RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>() {

    class LandmarkHolder(val binding: RecyclerRowBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return LandmarkHolder(binding)
    }

    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {
        holder.binding.textViewRecycler.text = landmarkList[position].name
        holder.binding.imageViewRecycler.setImageResource(landmarkList[position].image)

        holder.itemView.setOnClickListener {
            MySingleton.chosenLandmark = landmarkList[position]
            it.findNavController().navigate(R.id.action_mainFragment_to_detailsFragment)

        }
    }

    override fun getItemCount(): Int {
        return landmarkList.size
    }
}