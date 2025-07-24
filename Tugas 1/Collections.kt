package com.example.test

import java.util.Collections

fun main() {
    // List
    // List adalah koleksi data yang terurut dan memiliki posisi tertentu
    // List memiliki operasi: add, get, set, remove, clear, size, isEmpty, contains, indexOf

    // Immutable List (read-only)
    val readOnlyList = listOf("Apple", "Banana", "Orange")
    println("Read-only List: $readOnlyList")
    println("First element: ${readOnlyList[0]}")
    println("Size: ${readOnlyList.size}")
    println("Contains Banana: ${readOnlyList.contains("Banana")}")

    // Mutable List (can be modified)
    val mutableList = mutableListOf("Circle", "Square", "Triangle")
    println("Mutable List: $mutableList")

    // Menambahkan data ke dalam List Mutable
    mutableList.add("Rectangle")
    println("After adding: $mutableList")

    // Mengakses data
    println("Element at index 1: ${mutableList[1]}")

    