package ex07

// 기본적으로 @Data 제공 -> data 키워드
// getterm setterm toString equals hashCode 생략 가능
data class User (
    var name: String? = null,
    var age: Int? = null,
    var email: String? = null
){
//    override fun toString(): String {
//        return "User(name=$name, age=$age, email=$email)"
//    }
}