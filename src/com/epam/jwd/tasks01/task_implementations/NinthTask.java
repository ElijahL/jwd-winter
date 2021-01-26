package com.epam.jwd.tasks01.task_implementations;

import com.epam.jwd.tasks01.Task;

public class NinthTask implements Task {
    private Double radius;
    private Double perimeter;
    private Double area;

    public Task init(double radius) throws IllegalArgumentException {
        if(radius < 0) {
            throw new IllegalArgumentException("Passed argument is invalid: " + radius);
        }
        this.radius = radius;
        return this;
    }

    @Override
    public void solve() {
        perimeter = 2 * Math.PI * radius;
        area = Math.PI * radius * radius;
    }

    @Override
    public Object result() {
        return answer();
    }

    @Override
    public String answer() {
        return "Perimeter: " + perimeter + ". Area: " + area;
    }
}
