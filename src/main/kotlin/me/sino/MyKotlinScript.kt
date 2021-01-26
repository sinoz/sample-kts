package me.sino

import kotlin.script.experimental.annotations.KotlinScript

@KotlinScript(displayName = "My Kotlin Script")
abstract class MyKotlinScript() {
    fun add(x: Int, y: Int) = x + y
}