package ex09

import java.lang.NumberFormatException
import java.lang.RuntimeException
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(){
    val role: String= "MASTER"
    // break가 없어 실수할 가능성도 없고 가독성도 좋음
    val result = when(role){
        "MASTER", "ADMIN" -> {

        }
        "USER" -> {

        }
        else -> {

        }
    }

    // 타입 체크
    var any: Any = "";
    when(any){
        is String -> { // instance of
            any.length // 이미 스코프안에서 타입 캐스팅이 일어남
        }
        is Int -> {
            any.compareTo(10L)
        }
    }
    
    var exception = RuntimeException();
    when(exception){
        is NumberFormatException ->{
            // 스코프안 타입캐스팅
        }
        is RuntimeException ->{
        }
    }

    // 표현식도 가능
    var number = 10
    when(val n = number % 2){ // 표현식도 가능
        0 -> {
            println("$n 은 짝수")
        }
        else -> {
            println("$n 은 홀수")
        }
    }
    
    val r = when{
        number % 2 == 0 ->{
            "짝수"
        } 
        else -> {
            "홀수"
        }
    }
}
