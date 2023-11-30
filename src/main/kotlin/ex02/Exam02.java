package ex02;

public class Exam02 {
    private int a;
    public Exam02(){
        var b = 20; // 타입 추론
        // var b = null; // 불가능
        int c = 30;
        int d;
        // Integer e = new Integer(null); // Null Point
        Integer e = new Integer(100);
        Integer f = 20;
        Integer g = null;

        callFunction(a);
        callFunction(b);
        callFunction(c);
        //callFunction(d);
        callFunction(e);
        callFunction(f);
        //callFunction(g); // Null Point
        //Optional.of(g).orElseThrow(()-> new RuntimeException("null"));

    }

    public void callFunction(Integer i){
        var temp = (i == null) ? "null 값 입니다" : i;
        System.out.println(i);
    }
    public void callFunctionDefault(Integer i){
        var temp = (i == null) ? Integer.valueOf(100) : Integer.valueOf(i);
    }
    public static void main(String[] args){
        new Exam02();
    }
}
