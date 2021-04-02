package com.example.pentiq.ui.quote

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pentiq.databinding.FragmentQuoteBinding

class QuoteFragment : Fragment() {

    private lateinit var binding: FragmentQuoteBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentQuoteBinding.inflate(layoutInflater)
        return binding.root
    }
}