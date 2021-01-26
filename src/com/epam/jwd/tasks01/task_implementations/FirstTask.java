package com.epam.jwd.tasks01.task_implementations;

import com.epam.jwd.tasks01.Task;

public class FirstTask implements Task {
    private Integer lastDigit;
    private Integer result;

    public Task init(int lastDigit) throws IllegalArgumentException {
        if(lastDigit < 0  || lastDigit > 9){
            throw new IllegalArgumentException("Passed arguments are invalid: " + lastDigit);
        }
        this.lastDigit = lastDigit;
        return this;
    }

    @Override
    public void solve() {
         result = lastDigit != null ? (int) (Math.pow(lastDigit, 2) % 10) : null;
    }

    @Override
    public Object result(){
        return result;
    }

    @Override
    public String answer() {
        return "The last digit of the squared number is " + result;
    }
}
