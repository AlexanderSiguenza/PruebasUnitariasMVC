package edu.udb.pruebasunitariasmvc

import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class CalculatorModelTest {

    private lateinit var model: CalculatorModel

    @Before
    fun setUp() {
        model = CalculatorModel()
    }

    @Test
    fun testSum() {
        val result = model.add(2.0, 3.0)
        assertEquals(5.0, result, 0.0)
    }

    @Test
    fun testSubtract() {
        val result = model.subtract(5.0, 3.0)
        assertEquals(2.0, result, 0.0)
    }

    @Test
    fun testMultiply() {
        val result = model.multiply(2.0, 3.0)
        assertEquals(6.0, result, 0.0)
    }

    @Test
    fun testDivide() {
        val result = model.divide(6.0, 2.0)
        assertEquals(3.0, result, 0.0)
    }

    @Test(expected = IllegalArgumentException::class)
    fun testDivideByZero() {
        model.divide(5.0, 1.0)
    }
}