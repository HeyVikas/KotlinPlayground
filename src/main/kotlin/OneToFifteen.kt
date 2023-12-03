fun main() {
    val n = 5
    var sum = 1

    for (i in 1..5){
        for (j in 1..6-i){
            print("$sum ")
            sum=sum+1
        }
        println()
    }
}