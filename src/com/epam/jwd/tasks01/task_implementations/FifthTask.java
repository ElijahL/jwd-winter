package com.epam.jwd.tasks01.task_implementations;

import com.epam.jwd.tasks01.Task;

public class FifthTask implements Task {
    private Integer number;
    private Boolean result;

    public Task init(int number) throws IllegalArgumentException {
        if(number <= 0) {
            throw new IllegalArgumentException("Passed argument is invalid: " + number);
        }
        this.number = number;
        return this;
    }

    @Override
    public void solve() {
        int sumOfDividers = 0;
        for (int i = 1; i < number/2; ++i){
            if(number % i == 0){
                sumOfDividers += i;
            }
        }
        result = sumOfDividers == number;
    }

    @Override
    public Object result() {
        return result;
    }

    @Override
    public String answer() {
        return result.toString();
    }
}
