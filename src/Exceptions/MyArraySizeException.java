package Exceptions;

public class MyArraySizeException extends IllegalArgumentException {

    public MyArraySizeException() {
        super("Не верная размерность массива. Массив должен быть 4х4");
    }
}
