fun main(args: Array<String>) {
    var countries = arrayListOf<String>("Pakistan","France","United States","Afghanistan")
    for(i in countries){
        if (i.contains('e')){
         var d=   i.toCharArray()
            for(k in d){
                println(k)
            }
        }
    }
}




//Create an array list of your favorite book titles. Loop over this list and, if
//the title contains the letter ‘e’, print each character of the name on a new
//line.