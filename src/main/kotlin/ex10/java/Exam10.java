package ex10.java;

import java.util.Optional;

public class Exam10 {

    public Exam10(ExamUser examUser){
        // java의 null 체크.. 빡셈
        // 또한 !부정 연산을 놓칠 수 있다
        // 그래서 StringUtils.isNotBlank() 같이 만들어 쓰기 시작함
        if(examUser != null && examUser.getName() != null){
            if(!examUser.getName().isBlank()){
                System.out.println(examUser.getName());
            }
        }
        
        // Optional을 사용한다 해도.. 마찬가지
        var optionalUser = Optional.ofNullable(examUser);
        optionalUser.ifPresent(it->{
            Optional.ofNullable(examUser.getName()).ifPresent(name->{
                if(!name.isBlank()){
                    System.out.println(name);
                }
            });
        });
    }

    public static void main(String[] args){
        new Exam10(new ExamUser());
    }
}

class ExamUser{
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

