package com.agent.carbuyassistant.ui.preparation

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.agent.carbuyassistant.R

class PreparationFragment : Fragment() {

    companion object {
        fun newInstance() = PreparationFragment()
    }

    private lateinit var viewModel: PreparationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.preparation_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PreparationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}