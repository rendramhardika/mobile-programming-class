class OperatorsExpression {
    fun main() {
        var firstName: String = "Rendra"
        var lastName: String = "Mahardika"

        val fullName = firstName + lastName

        println("full name: $fullName")

        var age: Int = 24
        age += 10

        var oldManAge: Int = 40

        if (oldManAge < age) {
            println("oldManAge < age: $oldManAge < $age")
        } else {
            println("oldManAge > age: $oldManAge > $age")
        }

        var totalComputer: Int = 1
        totalComputer++
        totalComputer++
        println("total computer now: $totalComputer")

        totalComputer--
        println("total computer now: $totalComputer")
    }
}