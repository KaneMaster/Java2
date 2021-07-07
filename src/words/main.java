package words;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class main {

    public static void main(String[] args) {

        String[] Fruits = {"Яблоки", "Груши", "Персики", "Никтарины", "Яблоки", "Яблоки", "Бананы", "Персики", "Сливы", "Груши"};
        Integer cnt;
        Map<String, Integer> countFruits = new HashMap<>();
        Set<String> keys = new HashSet<>();
        /* Подсчёт значмений */
        for (String fr : Fruits) {
            cnt = countFruits.getOrDefault(fr, 0);
            countFruits.put(fr,++cnt);
            keys.add(fr);
        }

        /*Вывод оригинальных значений*/
        System.out.println(keys);

        System.out.println();
        /* Вывод количества повторений*/
        System.out.println(countFruits);

        }
    }

