fun main(){
val max = getMax(5,9)
println("Max = $max")
}
fun getMax(a: Int, b: Int): Int{
    val max = if(a>b) a else b
    return max 
}