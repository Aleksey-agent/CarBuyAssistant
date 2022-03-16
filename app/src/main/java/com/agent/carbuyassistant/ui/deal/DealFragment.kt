package com.agent.carbuyassistant.ui.deal

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.agent.carbuyassistant.R

class DealFragment : Fragment() {

    companion object {
        fun newInstance() = DealFragment()
    }

    private lateinit var viewModel: DealViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.deal_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DealViewModel::class.java)
        // TODO: Use the ViewModel
    }

}