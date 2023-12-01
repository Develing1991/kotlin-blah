package ex12

fun main(){
    var userDto = UserDto(
        name = "Lee"
    ).also {dto: UserDto ->
        // let은 마지막 라인이 리턴 되지만
        // also는 UserDto(name="Lee") 이 객체 자체가 리턴 됨
        // 로깅 시 많이 쓰임
        println(dto)
    }

}
data class UserDto(
    val name: String? = null,
){}