package org.example;

import java.util.List;

import static java.lang.Integer.parseInt;

public class Calculator {
    public double sum(List<? extends Number> array) {
        double result = 0;
        for (int i = 0; i < array.size(); i++) {
            result += array.get(i).doubleValue();
        }
        return result;
    }

    public double multiply(List<? extends Number> array) {
        double result = 1;
        for (int i = 0; i < array.size(); i++) {
            result *= array.get(i).doubleValue();
        }
        return result;
    }

    public double division(List<? extends Number> array) {
        double result = 1;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).doubleValue() == 0.0) {
                System.out.println("Ошибка нельзя делить на ноль");
                return -1;
            }
            result /= array.get(i).doubleValue();
        }
        return result;
    }
    public String toBinary(String input)
    {
        if(input.contains(".")) {
            return toBinary(Double.parseDouble(input));
        }
        return toBinary(parseInt(input));
    }
    public String toBinary(int num)
    {
        return Integer.toBinaryString(num);
    }
    public String toBinary(double num)
    {
        int left = (int) num;
        String bin = toBinary(left) + "";
        bin += ".";
        float right = (float) num - (int) num;
        for (int i = 0; i < 20; i++) {
            right = right * 2 - (int) right * 2;
            bin = bin + (int) right;
            if (right == 1.0) {
                break;
            }
        }
        return bin;
    }

}


