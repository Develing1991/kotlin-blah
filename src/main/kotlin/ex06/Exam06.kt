package ex06

fun main(){
    val dog = Dog("puppy")
    // 프로퍼티에 직접 접근 가능 함
    println(dog.age) // getter, setter 필요 없음
    dog.age = 2
    println(dog.age)
    dog.eat()
    dog.bark()
}

interface Bark{
    fun bark()
}
interface Temp{
    fun hi()
}
abstract class Animal(
    private val name: String? = "", // 생성자
): Bark{
    fun eat(){
        println("$name 식사")
    }
}

// class Dog()
// 상속 키워드 -> :
class Dog(
    private val name: String? = null, // 불변 val -> final
    var age: Int? = 0 // 가변 var
    // var age: Int // 프리미티브 없으니 기본 null임
) : Animal(name), Temp{ // super(name), 다중 상속


    // kotlin에서의 굳이 getter, setter를 만드려면..
    var age1: Int? = 0
        get() = field
        set(value){ field = value }

    override fun bark() {
        println("${name} 멍멍")
    }

    override fun hi() {
        println("hi")
    }
}