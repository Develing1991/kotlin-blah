package ex06;

interface Bark {
    void bark();
}
abstract class Animal implements Bark{
    private final String name;
    private int age;
    
    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println(name+ " 식사");
    }
}
class Dog extends Animal{

    public Dog() {
        super("");
    }
    public Dog(String name) {
        super(name);
    }
    
    @Override
    public void bark() {
        System.out.println(this.getName() + " 멍멍");
    }
}

public class Exam06 {

    public Exam06(){
        var dog = new Dog("puppy");
        System.out.println(dog.getAge()); // 기본 0
        dog.eat();
        dog.bark();
    }
    public static void main(String[] args){
        new Exam06();
    }
}
