import java.util.*

fun main(args : Array<String>){

println("Enter 1st digit")
    val input1 = Scanner(System.`in`)
    var n1=input1.nextInt()
    println("Enter 2nd digit")
    val input2 = Scanner(System.`in`)
    var n2=input2.nextInt()

    println("Before Swapping : 1st - $n1 and 2nd - $n2 ")
var n3=n1
    n1=n2
    n2=n3
    println("After Swapping : 1st - $n1 and 2nd - $n2 ")
}