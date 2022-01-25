package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {
    public static void main(String[] args) {
        //Way 1:

        Predicate<Integer> p = new PredicateImpl();
        System.out.println(p.test(30));


        // way 2: anonymous
        Predicate predicate = new Predicate() {
            @Override
            public boolean test(Object o) {
                return false;
            }
        };
        Predicate<Integer> lambda = (obj) -> obj > 50;
        System.out.println(lambda.test(5));

        List<Integer> integers = Arrays.asList(10, 20, 40, 31, 99, 56);
        for (int i : integers) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        List<Integer> odd = integers
                .stream()
                .filter(integer -> integer % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(odd);


    }
}

//way1: traditional
class PredicateImpl implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return integer > 50;
    }
}
