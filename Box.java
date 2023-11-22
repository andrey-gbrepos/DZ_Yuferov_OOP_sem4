
/*
 * Класс Box c обобщенным типом данных T
 */
public class Box <T> { 
    private T myOb;

    public Box(T ob) {
        myOb = ob;
    }
    /**
     * Возвращает объект типа Box
     * @return
     */
    public T getMyOb() {
        return myOb;
    }

    /**
     * Выводит на печать объект заранее неизвестного типа
     * @param ob
     */
    public void printBoxContents(T ob){
        System.out.println(ob + " - Объект класса "+ myOb.getClass().getName());
    }
  
}
