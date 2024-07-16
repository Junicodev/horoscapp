package com.junicodev.horoscapp.domain.model

import com.junicodev.horoscapp.R

sealed class HoroscopeInfo(val img: Int, val name: Int) {
    data object Aries : HoroscopeInfo(R.drawable.ic_horoscope, R.string.app_name)
}