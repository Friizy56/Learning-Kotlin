fun main(){
// val max = getMax(5,9) // Normal function
val max = Max(5.6 ,9.8) // single expression function
println("Max = $max")
}
fun getMax(a: Int, b: Int): Int{
    // val max = if(a>b) a else b
    // return max 
    return if (a>b) a else b
}

fun Max( a: Int,  b: Int) : Int = if (a>b) a else b //only if function has a single expression
fun Max( a: Double,  b: Double) = if (a>b) a else b //only if function has a single expression
