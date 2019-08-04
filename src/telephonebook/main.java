package telephonebook;

public class main {
    public static void main(String[] args) {
        TelephoneBook tb = new TelephoneBook();

        tb.add("Иванов", 2335654);
        tb.add("Иванов", 2337711);
        tb.add("Петров", 2760945);
        tb.add("Сидоров", 9988547);

        tb.get("Иванов");
        tb.get("Петров");
        tb.get("Сидоров");
        tb.get("Коклюшкин");
    }

}
