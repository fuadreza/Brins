package io.github.fuadreza.brins.anagram

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import io.github.fuadreza.brins.R
import io.github.fuadreza.brins.databinding.FragmentAnagramBinding
import io.github.fuadreza.brins.utils.isAnagramOf

class AnagramFragment : Fragment() {

    private var _binding: FragmentAnagramBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAnagramBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSubmit.setOnClickListener {
            val first = binding.edFirstInput.text.toString()
            val second = binding.edSecondInput.text.toString()
            if(first.isNotEmpty() && second.isNotEmpty()) {
                binding.label.text = "IS $first ANAGRAM OF $second"
                binding.tvResult.text = "${ first.isAnagramOf(second) }"
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}