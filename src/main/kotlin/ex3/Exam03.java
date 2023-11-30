package ex3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exam03 {
    public Exam03(){

        var userList = new ArrayList<User>();

        userList.add(new User("Lee1", 10));
        userList.add(new User("Lee2", 20));
        userList.add(new User("Lee3", 30));

        var lists = Arrays.asList(
                new User("Lee1", 10),
                new User("Lee2", 20),
                new User("Lee3", 30)
        );
        userList.forEach(System.out::println);

        for (int i = 0; i < lists.size(); i++) {
            var userName = lists.get(i).getName();
            System.out.println(userName);
        }

        for(User user: userList){
            System.out.println(user);
        }

        var immutable = Collections.unmodifiableCollection(userList);
        immutable.add(new User("Lee1", 10));

        var imList = List.of("");
        imList.add("ddd");
    }



    public static void main(String[] args){
        new Exam03();
    }
}

class User {
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}