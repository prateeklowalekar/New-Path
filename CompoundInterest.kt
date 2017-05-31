import java.util.*

fun main(args : Array<String>){
println("COMPOUND INTEREST")
    println("Enter Principal")
    var input1 = Scanner(System.`in`)
    var p=input1.nextDouble()
    println("Enter Rate")
    var input2 = Scanner(System.`in`)
    var r=input2.nextDouble()
    println("Enter Time")
    var input3 = Scanner(System.`in`)
    var t=input3.nextDouble()

    var a=p*Math.pow(1+(r/100.0),t)
var ci=a-p
    println("Amount is : $a")
    println("Compound Interest : $ci")

}