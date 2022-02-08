import ArrayList.ObjectArrayList;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        Integer[] intArray = new Integer[4];

        intArray[0] = 0;
        intArray[1] = 1;
        intArray[2] = 2;
        intArray[3] = 3;

        ObjectArrayList objectArrayList = new ObjectArrayList(intArray);

        objectArrayList.doulbeArraySize(intArray.length);

        Integer[] addingToArray = objectArrayList.addToObjectArrayList(4);

        for(Integer num : addingToArray) {
            System.out.println(num);
        }

        System.out.println("Testing Elements method: " + objectArrayList.getElementsFromObjectArrayList());

        for (Integer num : objectArrayList.getElementsFromObjectArrayList()) {

            System.out.println(num);

        }

       for(int i = 0; i < intArray.length; i++) {
           System.out.println(intArray[i]);
       }
    }
}
