package com.epam.jwd.tasks01.task_implementations;

import com.epam.jwd.tasks01.Task;

public class SeventhTask implements Task {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private int result;



    public Task init(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        return this;
    }

    @Override
    public void solve() {
        double firstLength = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        double secondLength = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
        if (firstLength < secondLength){
            result = 1;
        } else if(firstLength > secondLength){
            result = 2;
        } else {
            result = 0;
        }
    }

    @Override
    public Object result() {
        return result;
    }

    @Override
    public String answer() {
        if(result != 0){
            return "Dot No." + result + " is closer to zero.";
        }
        return "They are at the same distance.";
    }
}
