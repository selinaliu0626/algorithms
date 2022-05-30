package mymethod;

public class Pair<V,E> {
   public V first;
   public E second;
    public Pair(V v,E e){
        first=v;
        second=e;
    }
    public void setFirst(V v){
        first=v;
    }
    public void setSecond(E e){
        second=e;
    }

}
