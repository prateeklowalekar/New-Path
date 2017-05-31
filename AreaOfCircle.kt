/**
 * Created by Prateek on 31-05-2017.
 */
import java.util.*

fun main(args : Array<String>){

    val rad : Double
    val pi : Double = 3.14159
println("Please enter the radius")
    val input = Scanner(System.`in`)
    val num = input.nextInt()
    rad= num.toDouble()
val area : Double = rad*pi*rad
    println("The Area of circle is $area")

}