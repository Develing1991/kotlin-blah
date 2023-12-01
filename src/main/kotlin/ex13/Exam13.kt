package ex13

fun main(){
    // 생성자 패턴(초기화)에서 많이 쓰임
    // public inline fun <T> T.apply(block: T.() -> Unit): T { 확장 함수 이기때문에 this인 것
    val userDto = UserDto().apply { // it이 아닌 this로 넘어옴 (이름 지정 불가)
                                                       // also와 마찬가지로 수신 받은 객체 자신이 넘어옴
        this.name = "Lee"
        name = "lee2" // 본인 자신이기 때문에 this 생략 가능
    }
}

data class UserDto(
    var name: String? = null,
){}
