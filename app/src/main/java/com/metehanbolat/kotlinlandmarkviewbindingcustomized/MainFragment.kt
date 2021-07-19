package com.metehanbolat.kotlinlandmarkviewbindingcustomized

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.metehanbolat.kotlinlandmarkviewbindingcustomized.databinding.FragmentDetailsBinding
import com.metehanbolat.kotlinlandmarkviewbindingcustomized.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    private lateinit var landmarkList: ArrayList<Landmark>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater,container,false)
        val view = binding.root

        landmarkList = ArrayList()

        val pisa = Landmark("Pisa","Italy",R.drawable.pisa,R.string.pisa)
        val colosseum = Landmark("Colosseum","Italy",R.drawable.coleseum,R.string.colosseum)
        val eiffel = Landmark("Eiffel","France",R.drawable.eiffel,R.string.eiffel)
        val londonBridge = Landmark("London Bridge","UK",R.drawable.london,R.string.londonBridge)
        val ayasofya = Landmark("Ayasofya","Turkey",R.drawable.ayasofya,R.string.ayasofya)
        val isa = Landmark("Cristo Redentor","Brazil",R.drawable.isa,R.string.isa)
        val katedral = Landmark("Duomo di Milano","Italy",R.drawable.katedral,R.string.katedral)
        val tacmahal = Landmark("Tac Mahal","India",R.drawable.tacmahal,R.string.tacmahal)
        val piramit = Landmark("Pyramids", "Egypt", R.drawable.piramit,R.string.piramit)
        val anitkabir = Landmark("Anıtkabir","Turkey",R.drawable.anit,R.string.anitkabir)
        val bagan = Landmark("Bagan","Myanmar",R.drawable.bagan,R.string.bagan)
        val montsaint = Landmark("Mont Saint Michel","France",R.drawable.montsaint,R.string.montsaint)
        val singapur = Landmark("Singapur","Singapur",R.drawable.singapur,R.string.singapur)
        val petra = Landmark("Petra","Jordan",R.drawable.petra,R.string.petra)
        val venedik = Landmark("Venedik","Italy",R.drawable.venedi,R.string.venedik)

        landmarkList.add(eiffel)
        landmarkList.add(ayasofya)
        landmarkList.add(isa)
        landmarkList.add(katedral)
        landmarkList.add(tacmahal)
        landmarkList.add(colosseum)
        landmarkList.add(piramit)
        landmarkList.add(anitkabir)
        landmarkList.add(bagan)
        landmarkList.add(londonBridge)
        landmarkList.add(montsaint)
        landmarkList.add(singapur)
        landmarkList.add(petra)
        landmarkList.add(pisa)
        landmarkList.add(venedik)

        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}