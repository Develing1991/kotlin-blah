package ex08.java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class Exam08 {

    public Exam08(Store store){ // service
        // 넘겨주는 쪽도 Optional로 한번 감싸줘서 전달해야 함
        // 변수가 한두개도 아니고 Optional을 다 붙여야 하나..
        // Null이면 default 값을 넣어줘야 할 때도 있고, 예외를 던져줘야 할 때도 있다..
        var stringRegisteredAt = toLocalDateTimeString(Optional.ofNullable(store.getRegisteredAt()));
    }

    public String toLocalDateTimeString(Optional<LocalDateTime> localDateTime){


//        if (localDateTime == null){
//            _temp = LocalDateTime.now();
//        }else {
//            _temp = localDateTime;
//        }
        LocalDateTime _temp = localDateTime.orElseGet(() -> LocalDateTime.now());
        // LocalDateTime _temp = localDateTime.orElseGet(LocalDateTime::now);
        // Optional이나 Null에대한 코드를 작성해야 함 실수할 가능성이 높다
        return _temp.format(DateTimeFormatter.ofPattern("yyyy MM dd"));
    }

    public static void main(String[] args){

        // client ->
        var registreDto = new Store();
        // registreDto.setRegisteredAt(LocalDateTime.now());

        new Exam08(registreDto);
    }
}

class Store {
    // @NotNull
    private LocalDateTime registeredAt;

    public LocalDateTime getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(LocalDateTime registeredAt) {
        this.registeredAt = registeredAt;
    }
}
