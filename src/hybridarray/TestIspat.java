package hybridarray;

public class TestIspat {
    
    static HybridArray hybrid=new HybridArray();

    public static void main(String[] args) {
        
        long time=System.currentTimeMillis();
        
        hybrid.addFirst(5);
        hybrid.addLast(7);
        hybrid.clear();
        hybrid.get(2);
        hybrid.insert(2, 7);
        hybrid.println();
        hybrid.removeAt(1);
        hybrid.removeFirst();
        hybrid.removeLast();
        hybrid.size();
        
    }
}
