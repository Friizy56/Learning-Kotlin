fun main (args: Array<String>) {
    println(sum(5,6,7,10)) //u can put any number of values here
}
fun sum(vararg numbers:Int){
    // var result = 0
    // for (number in numbers){
    //     result += number
    // }
    // return result

    //ALTERNATIVE WAY (using forEach)

    numbers.forEach{ println(it) }
}