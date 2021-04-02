package com.example.pentiq.ui.alarm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pentiq.databinding.FragmentScheduledAlarmsBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class ScheduledAlarmsFragment : Fragment() {

    private lateinit var binding: FragmentScheduledAlarmsBinding
    private val scheduledAlarmsViewModel: ScheduledAlarmsViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentScheduledAlarmsBinding.inflate(layoutInflater)
        binding.presenter = ScheduledAlarmsPresenter(this, binding, scheduledAlarmsViewModel)
        binding.viewModel = scheduledAlarmsViewModel
        binding.lifecycleOwner = this
        return binding.root
    }

}