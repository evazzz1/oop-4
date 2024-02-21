package org.example;
//1)расширить класс калькулятор на умножение
//2)расширить класс калькулятор на деление
//3)расширить класс калькулятор на бинарный перевод(принимаемые значения как стринг,
// так и инт - тут необходимо подумать как наилучшим образом реализовать,
// что будет если будут приниматься округляемые Double/Float
// (округляемые -> с нулем на конце прим. 3.0 , 4.0 и тд т))
//
//Формат сдачи: ссылка на гитхаб проект

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Integer [] arr = new Integer[] {1,2,3,4,5};
        Double [] arr2 = new Double[] {1.0,2.0,0.0,4.0,3.0};
        Calculator calc = new Calculator();
        System.out.println("calc.sum(Arrays.asList(arr)) = " + calc.sum(Arrays.asList(arr)));
        System.out.println("calc.multiply(Arrays.asList(arr)) = " + calc.multiply(Arrays.asList(arr)));
        System.out.println("calc.division(Arrays.asList(arr)) = " + calc.division(Arrays.asList(arr)));
        String a = "40.1";
        System.out.println("calc.toBinary(a) = " + calc.toBinary(a));
    }
}