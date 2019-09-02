package com.example.latihanjetpack

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonWelcomeMe.setOnClickListener {
            val name = enterName.text.toString()
            if (TextUtils.isEmpty(name)){
                enterName.error = "Please input a valid name"
            }else{
                val action = MainFragmentDirections.actionMainFragmentToDestinationFragment()
                action.nameToShow = name
                findNavController().navigate(action)
            }
        }
    }
}