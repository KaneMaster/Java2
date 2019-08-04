package telephonebook;

import java.util.*;

public class TelephoneBook {

    Map<String, ArrayList<Integer>> phoneBook;

    public TelephoneBook() {
        phoneBook = new HashMap<>();
    }

    /**
     * Добавляет новую запись в телефонную книгу
     * @param soname фамилия
     * @param number номер телефона
     */

    public void add(String soname, Integer number){
        ArrayList<Integer> numbers = phoneBook.getOrDefault(soname, new ArrayList<>());
        numbers.add(number);
        phoneBook.put(soname,numbers);
    }

    /**
     * Ищет записи в телефонной книге по фамилии
     * @param soname фамилия
     */

    public void get(String soname){
        ArrayList<Integer> numbers = phoneBook.get(soname);
        if (numbers == null) {
            System.out.println("Записей для фамилии " + soname + " нет.");
        } else {
            System.out.println("Записи телефонных номеров для фамилии " + soname);
            for (int i = 0; i < numbers.size(); i++) {
                System.out.println(numbers.get(i));
            }
        }
    }
}
