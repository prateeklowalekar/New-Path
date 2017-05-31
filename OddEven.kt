/**
 * Created by Prateek on 31-05-2017.
 */
import java.util.Scanner

fun main(args : Array<String>){


/*val num1 : IntArray  = intArrayOf(1,2,3,4)
       println(num1)
1 */

    println("Please enter one numnber")

    val input = Scanner (System.`in`)
val num= input.nextInt()
    println("The entered int is $num")


    if(num%2==0){
        print("the Int $num is even")
    }
    else
        println("the Int $num is odd")


}


