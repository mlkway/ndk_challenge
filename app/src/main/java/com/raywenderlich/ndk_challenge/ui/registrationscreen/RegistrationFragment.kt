package com.raywenderlich.ndk_challenge.ui.registrationscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.raywenderlich.ndk_challenge.databinding.RegistrationFragmentBinding

class RegistrationFragment : Fragment() {



    private var binding: RegistrationFragmentBinding? = null

    private val viewModel: RegistrationViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        if (binding == null){
            binding = RegistrationFragmentBinding.inflate(inflater,container,false)
            start()
        }


        return binding?.root
    }


    private fun start(){
        binding?.button2?.setOnClickListener {
            if (checkEditTexts()){
                Toast.makeText(requireContext(), "fill all fields and password must contain 6 characters", Toast.LENGTH_SHORT).show()
            }else{
                var email = binding?.editTextRegistrationEmail?.text.toString()
                var password = binding?.editTextRegistrationPassword?.text.toString()
                viewModel.registration(email,password)

            }
        }
    }

    private fun checkEditTexts():Boolean{
        return binding?.editTextRegistrationEmail?.text.isNullOrBlank() &&
                binding?.editTextRegistrationPassword?.text.isNullOrBlank() &&
                binding?.editTextRegistrationPassword?.text?.length!! >= 6

    }




}