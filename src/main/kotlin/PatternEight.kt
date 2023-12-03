fun main() {
    var sum = 1
    for (i in 1..5){
        for (j in 1..5){
            print("$sum ")
            sum = sum + 1
        }
        println()
    }
}