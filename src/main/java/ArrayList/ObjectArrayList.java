package ArrayList;

import java.util.function.Function;

public class ObjectArrayList {

    private Integer[] intArray;
    private Integer size = intArray.length;

    public ObjectArrayList(Integer[] intArray) {
        this.intArray = intArray;
        this.size = size;
    }

    public ObjectArrayList() {

    }

    public Integer getLength() {

        return ObjectArrayList.this.intArray.length;
    }

    public Integer[] getElementsFromObjectArrayList() {
        Integer[] intArray = this.intArray;
        Integer[] newIntArray = new Integer[ObjectArrayList.this.getLength()];

        for (Integer num : intArray) {
            intArray[num] = newIntArray[num];
        }

        return newIntArray;
    }

    public Integer[] addToObjectArrayList(Integer numberToAdd) {

        Integer[] intArray = this.intArray;

        Integer[] newIntArray = new Integer[intArray.length + 1];
        for (Integer num : intArray) {
            intArray[num] = newIntArray[num];
        }

        newIntArray[newIntArray.length - 1] = numberToAdd;

        return newIntArray;
    }

    public Integer[] doulbeArraySize(Integer arraySize) {
        Integer[] newIntArray = new Integer[arraySize * 2];

        System.out.println("New Array Length: " + newIntArray.length);
//        for (Integer num : newIntArray) {  throws null pointer exception because the new elements aren't added to the array yet
//            System.out.println(newIntArray[num]);
//        }

        return newIntArray;
    }

    public static Integer[] getArrayFromObjectArrayList(ObjectArrayList objectArrayList) {

        Integer[] intArray = new Integer[objectArrayList.intArray.length];
        Integer[] newIntArray = new Integer[intArray.length];

        for(int i = 0; i < intArray.length; i++) {
            newIntArray[i] = intArray[i];
        }

        return newIntArray;

    }


}
