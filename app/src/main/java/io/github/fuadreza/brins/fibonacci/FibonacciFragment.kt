package io.github.fuadreza.brins.fibonacci

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import io.github.fuadreza.brins.databinding.FragmentFibonacciBinding
import io.github.fuadreza.brins.utils.Fibonacci

class FibonacciFragment : Fragment() {

    private var _binding: FragmentFibonacciBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFibonacciBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSubmit.setOnClickListener {
            val input = binding.edInput.text.toString()
            if (input.isNotEmpty()) {
                val list = Fibonacci.iterate(input.toInt())
                var result = ""
                list.forEachIndexed { index, i ->
                    result += i
                    if (index != list.size - 1) {
                        result += ","
                    }
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}