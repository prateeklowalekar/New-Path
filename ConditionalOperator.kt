import java.util.*

fun main(args: Array<String>) {

    var a : Int
    var b : Int
    var max : Int

    println("Enter number 1st")
    val input1=Scanner(System.`in`)
    a = input1.nextInt()
    println("Enter number 2nd")
    val input2=Scanner(System.`in`)
    b = input2.nextInt()

max=(if (a>b)a else b)
println("The max is : $max")
}


