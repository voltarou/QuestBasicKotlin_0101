package com.example.test

// Lambda Functions
// Lambda functions adalah fungsi yang tidak memiliki nama
// Lambda functions biasanya digunakan untuk membuat fungsi yang sederhana
// Lambda functions menggunakan tanda panah (->) untuk memisahkan parameter dan body fungsi

fun upperCaseString(string: String): String {
    return string.uppercase()
}

//Dapat ditulis dalam ekspresi lambda sbb :
fun main() {
    upperCaseString("hello")
    println({ string: String -> string.uppercase() }("hello"))
    // HELLO
}