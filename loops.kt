fun main( arg: Array <String>){
    // for (i in 1..10){ //  including 10
    //     println("i = $i")
    // }
    // for (i in 1 until 10){ //excluding 10
    //     println(i)
    // }
    // for (i in 10 downTo 1){ //including 1
    //     println(i)
    // }

    // for (i in 1 until 10 step 2){
    //     println(i)
    // }

    // for (i in 1..10){
    //     println(i)
    // }

    var number=0
    // while (number<10) { // u can also do do while loop
    //     if(number==7){
    //         continue
    //     }
    //     println(number)
    //     number++

    // }

    // number=0
    // while (number<10) println(++number) // u can write it this way as well (both outputs are diff due to postfix and prefix)


    // do {
    //     println(number)
    // }
    // while(number<10)


    outer@ while (number<5) { // loop labelled as outer
        number++
        // if(number==7){
        //     continue
        // }
        println(number)

        var i=0
        while (i<5){
            if (i==0) break@outer // u can use labels to break the outer loop if necessary  
            i++
            println("***$i")
        }
        
        

    }

}