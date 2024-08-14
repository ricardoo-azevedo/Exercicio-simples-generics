package util;

public class utilClass {
    
    public static <T> void printArray(T[] array){
        for (T element : array){
            System.out.println(element);
        }
    }
}
