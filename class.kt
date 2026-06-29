fun main(){
    val ME = Person()
    println(ME.say())
    ME.name = "Taro"
    ME.mail = "taro@yamada"
    println(ME.say())
}

class Person {
    var name = "noname"
    var mail = ""

    fun say() = "Name:" + name +", Email:" + mail
}

class Count(listdata:String="no name",listnumber:Int="0"){
    

}