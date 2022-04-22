package com.geekbrains.myfirsttests

import org.junit.Assert
import org.junit.Test

class TestExperiments {
    /*
        a) assertEquals;
        b) assertNotEquals;
        c) assertArrayEquals;
        d) assertNull;
        e) assertNotNull;
        F) assertSame.
    */
    private val experiments = Experiments()

    @Test
    fun `assert equals`() {
        Assert.assertEquals(experiments.generateNumber(2), experiments.generateNumber(5))
    }

    @Test
    fun `assert not equals`() {
        Assert.assertNotEquals(experiments.generateNumber(4), experiments.generateNumber(6))
    }

    @Test
    fun `assert array equals`() {
        Assert.assertArrayEquals(experiments.generateArray(2), experiments.generateArray(5))
    }

    @Test
    fun `assert null`() {
        Assert.assertNull(experiments.generateArray(11))
    }

    @Test
    fun `assert not null`() {
        Assert.assertNotNull(experiments.generateArray(8))
    }

    @Test
    fun `assert same`() {
        Assert.assertSame(experiments.generateObject(6), experiments.generateObject(9))
    }
}