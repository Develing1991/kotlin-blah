package ex01

fun main(){
    // var: mutable object 가변 객체
    // val: immutable object 불변 객체 ( like java final )
    // 코틀린은 모든 타입이 레퍼런스 타입

    // : [타입]
    var varName: String = "가변";
    val valName: String = "불변"
    val str = "타입 추론 가능"

    // kotlin
    println("이름은 ?: $varName")
    println("이름은 ?: ${if(varName.isNotEmpty())valName else "varName is null"}")

    var i = 10 // 타입 추론
    var _i: Int = 10

    var d: Double = 20.0
    var _d: Double

    var f: Float = 10f

    var b: Boolean = true

}