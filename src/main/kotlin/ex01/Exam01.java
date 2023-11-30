package ex01;

public class Exam01 {
    public Exam01(){
        String name = "lee";
        String format = "사용자의 이름은: %s";
        String result = String.format(format, name);
        System.out.println(result);

        int p_age = 10; // default 0
        Integer r_age = 20; // default null

        double p_double = 10d;
        Double r_double = 20.0d;

        float p_float = 10f;
        Float r_float = 20.0f;

        long p_long = 10L;
        Long r_long = 20L;

        boolean p_boolean = false;
        Boolean r_boolean = null;
    }
    public static void main(String[] args){
        new Exam01();
    }
}
