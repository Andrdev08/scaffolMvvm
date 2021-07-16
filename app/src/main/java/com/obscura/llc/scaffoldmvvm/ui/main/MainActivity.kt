package com.obscura.llc.scaffoldmvvm.ui.main

import android.view.LayoutInflater
import com.obscura.llc.scaffoldmvvm.R
import com.obscura.llc.scaffoldmvvm.base.BaseActivity
import com.obscura.llc.scaffoldmvvm.databinding.ActivityMainBinding
import com.obscura.llc.scaffoldmvvm.ui.home.HomeFragment
import com.obscura.llc.scaffoldmvvm.ui.notification.NotificationFragment
import com.obscura.llc.scaffoldmvvm.ui.profile.ProfileFragment
import com.obscura.llc.scaffoldmvvm.utils.Constants
import com.obscura.llc.scaffoldmvvm.utils.viewpager.ViewPagerAdapter

class MainActivity: BaseActivity<ActivityMainBinding>() {

    override val inflater: (LayoutInflater) -> ActivityMainBinding
        get() = ActivityMainBinding::inflate

    override fun setupView(binder: ActivityMainBinding) {
        setupTabs()
        setupBottomNavigation()
    }

    private fun setupTabs() = with(ViewPagerAdapter(supportFragmentManager)) {
        add(HomeFragment.newInstance(), getString(R.string.tab_home))
        add(NotificationFragment.newInstance(), getString(R.string.tab_notification))
        add(ProfileFragment.newInstance(), getString(R.string.tab_profile))
        binding.viewPager.offscreenPageLimit = Constants.UI.HOME_TAB_COUNT
        binding.viewPager.adapter = this
    }

    private fun setupBottomNavigation() = binding.bottomNav.setOnNavigationItemSelectedListener {
        when (it.itemId) {
            R.id.navHome -> {
                binding.viewPager.currentItem = 0
                return@setOnNavigationItemSelectedListener true
            }
            R.id.navNotification -> {
                binding.viewPager.currentItem = 1
                return@setOnNavigationItemSelectedListener true
            }
            R.id.navProfile -> {
                binding.viewPager.currentItem = 2
                return@setOnNavigationItemSelectedListener true
            }
            else -> {
                return@setOnNavigationItemSelectedListener false
            }
        }
    }
}