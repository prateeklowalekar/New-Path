import java.util.*

fun main(args : Array<String>) {

    println("AREA OF TRIANGLE")

    println("Enter Side 1")
    val input1 = Scanner(System.`in`)
    var a = input1.nextInt()
    println("Enter Side 2")
    val input2 = Scanner(System.`in`)
    var b = input2.nextInt()
    println("Enter Side 1")
    val input3 = Scanner(System.`in`)
    var c = input3.nextInt()

var s = (a+b+c)/2
var area=Math.sqrt((s*(s-a)*(s-b)*(s-c)).toDouble())

    println("The Area is : $area")
}