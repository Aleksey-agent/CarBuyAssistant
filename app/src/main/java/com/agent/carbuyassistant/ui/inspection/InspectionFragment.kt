package com.agent.carbuyassistant.ui.inspection

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.agent.carbuyassistant.R

class InspectionFragment : Fragment() {

    companion object {
        fun newInstance() = InspectionFragment()
    }

    private lateinit var viewModel: InspectionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.inspection_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(InspectionViewModel::class.java)
        // TODO: Use the ViewModel
    }

}