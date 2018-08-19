fun main(args: Array<String>) {
    println("Universal Tracking System")
    println("Enter the number you want to track below")
    var track =readLine().toString()
    if(track.contains("LY")){
        println("USPS Tracking")
    }
    else if(track.contains("LZ")){
                println("Canada Post Tracking")
            }
    else println("Courier not found")
}

//LY00078600Z -USPS
//LZ00078600Z- Canda Post