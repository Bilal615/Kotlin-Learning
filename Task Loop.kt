import java.util.*

fun main(args: Array<String>) {
   /* var sum=0
    for (i in 100..100000){
        sum=sum+i
    }
    println(sum)*/
    println("Number Guessing Game")
    var random= Random().nextInt(10)
    //var x= true
    var life=3
    do{
        println("Please guess the number below")
        var guess= readLine()!!.toInt()
        if(guess==random) {
            println("You have guessed rightly, Congratulations Buddy!")
          //  x = false
            break
        } else{
            life=life-1
            println("You have $life life left")
        }

    }   while (life!=0)


}