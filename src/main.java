import ArrayClass.SpecialArray;
import Exceptions.MyArrayDataException;
import Exceptions.MyArraySizeException;

public class main {

    public static void main(String[] args) {

        String[][] array = {{"1","2","3","4"},{"5","6","7","8"},{"9","10","11","12"},{"13","14","15","16"}};
        try {
            SpecialArray spa = new SpecialArray(array);
            spa.showSumm();
        } catch (MyArraySizeException | MyArrayDataException e){
            System.out.println("Увы и ах, но произошла ошибка.");
            e.printStackTrace();
        }
    }
}
