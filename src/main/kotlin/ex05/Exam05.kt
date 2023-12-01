package ex05

import java.util.function.Predicate

fun main(){

    // 기본 필터 사용
    val numberList = listOf<Int>(1,2,3,4,5)

    numberList.filter { e -> e % 2 == 0 }

    numberList.filter { it % 2 == 0 } // it으로 사용하면 생략 가능

    // 코틀린에서 익명 클래스 object 키워드
    val predicate = object: Predicate<Int>{
        override fun test(t: Int): Boolean {
            return t % 2 == 0
        }
    }

    numberList.stream().filter(predicate)

    // 람다로 줄일 수 있음
    val predicateLambda = Predicate<Int> { t -> t % 2 == 0 }

    val add = { x: Int, y: Int -> x + y }
    println(add.invoke(1, 2))
    println(add(4, 5))

    // 익명 함수
    val _add = fun(x: Int, y: Int): Int{
        return x + y
    }
    println(_add(1,5))

    myLambda(3, 4, _add)
}

// 메소드를 파라미터로
// method: (Int, Int) -> Int  
// 메소드 형식은 Int타입 두개와 리턴이 Int인 function

fun myLambda(x: Int, y: Int, method: (Int, Int) -> Int){
    println(method(x, y))
}
