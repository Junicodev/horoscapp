package com.junicodev.horoscapp.ui.horoscope.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.junicodev.horoscapp.databinding.ItemHoroscopeBinding
import com.junicodev.horoscapp.domain.model.HoroscopeInfo

class HoroscopeViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopeBinding.bind(view)

    fun render(horoscopeInfo: HoroscopeInfo) {
        val context = binding.tvTitle.context
        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvTitle.text = context.getString(horoscopeInfo.name)
    }
}