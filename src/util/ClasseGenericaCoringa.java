package util;

import java.util.List;

public class ClasseGenericaCoringa<C> {
    public static void printNumbers(List<? extends Number> list){
        for(Number n: list){
            System.out.println(n);

        }
    }
}
