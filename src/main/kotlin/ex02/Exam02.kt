package ex02

import java.util.*

fun main(){
    val a: Int = 0
    val b = 10
    val c: Int = 20
    val d: Int? = null
    callFunction(a)
    callFunction(b)
    callFunction(c)
    callFunction(d)
    println(d) // Null Point 없이 null을 그대로 출력해줌
    callFunctionDefault()

    // Optional 사용할 필요가 없다
    // Optional.ofNullable(d).ifPresent{ it -> callFunction(it) }
}

// ? -> elvis 연산자
// 엘비스의 머리 카락이 이렇게 생겼다 해서..............
// 의미는 null 값이 올 수도 있다
fun callFunction(i: Int?){
    // 변수? : 변수가 null인가?
    // 변수?. : 변수가 null이 아닐 때
    // 변수?: : 변수가 null 일 때
    i?.let {
        println(it)
    }?: run{
        println("null 입니다")
    }

    val temp1 = if(i == null) "null 값 입니다" else i
    println(temp1)

    val temp2 = i?: "null 값 입니다"
    println(temp2)

    val temp3 = i?.let { it * 20 } ?: "null 값 입니다"
}

// default 값 100.. 매개변수 없이도 사용 가능
fun callFunctionDefault(i: Int? = 100){
    println(i)
}