import java.util.*

fun main(args: Array<String>) {
    var a : Int
    var b : Int
    var max : Int
    var c : Int
    println("Enter number 1st")
    val input1=Scanner(System.`in`)
    a = input1.nextInt()
    println("Enter number 2nd")
    val input2=Scanner(System.`in`)
    b = input2.nextInt()
    println("Enter number 3rd")
    val input3=Scanner(System.`in`)
    c = input3.nextInt()
    max=(if (a>b)a else if (b>c) b else c)
    println("The max is : $max")
}

