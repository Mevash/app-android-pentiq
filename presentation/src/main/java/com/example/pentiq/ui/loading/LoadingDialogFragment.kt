package com.example.pentiq.ui.loading

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.pentiq.R
import com.example.pentiq.databinding.DialogFragmentLoadingBinding

class LoadingDialogFragment : DialogFragment() {

    lateinit var binding: DialogFragmentLoadingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NO_FRAME, R.style.LoadingDialog)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DialogFragmentLoadingBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dialog?.run {
            setCanceledOnTouchOutside(false)
            isCancelable = false
        }
    }

    companion object {
        fun newInstance() = LoadingDialogFragment()
    }
}