package com.obscura.llc.scaffoldmvvm.ui.notification

import android.view.LayoutInflater
import android.view.ViewGroup
import com.obscura.llc.scaffoldmvvm.base.BaseFragment
import com.obscura.llc.scaffoldmvvm.base.BaseViewModel
import com.obscura.llc.scaffoldmvvm.databinding.FragmentNotificationBinding

class NotificationFragment : BaseFragment<FragmentNotificationBinding>() {

    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentNotificationBinding
        get() = FragmentNotificationBinding::inflate

    override fun getVM(): BaseViewModel? {
        return null
    }

    override fun setupView(binder: FragmentNotificationBinding) {

    }

    companion object {
        @JvmStatic
        fun newInstance() = NotificationFragment()
    }
}