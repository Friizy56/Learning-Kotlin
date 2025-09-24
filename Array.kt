fun main(){
    // val names: Array<String> = arrayOf("John", "Stephen", "Megan")
    // val numbers = arrayOf(4,5,6,7,4, "Name 1", 'a')

    // names[0]="Alex"
    // println("First element: ${names[0]}")
    // println("The size of the array is: ${names.size}")

    // for (name in names){
    //     println(name)
    // }
    // for (i in numbers){
    //     if (i is Int) //checks if element is of type Int
    //     println(i)
    // }

    val max= findMax(arrayOf(4,7,6,4,3,6))
    val min= findMin(arrayOf(4,7,9,20,7,5))
    println("Max value = $max")
    println("Min value = $min")
}

fun findMin(numbers:Array<Int>): Int{
    var min= numbers[0]

    for (number in numbers){
        if (number<min) {
            min=number
        }
    }
    return min
}

fun findMax(numbers:Array<Int>): Int{
    var max= numbers[0]

    for (number in numbers){
        if (number>max) {
            max=number
        }
    }
    return max
}