public class MyThread extends Thread {


    private int startIndex;
    private float [] array;

    public MyThread(int inx, float[] ar) {
        startIndex = inx;
        array = ar;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < array.length; i++) {
            array[i] = (float)(array[i] * Math.sin(0.2f + (i + startIndex) / 5) * Math.cos(0.2f + (i + startIndex) / 5) * Math.cos(0.4f + (i + startIndex) / 2));
        }

    }
}
