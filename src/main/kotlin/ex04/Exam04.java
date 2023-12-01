package ex04;

import java.util.HashMap;
import java.util.Map;

public class Exam04 {

    public Exam04(){
        var hashMap = new HashMap<String, Object>();
        hashMap.put("key", "value");
        var map = Map.of("key1", "value1", "ke2", "value2");
        map.put("key3", "value3");

        hashMap.get("key");
    }


    public static void main(String[] args){
        new Exam04();
    }
}
