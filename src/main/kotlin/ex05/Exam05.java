package ex05;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exam05 {

    private Predicate<String> stringPredicate = new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.equals("3");
        }
    };
    public Exam05(){
        var strList = List.of(
                "1",
                "2",
                "3",
                "abc"
        );

        // @FunctionalInterface lambda
        var result1 = strList.stream().filter( it -> {
                return it.equals("2");
            }
        ).collect(Collectors.toList());

        var result2 = strList.stream()
                .filter( stringPredicate)
                .collect(Collectors.toList());

        var result3 = strList.stream()
                .filter(
                        new Predicate<String>() {
                            @Override
                            public boolean test(String s) {
                                return s.equals("3");
                            }
                        }
                )
                .collect(Collectors.toList());

        var result4 = strList.stream()
                .filter( s -> s.equals("3") )
                .collect(Collectors.toList());

        var result5 = strList.stream().filter(
                Predicate.not(s -> s.equals("1"))
        ).collect(Collectors.toList());
    }




    public static void main(String[] args){
        new Exam05();
    }
}
