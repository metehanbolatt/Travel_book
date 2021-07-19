package com.metehanbolat.kotlinlandmarkviewbindingcustomized

import android.os.Bundle
import android.transition.TransitionInflater
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.metehanbolat.kotlinlandmarkviewbindingcustomized.databinding.FragmentDetailsBinding

class DetailsFragment : Fragment() {

    private var _binding: FragmentDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailsBinding.inflate(inflater,container,false)
        val view = binding.root

        val selectedLandmark = MySingleton.chosenLandmark
        selectedLandmark?.let {
            binding.nameText.text = selectedLandmark.name
            binding.countryText.text = selectedLandmark.country
            binding.imageView.setImageResource(selectedLandmark.image)
            binding.detailsText.text = resources.getString(selectedLandmark.detail)
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}