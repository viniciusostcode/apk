package com.example.voteintention.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.voteintention.databinding.FragmentAcceptionByAgeBinding
import com.example.voteintention.viewmodel.AcceptionByGenderViewModel

class AcceptionByAgeFragment : Fragment() {
    private lateinit var bind:FragmentAcceptionByAgeBinding
    private lateinit var viewModel:AcceptionByGenderViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bind = FragmentAcceptionByAgeBinding.inflate(inflater, container, false)
        return bind.root
    }

    private fun initComponents(){

    }
}