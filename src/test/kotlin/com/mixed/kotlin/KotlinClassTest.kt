package com.mixed.kotlin

import com.mixed.java.JavaLanguage
import org.junit.Test
import kotlin.test.assertTrue

class KotlinClassTest {
    @Test
    fun simpleKotlinMethod() {
        assertTrue { KotlinLanguage().showLanguage() == "kotlin" }
    }

    @Test
    fun simpleJavaMethod() {
        assertTrue { JavaLanguage().showLanguage() == "java" }
    }
}