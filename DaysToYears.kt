import java.lang.Integer.parseInt

fun main(args: Array<String>) {
    var days : Int
    var years : Int
    var months : Int
    var weeks : Int

    days=parseInt(args[0])
        years = days / 365
    days=days%365
    months=days/30
    days=days%30
    weeks=days/7
    days=days%7

    println("Years : $years")
    println("Months : $months")
    println("Weeks : $weeks")
    println("Days : $days")



}