package com.epam.jwd.tasks01.task_implementations;

import com.epam.jwd.tasks01.Task;

public class EightsTask implements Task {
    private Double x;
    private Double result;

    public Task init(double x){
        this.x = x;
        return this;
    }

    @Override
    public void solve() {
        if(x >= 3){
            result = -Math.pow(x, 2) + 3 * x + 9;
        } else {
            result = 1 / (Math.pow(x, 3) - 6);
        }
    }

    @Override
    public Object result() {
        return result;
    }

    @Override
    public String answer() {
        return "F(x) = " + result;
    }
}
