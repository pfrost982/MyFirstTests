package com.geekbrains.myfirsttests

class Experiments {

    private val obj15 = Object()
    private val obj610 = Object()

    fun generateNumber(number: Int): Int? {
        return when (number) {
            in 1..5 -> 15
            in 6..10 -> 610
            else -> null
        }
    }

    fun generateArray(number: Int): Array<Int>? {
        return when (number) {
            in 1..5 -> arrayOf(1, 2, 3, 4, 5)
            in 6..10 -> arrayOf(6, 7, 8, 9, 10)
            else -> null
        }
    }

    fun generateObject(number: Int): Any? {
        return when (number) {
            in 1..5 -> obj15
            in 6..10 -> obj610
            else -> null
        }
    }
}

