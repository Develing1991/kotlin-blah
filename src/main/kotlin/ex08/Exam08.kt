package ex08

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(){
    val date1 = Exam08(Store()).toLocalDateTimeString()
    println(date1)

    val date2 = Exam08(Store()).toLocalDateTimeString(LocalDateTime.now())
    println(date2)

    val defaultTimeAndFormat = DateTimeUtil().localDateTimeToString()
    println(defaultTimeAndFormat)

    val my1 = DateTimeUtil().localDateTimeToString(localDateTime = LocalDateTime.now().plusDays(1))
    val my2 = DateTimeUtil().localDateTimeToString(localDateTime = LocalDateTime.now(), pattern = "yyyy")
    println(my1)
    println(my2)
}

data class Store(
    var registeredAt: LocalDateTime? = null
){}

class Exam08{
    constructor(store: Store){
        val strLocalDateTime = toLocalDateTimeString(store.registeredAt)
    }

    fun toLocalDateTimeString(localDateTime: LocalDateTime? = LocalDateTime.of(2020,1,1,1,1,1)): String{
        /*
        var temp = if(localDateTime == null){
            LocalDateTime.now() // return 없어도 됨
        }else{
            localDateTime
        }
        */

        // 더 줄일 수 있음
         // var temp = localDateTime ?: LocalDateTime.now()
         // return temp.format(DateTimeFormatter.ofPattern("yyyy MM dd"))
         return (localDateTime ?: LocalDateTime.now()).format(DateTimeFormatter.ofPattern("yyyy MM dd"))
    }
}

class DateTimeUtil {
    private val KST_FORMAT = "yyyy년 MM월 dd일 HH시 mm분 ss초"
    fun localDateTimeToString(localDateTime: LocalDateTime = LocalDateTime.now(),
                              pattern: String = KST_FORMAT): String{
        return localDateTime.format(DateTimeFormatter.ofPattern(pattern))
    }
}
