fun main() {
    println("hello")
    println("こんにちは")
    println("seeyou")
    println("さようなら")

val MONTH = 11
println("”"+ MONTH + "”月”は、" )

when(MONTH){
    1,2,12 -> println("”冬です”")
    3,4,5 -> println("”春です”")
    6,7,8 -> println("”夏です”")
    9,10,11 -> println("”秋です”")
    else -> println("”わかんないっぴ”")
}
}
