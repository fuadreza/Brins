package io.github.fuadreza.brins.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import io.github.fuadreza.brins.R
import io.github.fuadreza.brins.databinding.FragmentFirstBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnFibonacci.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_FibonacciFragment)
        }
        binding.btnAnagram.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_AnagramFragment)
        }
        binding.btnPermutation.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_PermutationFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}