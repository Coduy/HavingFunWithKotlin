
fun main(args: Array<String>) {
    val number = 4
    println("Result is ${factorial(number)}")
}

//recursive function; returns factorial of number
fun factorial(x: Int) :Int {
    return if (x == 1) number else x*factorial(x-1)
}
