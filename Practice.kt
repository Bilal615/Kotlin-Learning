fun main(args: Array<String>) {
    bilal@for (i in 1..10) {
        for (j in 1..10) {
            if (i - j == 5) {
                break@bilal
            }
            println("$i-$j")
        }
    }
}
