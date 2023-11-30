package ex3

fun main(){
    // 가변 컬렉션 (mutable 키워드 시리즈들)
    val userList = mutableListOf<User>()
    userList.add(User("1", 10))
    userList.add(User("2", 20))
    userList.add(User("3", 30))

    // 불변 컬렉션
    val list = listOf<User>(
        User("1", 10),
        User("2", 20)
    )
    
    // list.add -> add 메소드 자체가 없음 (가변과 불변이 명확함)
    // java의 불변 List.of().add()
    // java는 add 메소드가 제공 됨 하지만 실행은 안됨(실수하기 좋음)

    for(user in userList){
        println(user)
    }

    userList.forEach{ it-> println(it) }

    userList.forEachIndexed { index, user ->
        println("index: $index, user: $user")
    }
    
//    상동
//    userList.forEachIndexed(fun (index, user){
//        println("index: $index, user: $user")
//    })

    for ((index, user) in userList.withIndex()){
        println("index: $index, user: $user")
    }

}

// AllAgsConstructor class
class User(var name: String, var age: Int) {
}
