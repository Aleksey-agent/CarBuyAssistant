package com.agent.carbuyassistant.ui.external

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.agent.carbuyassistant.R

class ExternalFragment : Fragment() {

    companion object {
        fun newInstance() = ExternalFragment()
    }

    private lateinit var viewModel: ExternalViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.external_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ExternalViewModel::class.java)
        // TODO: Use the ViewModel
    }

}