class ControlFlow {
    fun main() {
        cases("Hello")
        cases(1)
        cases(0L)
        cases(MyClass())
        cases("hello")

        for (index in 1..10) {
            print("$index.. ")
        }

        for (index in 100 downTo 90) {
            print("$index.. ")
        }

        for (index in "Rendra") {
            print("$index.. ")
        }


        var i: Int = 1
        while (i < 10) {
            println("while $i < 10 ")
            i++
        }

        var j: Int = 1
        do {
            println("dowWhile $i < 10 ")
            j++
        } while (j < 10)


        for (index in 100 downTo 90) {
            print("$index.. ")
        }

        val no: Boolean = false;
        if (no == false) {
            println("enter if")
        } else {
            println("enter else")
        }

    }

    fun cases(obj: Any) {
        when (obj) {                                     // 1
            1 -> println("One")                          // 2
            "Hello" -> println("Greeting")               // 3
            is Long -> println("Long")                   // 4
            !is String -> println("Not a string")        // 5
            else -> println("Unknown")                   // 6
        }
    }

    class MyClass
}