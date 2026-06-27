fun main(){
    val arr = arrayOf(98,76,54,79,68)
    var TOTAL = 0
    for (item in arr){
        TOTAL += item
    }
    val ave = TOTAL /arr.size
    println("合計は、" + TOTAL + "、平均は、" + ave + "です。")
}