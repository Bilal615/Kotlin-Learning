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
    var c= ad(a,b)
    var d= su(a,b)
    when(user){
        1-> println(c)
        2-> println(d)
    }

}

fun ad(a:Int,b:Int):Int{
    return(a+b)}
fun su(a:Int,b:Int):Int{
    return(a-b)
}