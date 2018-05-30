package com.mixed.kotlin

import com.mixed.java.JavaLanguage
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinJavaApplication

fun main(args: Array<String>) {
    print(JavaLanguage().showLanguage())
    runApplication<KotlinJavaApplication>(*args)
}
