fun main(args: Array<String>) {
    println("Welcome to Simple Calculator")
    var menu= listOf<String>("1-Add","2-Subtract")
    println(menu)
    println()
    println("Please select the operation from menu you want to perform")
    var user= readLine()!!.toInt()
    println("Please add the values below on which you want to perform your desired function")
    var a= readLine()!!.toInt()
    var b= readLine()!!.toInt()
    when(user){
        1-> add(a,b)
        2-> sub(a,b)
    }

}

fun add(a:Int,b:Int){
    println(a+b)}
fun sub(a:Int,b:Int){
    println(a-b)
}

