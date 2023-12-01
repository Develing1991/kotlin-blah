package ex07



fun main(){
    val user = User(null, 10, null)
    user.name = "Lee" // setter
    user.age = 20
    user.email = "aaa@gmail.com"
    println(user)

    // named arguments라고 함,, java의 AllArgsConstructor와 다르게 순서 상관이 없음
    val user3 = User(name = "lee3", age = 33, email = "completed0728@gmai.com")
    // 가독성이 올라감 java의 AllArgsConstructor처럼 생성하면 순서를 계속 확인 해야 하니까

    // 객체 복사 기능도 있다
    val user2 = user.copy(email = "ddd@g,com", name = "lee2", ) // <- 끝에 쉼표가 붙더라도 컴파일 에러가 안남

    // marketplace 에서 kotlin fill class 추가
//    val user3 = User( [Alt] + [Enter] )
//    val user3 = User(name = null, age = null, email = null) 자동 생성

    println(user2)
}
