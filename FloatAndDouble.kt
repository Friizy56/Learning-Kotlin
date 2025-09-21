fun main(){
    // val myNumber= 2.5
    // println("The Number is "+ myNumber)
    // val num1= -5
    // val num2= -6
    // val text= if (num1>0 || num2>0) "This is text 1" else 5+6


    var text: String? = "Angan" // when we add ? then we can have a null value inside the variable
    //Without ? we cant add null value it will give an error


    text=null
    val text2 = text ?: "Some text." //  if text variable is null then we add "Some text" into text2
    println(text2?.length) // ?. returns null if there is a null value in text2 and u wanna check out its length


    sayHello("Angan", 20  )
}

fun sayHello(name: String, age: Int){  // no return type in this basically void
    println("Hello $name your age is $age" )
}