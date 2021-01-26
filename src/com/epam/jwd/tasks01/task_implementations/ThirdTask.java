package com.epam.jwd.tasks01.task_implementations;

import com.epam.jwd.tasks01.Task;

public class ThirdTask implements Task {
    private Double area;
    private Double result;

    public Task init(double area) throws IllegalArgumentException {
        if (area < 0){
            throw new IllegalArgumentException("Passed argument is invalid: " + area);
        }
        this.area = area;
        return this;
    }

    @Override
    public void solve() {
        result = area / 2;
    }

    @Override
    public Object result() {
        return result;
    }

    @Override
    public String answer(){
        return "The area of the inscribed square is " + result + ". Areas are differ 2 times.";
    }
}
