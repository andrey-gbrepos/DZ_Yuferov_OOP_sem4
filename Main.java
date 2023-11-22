// ```Цель: Практика создания обобщенных классов и методов для обработки 
// различных типов данных. Инструкции:
//  Создайте обобщенный класс Box, который будет представлять собой коробку, 
// способную хранить объекты разных типов. Класс Box должен иметь поле для хранения 
// объекта и соответствующие геттеры и сеттеры.
//  Создайте метод printBoxContents, который принимает объект класса Box и выводит 
// на экран содержимое этой коробки. Обратите внимание, что этот метод должен работать 
// с любым типом объекта, хранящегося в Box. Используйте обобщенные методы для 
// достижения этой цели.
//  Создайте еще один обобщенный класс Pair, который будет представлять собой пару 
// объектов. Этот класс должен иметь два поля для хранения объектов и соответствующие 
// геттеры и сеттеры.
//  Создайте метод swapPairs, который принимает массив объектов типа Pair и меняет 
// местами элементы в каждой паре. Например, если у вас есть пара (A, B), после вызова 
// swapPairs она должна стать парой (B, A). Используйте обобщенные методы для реализации 
// этой операции.
//  Напишите программу, которая демонстрирует использование вашего обобщенного класса 
// Box и методов printBoxContents и swapPairs для разных типов данных (например, целых 
// чисел, строк, объектов пользовательских классов и т. д.).
//  Выведите результаты выполнения программы на экран, чтобы показать, что методы работают 
// с разными типами данных.
// Примечания:
//  Обязательно добавьте комментарии к вашему коду, чтобы объяснить, какие части кода 
// выполняют какие задачи и как обобщенные типы используются в вашей программе.
//  При реализации метода swapPairs, учтите, что он должен работать с любыми типами 
// объектов внутри пары.
//  Экспериментируйте с разными типами данных, чтобы продемонстрировать универсальность 
// вашего кода.
//  Удачи в выполнении задания!

import java.util.ArrayList;
import java.util.List;

/**
 * Main
 */

public class Main {
    
    public static void main(String[] args) {
        // Подготовка данных для демонстрации
        Box <String> str = new Box<>("show");
        A d = new A(5);
        B s = new B(d.a,"строка");
        Box <A> a = new Box<>(d);
        Box <B> b = new Box<>(s);
        List <String> lst= new ArrayList<>(); 
        lst.add("пять");
        lst.add("шесть");
        lst.add("семь");
        Box <List<String>> ls = new Box<List<String>>(lst);      
        Pair <Integer, String> pr1 = new Pair<Integer,String>(25, "двадцать пять");
        Pair <String, Double> pr2 = new Pair<>("Тридцать",30.5);
        Pair <Integer, List<String>> pr3 = new Pair<>(100,lst);
        
        Box <Pair<?, ?>> pr = new Box<>(pr1);

        //Демонстрация класса Box
        System.out.println("Демонстрация работы класса Box  и его метода printBoxContents");
        System.out.println("Вывод строкового значения:");
        str.printBoxContents(str.getMyOb());
        System.out.println("Вывод объектов пользовательских классов:");
        a.printBoxContents(a.getMyOb());
        b.printBoxContents(b.getMyOb());
        System.out.println("Вывод списка");
        ls.printBoxContents(ls.getMyOb());
        System.out.println("Вывод объекта класса Pair");
        pr.printBoxContents(pr.getMyOb());
        // Демонстрация класса Pair
        System.out.println();
        System.out.println("Демонстрация класса Pair:");
        System.out.println("Вывод числа и строки:");
        System.out.println(pr1);
        System.out.println("Вывод строки и double:");
        System.out.println(pr2);
        System.out.println("Вывод числа  и списка");
        System.out.println(pr3);
        System.out.println("Создание массива из объектов Pair");
        List <Pair<?, ?>> prArr = new ArrayList<>();
        prArr.add(pr1);
        prArr.add(pr2);
        prArr.add(pr3);
        System.out.println(prArr);
        System.out.println("Использование метода swapPairs");
        Pair<?, ?> array = new Pair<>();
        array.swapPairs(prArr);
        System.out.println(prArr);
    }
}