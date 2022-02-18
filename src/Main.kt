fun main(){
    greetings( "caroline")
    modulus(30, 7)
    sum(13, 34, 24, 11)
    interesting()
}

fun greetings(name:String){
    println("Hello "+ name)


}
fun modulus(a: Int, b: Int):Int{
   var  modulus = a%b
    println(modulus)
    return modulus
}
fun sum(a: Int, b: Int, c: Int, d: Int): Int{
    var sum = a+b+c+d
        println(sum)
    return sum
    }
fun interesting(): String {
    var interesting = "i love my life"
    println(interesting)
    return interesting


}
