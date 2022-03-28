fun main(){
   var z= add(40,30)
    println(z)
number1()
    number2()
}
fun add(y: Int, x: Int): Int{
  var sum =y+x
    return sum

}
fun number1(){
    var w=modulus(50, 60)
    println(w)
}
fun modulus(d: Int, v: Int): Int{
    var modulus= d%v
    return modulus
}
fun number2(){
    var e=product(22,44)
    println(e)
}
fun multiplication(r: Int, o: Int):Int{
    var items= r/o
    return items

}