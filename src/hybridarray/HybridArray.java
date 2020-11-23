package hybridarray;

import dynamicarray.DynamicArray;
import mylinkedlist.MyLinkedList;

public class HybridArray {
    
    DynamicArray array=new DynamicArray();
    MyLinkedList list=new MyLinkedList();
    
    public HybridArray(){
        
    }

    public void addLast(int n){
        array.add(n);
    }
    public void addFirst(int n){
        list.addFirst(n);        
    }
    public void insert(int n,int index){
     //array.add(n, index);
     list.insert(n, index);
    }
    public void removeFirst(){
        list.removeFirst();
    }
    public void removeLast(){
        list.removeLast();
    }
    public void removeAt(int index){
        list.removeAt(index);
        //array.delete_index(index);
    }
    public void get(int index){
        list.get(index);
        //array.get(index);
    }
    public void clear(){
        list.clear();
        //array.clear();
    }
    public void size(){
        list.size();
        //array.capacity();
    }
    public void println(){
        list.print();
        //array.printElements();
        
    }
    
    
    
    public static void main(String[] args) {
        
        
    }
    
}
