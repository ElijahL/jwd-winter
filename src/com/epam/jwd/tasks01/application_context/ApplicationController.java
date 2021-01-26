package com.epam.jwd.tasks01.application_context;

import com.epam.jwd.tasks01.Task;
import com.epam.jwd.tasks01.tasksolver.TaskSolver;
import com.epam.jwd.tasks01.tasksolver.tasksolver_exceptions.LoadedTasksException;
import com.epam.jwd.tasks01.tasksolver.tasksolver_exceptions.SolvedTasksException;
import com.epam.jwd.tasks01.task_implementations.*;

import java.util.List;

public class ApplicationController {
    public static void start() {
        try {
            List<Task> tasks = initTasks();
            new TaskSolver().loadTasks(tasks).solveTasks().printAnswers();
        } catch (IllegalArgumentException | LoadedTasksException | SolvedTasksException ex) {
            ex.printStackTrace();
        }
    }

    private static List<Task> initTasks() {
        return List.of(new FirstTask().init(5),
                new SecondTask().init(5, 1997),
                new ThirdTask().init(1.6),
                new FourthTask().init(1, 2, 3, 4),
                new FifthTask().init(6),
                new SixthTask().init(1678),
                new SeventhTask().init(1, 2, 2, 1),
                new EightsTask().init(2.99),
                new NinthTask().init(5),
                new TenthTask().init(.0, 1.0, 0.1));
    }
}
