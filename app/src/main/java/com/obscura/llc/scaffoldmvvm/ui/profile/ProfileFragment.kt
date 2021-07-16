package com.obscura.llc.scaffoldmvvm.ui.profile

import android.view.LayoutInflater
import android.view.ViewGroup
import com.obscura.llc.scaffoldmvvm.base.BaseFragment
import com.obscura.llc.scaffoldmvvm.base.BaseViewModel
import com.obscura.llc.scaffoldmvvm.databinding.FragmentProfileBinding

class ProfileFragment : BaseFragment<FragmentProfileBinding>() {

    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentProfileBinding
        get() = FragmentProfileBinding::inflate

    override fun getVM(): BaseViewModel? {
        return null
    }

    override fun setupView(binder: FragmentProfileBinding) {
        with(binder) {
            btnTest.setOnClickListener {

            }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = ProfileFragment()
    }

}