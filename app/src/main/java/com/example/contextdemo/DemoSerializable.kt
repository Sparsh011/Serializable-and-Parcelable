package com.example.contextdemo

import java.io.Serializable

data class DemoSerializable(
    val text: String,
    val id: Int
) : Serializable