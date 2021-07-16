package com.obscura.llc.scaffoldmvvm.ui.home

import com.obscura.llc.scaffoldmvvm.databinding.ItemNumberSampleBinding

class TestNumViewHolder(binding: ItemNumberSampleBinding) : HomeViewHolder(binding) {

    override fun bind(item: Any) {
        with(binding as ItemNumberSampleBinding) {
            tvNum.text = item.toString()
        }
    }
}