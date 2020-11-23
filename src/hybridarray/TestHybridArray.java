package hybridarray;

import java.util.Random;

public class TestHybridArray {

    static int max = 100000;
    static int[] array = new int[max];
    static HybridArray hybrid = new HybridArray();
    static Random rnd = new Random();
    static long time = System.currentTimeMillis();

    public static void main(String[] args) {
        populateArray(1000);
        populateArrayIndex(1000,15);
        ArrayRemoveFirst();
        ArrayRemoveLast();
        ArrayRemoveAt(5);
        ArrayGet(4);
        ArrayClear();
        ArraySize();
        ArrayPrint();
    }

    private static void populateArray(int range) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            hybrid.addFirst(rnd.nextInt(range));
        }
        System.out.println("geçen süre populateArray: " + (System.currentTimeMillis() - time));
    }

    private static void populateArrayIndex(int range, int index) {
        hybrid.insert(range, index);
        System.out.println("geçen süre populateArrayIndex: " + (System.currentTimeMillis() - time));
    }

    private static void ArrayRemoveFirst() {
        hybrid.removeFirst();
        System.out.println("geçen süre ArrayRemoveFirst: " + (System.currentTimeMillis() - time));
    }
    private static void ArrayRemoveLast() {
        hybrid.removeLast();
        System.out.println("geçen süre ArrayRemoveLast:  " + (System.currentTimeMillis() - time));
    }

    private static void ArrayRemoveAt(int index) {
        hybrid.removeAt(index);
        System.out.println("geçen süre ArrayRemoveAt: " + (System.currentTimeMillis() - time));
    }

    private static void ArrayGet(int index) {
        hybrid.get(index);
        System.out.println("geçen süre ArrayGet: " + (System.currentTimeMillis() - time));
    }

    private static void ArrayClear() {
        hybrid.clear();
        System.out.println("geçen süre ArrayClear: " + (System.currentTimeMillis() - time));
    }

    private static void ArraySize() {
        hybrid.size();
        System.out.println("geçen süre ArraySize: " + (System.currentTimeMillis() - time));
    }

    private static void ArrayPrint() {
        hybrid.println();
        System.out.println("geçen süre ArrayPrint: " + (System.currentTimeMillis() - time));
    }
    
    
}
