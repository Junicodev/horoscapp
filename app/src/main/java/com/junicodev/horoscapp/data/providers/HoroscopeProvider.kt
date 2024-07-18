package com.junicodev.horoscapp.data.providers

import com.junicodev.horoscapp.domain.model.HoroscopeInfo
import javax.inject.Inject

class HoroscopeProvider @Inject constructor() {
    fun getHoroscopes(): List<HoroscopeInfo> {
        return listOf(
            HoroscopeInfo.Aquarius,
            HoroscopeInfo.Aries,
            HoroscopeInfo.Cancer,
            HoroscopeInfo.Capricorn,
            HoroscopeInfo.Gemini,
            HoroscopeInfo.Leo,
            HoroscopeInfo.Libra,
            HoroscopeInfo.Pisces,
            HoroscopeInfo.Sagittarius,
            HoroscopeInfo.Scorpio,
            HoroscopeInfo.Taurus,
            HoroscopeInfo.Virgo
        )
    }
}