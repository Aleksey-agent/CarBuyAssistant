package com.agent.carbuyassistant.ui.electrical

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.agent.carbuyassistant.R

class ElectricalFragment : Fragment() {

    companion object {
        fun newInstance() = ElectricalFragment()
    }

    private lateinit var viewModel: ElectricalViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.electrical_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ElectricalViewModel::class.java)
        // TODO: Use the ViewModel
    }

}