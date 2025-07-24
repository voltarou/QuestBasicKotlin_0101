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

    mutableList[0] = "Oval"
    println("After updating: $mutableList")

    // Menghapus data
    mutableList.remove("Square")
    println("After removing Square: $mutableList")

    // Set
    // Set adalah koleksi data yang tidak memiliki urutan dan tidak boleh berisi duplikat.
    // Set memiliki operasi: add, remove, contains, size, isEmpty, clear.
    // Set digunakan ketika kita hanya peduli dengan keberadaan suatu elemen, bukan urutan atau duplikat.

    // Immutable Set
    val readOnlySet = setOf("Apple", "Banana", "Apple", "Orange") // "Apple" will only appear once
    println("Read-only Set: $readOnlySet")
    println("Size of set: ${readOnlySet.size}") // Will be 3 due to no duplicates
    println("Contains Banana: ${readOnlySet.contains("Banana")}")

    // Mutable Set
    val mutableSet = mutableSetOf("Circle", "Square", "Triangle")
    println("Mutable Set: $mutableSet")

    // Menambahkan data ke dalam Set Mutable
    mutableSet.add("Rectangle")
    mutableSet.add("Circle") // This will not be added as "Circle" already exists
    println("After adding: $mutableSet")

    // Menghapus data dari Set Mutable
    mutableSet.remove("Circle")
    println("After removing Circle: $mutableSet")

    // Map
    // Map adalah koleksi data yang disimpan dalam pasangan kunci-nilai.
    // Setiap kunci dalam Map harus unik, tetapi nilai dapat diulang.
    // Map memiliki operasi: put, get, remove, containsKey, containsValue, size, isEmpty, clear, keys, values.
    // Map digunakan untuk mencari nilai berdasarkan kunci.

    // Immutable Map
    val readOnlyMap = mapOf("one" to 1, "two" to 2, "three" to 3)
    println("Read-only Map: $readOnlyMap")
    println("Value for key 'one': ${readOnlyMap["one"]}")
    println("Contains key 'two': ${readOnlyMap.containsKey("two")}")
    println("Contains value 3: ${readOnlyMap.containsValue(3)}")

    // Mutable Map
    val mutableMap = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println("Mutable Map: $mutableMap")

    // Menambahkan data ke dalam Map Mutable
    mutableMap["Rectangle"] = 4
    mutableMap.put("Oval", 5)
    println("After adding: $mutableMap")

    // Mengakses data dari Map Mutable
    println("Value for 'Circle': ${mutableMap["Circle"]}")

    // Memperbarui data di dalam Map Mutable
    mutableMap["Circle"] = 10
    println("After updating: $mutableMap")

    // Menghapus data dari Map Mutable
    mutableMap.remove("Square")
    println("After removing Square: $mutableMap")

    // Iterasi
    println("\nIterating over mutableMap:")
    for ((key, value) in mutableMap) {
        println("$key -> $value")
    }

    println("\nIterating over mutableList:")
    for (item in mutableList) {
        println(item)
    }

    println("\nIterating over mutableSet:")
    for (item in mutableSet) {
        println(item)
    }
}
    