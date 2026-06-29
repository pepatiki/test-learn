fun main(){
    val arr =listOf(98,76,54,79,68)
    var total = 0
    for(item in arr){
        total += item
    }
    val ave = total / arr.size
    println(ave)
}