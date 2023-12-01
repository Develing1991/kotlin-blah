package ex11

import java.time.LocalDateTime

fun main(){
//    val now: LocalDateTime? = null
    val now: LocalDateTime? = LocalDateTime.now()
                                // it 대신 명확하게 지역변수 지정, 타입지정
    val kst = now?.let { localDateTime: LocalDateTime ->
        println("let scope $localDateTime")
        "let scope"// 해당 스코프의 마지막이 리턴 됨
    }?: LocalDateTime.now()

    println(kst)

    UserDto(name = "lee").let {
        logic(it)
    }
}

fun logic(userDto: UserDto?): UserResponse? {

    // null값이 아닐 때 실행 [ ?.let ]
    return userDto?.let { userDto: UserDto ->
        println("Dto : $userDto")
        UserEntity(name = userDto.name)// UserEntity를 반환
    }?.let {// 이어서 UserEntity를 받음 
        println("Entity : $it")
        UserResponse(userName = it.name)
    }
    
    // .map()과 같이 메소드 체이닝 방식이고
    // map은 컬렉션에서 사용
    // let은 객체에서 사용
}

data class UserDto(
    val name: String? = null,
){}

data class UserEntity(
    val name: String? = null,
){}

data class UserResponse(
    val userName: String? = null,
){}