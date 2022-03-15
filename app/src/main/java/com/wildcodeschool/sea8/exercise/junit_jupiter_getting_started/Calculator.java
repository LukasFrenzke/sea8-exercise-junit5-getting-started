package com.wildcodeschool.sea8.exercise.junit_jupiter_getting_started;

public class Calculator {

    private int number1;
    private int number2;
    
    public Calculator(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public int add(int number1, int number2){
        return number1 + number2;
    }

    public int sub(int number1, int number2){
        return number1 - number2;
    }

    public int mul(int number1, int number2){
        return number1 * number2;
    }

    public int div(int number1, int number2){
        return number1 / number2;
    }
}
