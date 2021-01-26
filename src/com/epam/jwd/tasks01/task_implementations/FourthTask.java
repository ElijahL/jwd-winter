package com.epam.jwd.tasks01.task_implementations;

import com.epam.jwd.tasks01.Task;

public class FourthTask implements Task {
    Integer[] numbers = new Integer[4];
    Boolean result;

    public FourthTask init(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        numbers[0] = firstNumber;
        numbers[1] = secondNumber;
        numbers[2] = thirdNumber;
        numbers[3] = fourthNumber;
        return this;
    }

    @Override
    public void solve() {
        int counter = 0;
        for(Integer number: numbers){
            if (counter >= 2){
                result = true;
                break;
            }
            if (isEven(number)){
                counter++;
            }
        }
        result = false;
    }

    @Override
    public Object result() {
        return result;
    }

    @Override
    public String answer() {
        return result.toString();
    }

    private Boolean isEven(Integer number){
        return number % 2 == 0;
    }
}
