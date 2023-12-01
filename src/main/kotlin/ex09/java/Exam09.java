package ex09.java;

public class Exam09 {

    public Exam09(StoreUser storeUser){
        // service logic

        // if문 길어지면 가독성 떨어짐
        if (storeUser.getRole().equals("MASTER")){

        } else if (storeUser.getRole().equals("ADMIN")) {

        } else if (storeUser.getRole().equals("USER")) {

        }else {

        }

        // 그렇다고 switch문을 사용하면 break를 실수로 안적을 수도 있다
        var role = "";
        switch (storeUser.getRole()){
            case "MASTER":
                role = "MASTER"; //break를 실수로 안적을 수도 있다
            case "ADMIN":
                role = "ADMIN";
                break;
            case "USER":
            default:
                break;
        }

        try {

        }catch (Exception e){
            if(e instanceof NullPointerException){

            } else if (e instanceof  NumberFormatException) {
                // 이렇게 해도 e의 타입이 Exception라 (NumberFormatException)로 캐스트 해줘야함
            }
        }
    }

    public static void main(String[] args){

    }
}

class StoreUser{
    private String name;
    private String role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

