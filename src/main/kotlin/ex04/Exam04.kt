package ex04

fun main(){

    // java Object -> Any
    // 불면 map
    val map = mapOf<String, Any>(
        Pair("key1", "value1"),
        "key2" to "value2"
    )

    // 가변 mutalbleMap
    val mutalbleMap = mutableMapOf(
        "key1" to "value1" // 타입추론
    )

    mutalbleMap.put("key1", "value1")
    val value1 = mutalbleMap.get("key1")

    mutalbleMap["key2"] = "value2"
    val value2 = mutalbleMap["key2"]

    // hashMapOf
    val hashMap = hashMapOf(
        "key1" to "value1"
    )

    // 값을 3가지 가지는 객체
    var triple = Triple<String, String, String>(
        first = "",
        second = "",
        third = ""
    )
}
