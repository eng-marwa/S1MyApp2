package com.example.s1myapp2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.s1myapp2.databinding.FragmentTopBinding

class TopFragment : Fragment() {

    private lateinit var binding: FragmentTopBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_top, container, false)
        binding = FragmentTopBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val btn = view.findViewById<Button>(R.id.btnSubmit)
        binding.btnSubmit.setOnClickListener {
            val name = binding.etName.text.toString()
            if (activity is MainActivity) {
                val mainActivity = activity as MainActivity
                mainActivity.getData(name)
            } else if (activity is SecondActivity) {
                val secondActivity = activity as SecondActivity
                secondActivity.getData(name)
            } else {
//                val bundle = Bundle().apply {
//                    putString("name",name)
//                }
//                findNavController().navigate(R.id.action_navigation_top_to_navigation_bottom, bundle)

                val direction = TopFragmentDirections.actionNavigationTopToNavigationBottom2(name)
                findNavController().navigate(direction)
            }
            binding.etName.text.clear()
        }
    }

}