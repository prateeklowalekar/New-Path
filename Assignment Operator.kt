fun main(args: Array<String>) {
    var a : Int =1
    var b : Int =2
    var c : Int =3

    println("A : $a")
    println("B : $b")
    println("C : $c")

    a++
    b--
    c+=a*b

    println("A : $a")
    println("B : $b")
    println("C : $c")
}