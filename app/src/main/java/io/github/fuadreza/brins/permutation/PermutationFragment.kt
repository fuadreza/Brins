package io.github.fuadreza.brins.permutation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import io.github.fuadreza.brins.R
import io.github.fuadreza.brins.databinding.FragmentPermutationBinding
import io.github.fuadreza.brins.utils.Permutation

class PermutationFragment : Fragment() {

    private var _binding: FragmentPermutationBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPermutationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSubmit.setOnClickListener {
            val n = binding.edFirstInput.text.toString()
            val r = binding.edSecondInput.text.toString()
            if(n.isNotEmpty() && r.isNotEmpty()){
                binding.tvResult.text = Permutation.calculate(n.toInt(),r.toInt()).toString()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}