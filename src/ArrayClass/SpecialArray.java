package ArrayClass;

import Exceptions.MyArrayDataException;
import Exceptions.MyArraySizeException ;

public class SpecialArray {

    int summ = 0;

    public SpecialArray(String[][] array) throws MyArraySizeException {
        /*Проверка размерности массива. Должен быть 4х4*/
        int cnt = 0;
        for (String [] arr: array) {
            cnt += array.length;
        }
       if (cnt != 16) throw new MyArraySizeException();

        /*Парсинг строки к числу и суммирование*/
       for (int i = 0; i < 4; i++){
           for (int j = 0; j < 4; j++){
               try {
                   summ += Integer.parseInt(array[i][j]);
               } catch (NumberFormatException e){
                    throw new MyArrayDataException("Невозможно привести значение ячейки к целочисленному типу. Array[" + i + "][" + j + "]");
               }
           }
       }
    }

    public void showSumm() {
        System.out.println("Итоговая сумма: " + summ);
    }
}
