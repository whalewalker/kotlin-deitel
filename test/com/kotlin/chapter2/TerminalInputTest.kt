package com.kotlin.chapter2

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TerminalInputTest {
    private val testSample : TerminalInput = TerminalInput();


    @Test
    fun canSumTwoNumberTogether(){
        val expected = 5;
        assertEquals(expected, testSample.sum(2, 3));
    }
}