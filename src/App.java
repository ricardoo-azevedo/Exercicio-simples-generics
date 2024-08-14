import util.utilClass;

import java.util.Arrays;

import util.ClasseGenerica;
import util.ClasseGenericaTipoN;
import util.ClasseGenericaCoringa;
import java.util.List;
public class App {

    public static void main(String[] args) throws Exception {
        
        Integer[] intArray = {1, 2, 3, 4};
        String[] stringArray = {"Ola "};
        utilClass.printArray(stringArray);
        utilClass.printArray(intArray);




        ClasseGenerica<Integer> integerBox = new ClasseGenerica<>();
        ClasseGenerica<String> stringBox = new ClasseGenerica<>();
        integerBox.setG(10); 
        stringBox.setG("Ola");




        ClasseGenericaTipoN<Float> floatBox = new ClasseGenericaTipoN<>();
        floatBox.setN(4.1f);




        List<Integer> intList = Arrays.asList(1,2,3,4);
        ClasseGenericaCoringa.printNumbers(intList);

        List<Double> doubleList = Arrays.asList(1.2, 2.3, 4.5);
        ClasseGenericaCoringa.printNumbers(doubleList);
        
    }

}
