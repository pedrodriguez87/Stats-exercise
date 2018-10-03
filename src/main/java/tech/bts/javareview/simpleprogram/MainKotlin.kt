package tech.bts.javareview.simpleprogram

    fun main(args: Array<String>) {

        println("Hello, world!")

        // Declare variables

        var age : Int
        var price : Double


        // Assign a value
        age = 15

        // Declare and assign
        var weight : Double = 10.2

        // Type inferred from value (Double)
        // This can be done in Java 10
        var height = 150.0

        if (age >=18) {
            println("adult")
        } else if (age >= 13) {
            println("teenager")
        } else {
            println("kid")
        }

        var number : Int = 0


        var i = 1
        while (i <= 10) {
            println(i)
            i++
        }

        for (j in 1..10) {
            println(j)
        }

        // Create empty list and add values
        var names = mutableListOf<String>()
        names.add("apple")
        names.add("peer")

        // Create a list with some values
        // Only when de list is mutable you can add more elements
        // listOf() creates a close list
        var numbers = mutableListOf(8,4,6,5)

        println(names.get(0))

        var ages = mutableMapOf<String, Int>()
        ages.put("john", 30)
        ages.put("Mary", 25)
        println( ages.get("john"))

        val price2 = 200
        val discount = 10
        val finalPrice = price2 - discount
        println("The final price is$finalPrice")
        // Cant do it: finalPrice = price

        printHello("Peter", 30)

        val p =power(2.0, 10)
        println("2*10 = $p")

    }

fun power(base: Double, exponent: Int) : Double {

    var result = 1.0

    for (i in 1..exponent) {
        result *= base
    }

    return result
}

fun printHello(name: String, age: Int) {

    println("hello $name, you are $age")
}