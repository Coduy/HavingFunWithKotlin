
fun main(args: Array<String>) {
    //Edit number as needed
    val number = 8
    println("Result is ${factorial(number)}")
}

//recursive function; returns factorial of number
fun factorial(x: Int) :Int {
    return if (x == 1) x else x*factorial(x-1)
}
