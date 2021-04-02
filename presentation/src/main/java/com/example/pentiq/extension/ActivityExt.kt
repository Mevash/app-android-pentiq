package com.example.pentiq.extension

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentActivity
import com.example.pentiq.ui.loading.LoadingDialogFragment

fun FragmentActivity.showLoadingIndicator() {
    val spinnerDialogFragment = LoadingDialogFragment.newInstance()
    spinnerDialogFragment.show(supportFragmentManager, spinnerDialogFragment::class.java.simpleName)
}

fun FragmentActivity.dismissLoadingIndicator() {
    dismissDialogFragmentByTag(LoadingDialogFragment::class.java.simpleName)
}

private fun FragmentActivity.dismissDialogFragmentByTag(tag: String) {
    supportFragmentManager.findFragmentByTag(tag)?.let { (it as? DialogFragment)?.dismiss() }
}