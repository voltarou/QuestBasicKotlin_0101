package com.example.test

fun nullSafety() {
    // neverNull has String type
    var neverNull: String = "This can't be null"

// Throws a compiler error
    // neverNull = null // This line would cause a compile-time error if uncommented

    // nullable has nullable String type
    var nullable: String? = "You can keep a null here"
    // This is OK
    nullable = null

    // Check for null in conditions
    if (neverNull == null) { // This condition will always be false for neverNull
        println("inferredNonNullable is null")
    } else {
        println("inferredNonNullable is not null")
    }

    // Safe call operator
    println(neverNull.length) // 18 (Assuming neverNull is "This can't be null")
    println(nullable?.length) // null (because nullable is null)

    // notNull doesn't accept null values
    fun strLength(notNull: String): Int {
        return notNull.length
    }

    // This will work because neverNull is a non-nullable String
    println(strLength(neverNull)) // 18 (Assuming neverNull is "This can't be null")

    // The following line would cause a compile-time error if uncommented,
    // because strLength expects a non-nullable String.
    // println(strLength(nullable))
}

fun main() {
    nullSafety()
}