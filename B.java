/**
 * Пользовательский класс B для тестирования
 */
public class B extends A{
    String s;

    public B(Integer a, String s) {
        super(a);
        this.s = s;
    }
    @Override 
    public String toString(){
        String str;
        str = this.a.toString() + " " + s;
        return str;
    }
}
