package com.raywenderlich.ndk_challenge.ui.loginscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.raywenderlich.ndk_challenge.R
import com.raywenderlich.ndk_challenge.databinding.LoginScreenFragmentBinding

class LoginScreenFragment : Fragment() {


    private  var binding: LoginScreenFragmentBinding? = null


    private val viewModel: LoginScreenViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        if (binding == null){
            binding = LoginScreenFragmentBinding.inflate(inflater,container,false)
        }
        start()
        click()
        return binding?.root
    }

    private fun click(){
        binding?.textView3?.setOnClickListener {
            findNavController().navigate(R.id.action_loginScreenFragment_to_registrationFragment)
        }
    }


    private fun start(){
        binding?.button?.setOnClickListener {
            if (checkEditTexts()){
                Toast.makeText(requireContext(), "fill all fields and password must contain 6 characters", Toast.LENGTH_SHORT).show()
            }else{
                var email = binding?.editTextTextEmailAddress?.text.toString().trim()
                var password = binding?.editTextTextPassword?.text.toString().trim()
                viewModel.login(email,password)

            }
        }
    }

    private fun checkEditTexts():Boolean{
        return binding?.editTextTextEmailAddress?.text.isNullOrBlank() &&
                binding?.editTextTextPassword?.text.isNullOrBlank() &&
                binding?.editTextTextPassword?.text?.length!! >= 6

    }


}