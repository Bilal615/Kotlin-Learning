fun main(args: Array<String>) {
    /*var sum = 0
    for (i in 1..10){
        sum = sum+i
    }
    println(sum)*/
    var list= listOf<String>("Bilal","Khan","Usmani","Muhammadi")
    for (name in list.reversed() )
        println(name)
    for((index,value) in list.withIndex()){
        println("Name at Index $index is $value")
    }

}