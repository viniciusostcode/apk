package com.example.voteintention.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.voteintention.R
import com.example.voteintention.databinding.FragmentAcceptionByGenderBinding
import com.example.voteintention.viewmodel.AcceptionByGenderViewModel
import java.util.*

class AcceptionByGenderFragment : Fragment() {

    private lateinit var bind: FragmentAcceptionByGenderBinding
    private lateinit var viewModel: AcceptionByGenderViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bind = FragmentAcceptionByGenderBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this)
            .get(AcceptionByGenderViewModel::class.java)

        viewModel.initViewModel("m")
        initComponents()
        return bind.root
    }

    private fun initComponents(){
        viewModel.acceptanceAndRejection.observe(viewLifecycleOwner,{
            bind.textGender.text = if(it.gender!!.lowercase(Locale.getDefault()) == "m") "Maculino" else "Feminino"
            bind.textAceitacaoGender.text =
                bind.textAceitacaoGender.text.toString().plus(it.acceptanceAndRejection?.positiveVotingIntention.toString())
            bind.textNegacaoGender.text =
                bind.textNegacaoGender.text.toString().plus(it.acceptanceAndRejection?.negativeVotingIntention.toString())
            bind.textAceitacaoPorcentagemGender.text =
                bind.textAceitacaoPorcentagemGender.text.toString().plus(it.acceptanceAndRejection?.acceptance.toString())
            bind.textNegacaoPorcentagemGender.text =
                bind.textNegacaoPorcentagemGender.text.toString().plus(it.acceptanceAndRejection?.rejection.toString())
        })
    }
}