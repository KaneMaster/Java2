public class main {


    public static void main(String[] args) {

        final int size = 10000000;
        final int h = size / 2;
        float[] arr = new float[size];
        float[] arrb = new float[size];

        for (int i = 0; i < size ; i++) {
            arr[i] = 1;
            arrb[i] = 1;
        }

        /* Последовательный расчёт */

        long a = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println("Последовательный расчет: " + (System.currentTimeMillis() - a));

        float[] a1 = new float[h];
        float[] a2 = new float[h];

        /* Параллельный расчёт */

        a = System.currentTimeMillis();

        System.arraycopy(arrb, 0, a1, 0, h);
        System.arraycopy(arrb, h, a2, 0, h);


        MyThread thr1 = new MyThread(0, a1);
        MyThread thr2 = new MyThread(h, a2);

        thr1.start();
        thr2.start();

        try {
              thr1.join();
              thr2.join();
        } catch (InterruptedException e) {
              e.printStackTrace();
        }

        System.arraycopy(a1, 0, arrb, 0, h);
        System.arraycopy(a2, 0, arrb, h, h);

        System.out.println("Параллельный расчет: " + (System.currentTimeMillis() - a));

        /*
        boolean allCorrect = true;
        for (int i = 0; i < size ; i++) {
           if (arr[i] != arrb[i]) {
               allCorrect = false;
               break;
           }
        }
        System.out.println(allCorrect);
         */

    }
}
