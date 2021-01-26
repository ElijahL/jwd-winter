package com.epam.jwd.tasks01.task_implementations;

import com.epam.jwd.tasks01.Task;

public class TenthTask implements Task {
    private int numberOfArguments;
    private Double[] arguments;
    private Double[] values;

    public Task init(double beginOfSegment, double endOfSegment, double step) throws IllegalArgumentException {
        if(!isArgsCorrect(beginOfSegment, endOfSegment, step)) {
            throw new IllegalArgumentException("Passed arguments are invalid: ["
                    + beginOfSegment + ", "
                    + endOfSegment + ", "
                    + step + "]");
        }

        Double beginOfSegment1 = beginOfSegment;
        Double endOfSegment1 = endOfSegment;
        Double step1 = step;
        numberOfArguments = (int) Math.round((endOfSegment - beginOfSegment) / step);
        arguments = new Double[numberOfArguments + 1];
        for (int i = 0; i < numberOfArguments; ++i){
            arguments[i] = beginOfSegment + i * step;
        }
        arguments[numberOfArguments] = endOfSegment;

        return this;
    }

    @Override
    public void solve() {
        values = new Double[numberOfArguments + 1];
        for (int i = 0; i < numberOfArguments + 1; ++i){
            values[i] = Math.tan(arguments[i]);
        }
    }

    @Override
    public Object result() {
        return values;
    }

    @Override
    public String answer() {
        StringBuilder ans = new StringBuilder("\n");
        for (int i = 0; i < numberOfArguments; ++i){
            ans.append(arguments[i]).append("\t").append(values[i]).append("\n");
        }
        return ans.toString();
    }

    boolean isArgsCorrect(double beginOfSegment, double endOfSegment, double step){
        if (beginOfSegment > endOfSegment){
            return false;
        } else {
            return beginOfSegment != endOfSegment ? step > 0 : step == 0;
        }
    }
}
