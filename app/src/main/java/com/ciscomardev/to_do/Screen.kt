package com.ciscomardev.to_do

import kotlinx.serialization.Serializable

sealed class Screen{

    @Serializable
    object Home

    @Serializable
    data class Detail(
        val id: Int
    )
}