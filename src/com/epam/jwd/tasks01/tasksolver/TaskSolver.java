package com.epam.jwd.tasks01.tasksolver;

import com.epam.jwd.tasks01.Task;
import com.epam.jwd.tasks01.tasksolver.tasksolver_exceptions.LoadedTasksException;
import com.epam.jwd.tasks01.tasksolver.tasksolver_exceptions.SolvedTasksException;

import java.util.ArrayList;
import java.util.List;

public class TaskSolver {
    List<Task> tasks;
    boolean isTasksLoaded;
    boolean isSolved;

    public TaskSolver loadTasks(List<Task> tasks){
        this.tasks = new ArrayList<>(tasks);
        isTasksLoaded = true;
        isSolved = false;
        return this;
    }

    public TaskSolver solveTasks() throws LoadedTasksException {
        if (!isTasksLoaded){
            throw new LoadedTasksException("Tasks are not loaded.");
        } else {
            for (Task task : tasks) {
                task.solve();
            }
            isSolved = true;
            return this;
        }
    }

    public void printAnswers() throws LoadedTasksException, SolvedTasksException{
        if (!isTasksLoaded){
            throw new LoadedTasksException("Tasks are not loaded.");
        } else if(!isSolved){
            throw new SolvedTasksException("Tasks are not solved.");
        } else {
            for (int i = 0; i < tasks.size(); ++i) {
                System.out.println((i + 1) + ") " + tasks.get(i).answer());
            }
        }
    }
}
