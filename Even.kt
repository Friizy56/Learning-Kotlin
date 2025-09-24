// Print all even numbers  till a value N

fun main(){
    println("Enter the value of N")
    val N: Int = readLine()!!.toInt() //use !! to assert non null value

    for (i in 1..N){
        // if (i%2==0) println(i)

        if (isEvenNumber(i)){
            println(i)
        }
    }
}

//Using function
fun isEvenNumber(number:Int): Boolean {
    if ((number%2)==0) {
        return true
    }
    else{
        return false
    }
}