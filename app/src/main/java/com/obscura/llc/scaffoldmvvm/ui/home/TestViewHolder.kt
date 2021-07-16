package com.obscura.llc.scaffoldmvvm.ui.home

import com.obscura.llc.scaffoldmvvm.databinding.ItemSampleBinding

class TestViewHolder(binding: ItemSampleBinding): HomeViewHolder(binding) {

    override fun bind(item: Any) {
        with(binding as ItemSampleBinding) {
            tvStr.text = item.toString()
        }
    }

}