package com.mixed.java;

import com.mixed.kotlin.KotlinLanguage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaLanguageTest {

    @Test
    public void simpleKotlinLanguage() throws Exception {
        assertEquals("kotlin", new KotlinLanguage().showLanguage());
    }

    @Test
    public void simpleJavaLanguage() throws Exception {
        assertEquals("java", new JavaLanguage().showLanguage());
    }
}