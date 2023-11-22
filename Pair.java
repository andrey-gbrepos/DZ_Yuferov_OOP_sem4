import java.util.List;
/**
 * Класс Pair с двумя обобщенными типами T, V
 */
public class Pair<T, V> {
    private T myobT;
    private V myobV;
    
    public Pair() {
        this.myobT = null;
        this.myobV = null;
    }
    public Pair(T obT, V obV) {
        this.myobT = obT;
        this.myobV = obV;
    }
   
   //Геттеры и сеттеры 
    public T getMyobT() {
        return myobT;
    }

    public void setMyobT(T myobT) {
        this.myobT = myobT;
    }

    public V getMyobV() {
        return myobV;
    }

    public void setMyobV(V myobV) {
        this.myobV = myobV;
    }
    /**
     * Метод принимает массив с типом данных Pair с заранее неизвестными типами 
     * его составляющих и меняет местами состовляющие каждого объекта Pair
     * @param pairArr
     */
    public  void swapPairs (List <Pair<?,?>> pairArr){ 
        Pair<?,?> pair;     
        for (int i = 0; i < pairArr.size(); i++) { 
            pair = new Pair<>(pairArr.get(i).getMyobV(),pairArr.get(i).getMyobT());
            pairArr.set(i, pair);    
        }
}
    
    @Override 
    public String toString(){
        String str;
        str = this.myobT.toString()+ " " + this.myobV.toString();
        return str;
    }

    
}
