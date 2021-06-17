package com.raywenderlich.ndk_challenge.ui.profile

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.raywenderlich.ndk_challenge.R
import com.raywenderlich.ndk_challenge.databinding.ProfileScreenFragmentBinding

class ProfileScreen : Fragment() {



    private var binding: ProfileScreenFragmentBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        if (binding == null){
            binding = ProfileScreenFragmentBinding.inflate(inflater,container,false)
        }
        return binding?.root
    }





}