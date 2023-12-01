package ex14

fun main(){
    // 주로 지역 스코프를 만들 때 많이 씀
    val userDto = UserDto().run {  
        this.name
        name
        "마지막줄 리턴"
    }
    println(userDto)

    val x = 10
    val sum = run { // 지역 스코프
        val x = 2 // 해당 지역 변수
        val y = 3
        x + y
    }
    println(sum) // 지역 변수라 결과는 5
}

data class UserDto(
    var name: String? = null,
){}
