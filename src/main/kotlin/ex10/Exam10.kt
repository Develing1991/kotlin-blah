package ex10

import java.lang.NumberFormatException
import java.lang.RuntimeException
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(){
    val user = ExamUser(name = "abcd")
    examp10(user)
}

fun examp10(examUser: ExamUser?){
    // 1번 예시 - if문도 필요 없다
    examUser?.let {// kotlin 표준함수
        it.name?.let {  name ->
            println(name)
        }
    }?: run { 
        println("null 일때 실행")
    }

    // 2번 예시 - if문 아직까지 !부정 연산자가 들어감
    // isNullOrBlank처럼 kotlin에서 기본 제공 메소드가 있다
    examUser?.let {
        if(!it.name.isNullOrBlank()){
            println(it.name)
        }
    }

    // 3번 예시 - String클래스에 직접 메소드를 만들어 확장한다
    examUser?.let {
        if(it.name.isNotNullOrBlank()){
            println(it.name)
        }
    }

    // 4번 예시 isNotNull이라는 Any(Object) 조상 클래스에 확장
    if(examUser.isNotNull() && examUser?.name.isNotNullOrBlank()){
        print(examUser?.name)
    }
}

data class ExamUser (
    var name: String? = null
){}

// 확장 함수 extension function
fun String?.isNotNullOrBlank(): Boolean{
    return !this.isNullOrBlank()
}

// java의 Object클래스 처럼 모든 클래스의 조상은 Any
fun Any?.isNotNull():Boolean{
    return !this.isNotNull();
}