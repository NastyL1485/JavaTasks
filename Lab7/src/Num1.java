public class Num1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] one = new int[array.length / 2];
        int[] two = new int[array.length - one.length];
        System.arraycopy(array, 0, one, 0, one.length);
        System.arraycopy(array, one.length, two, 0, two.length);

        SummationThread thread1 = new SummationThread(one);
        SummationThread thread2 = new SummationThread(two);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int result = thread1.getResult() + thread2.getResult();
        System.out.println(result);
    }
}

class SummationThread extends Thread {
    private int[] array;
    private int result;

    public SummationThread(int[] array) {
        this.array = array;
    }

    public void run() {
        for (int num : array) {
            result += num;
        }
    }

    public int getResult() {
        return result;
    }
}
