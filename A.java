/**
 * Пользовательский класс A для тестирования
 */
public class A {
    Integer a;

    public A(Integer a) {
        this.a = a;
    }
    @Override 
    public String toString(){
        String str;
        str = this.a.toString();
        return str;
    }
}
