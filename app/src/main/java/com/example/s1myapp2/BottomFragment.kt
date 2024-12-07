package com.example.s1myapp2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import com.example.s1myapp2.databinding.FragmentBottomBinding


class BottomFragment : Fragment() {
    private lateinit var binding: FragmentBottomBinding
    val args: BottomFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //   return inflater.inflate(R.layout.fragment_bottom, container, false)
        binding = FragmentBottomBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        arguments?.let {
//            val name = it.getString("name") ?: ""
//            binding.tvName.text = name
//        }
        args.name.let {
            binding.tvName.text = it
        }
    }

    fun getData(name: String) {
        //   Toast.makeText(requireContext(), "$name", Toast.LENGTH_SHORT).show()
        //  binding.tvName.text = name
    }

    companion object {
        fun newInstance(name: String): BottomFragment {
//            val bottomFragment = BottomFragment()
//            val bundle = Bundle()
//            bundle.putString("name", name)
//            bottomFragment.arguments = bundle
//            return bottomFragment
            return  BottomFragment().apply{
                arguments = Bundle().apply {
                    putString("name",name)
                }
            }
        }
    }
}
/*
1- create Bundle
2- put String into bundle
3- put bundle into fragment

4- get bundle from fragment
5- get String from bundle
6- set String to TextView
 */

/*
Scoped function
1- let
2-apply
 */