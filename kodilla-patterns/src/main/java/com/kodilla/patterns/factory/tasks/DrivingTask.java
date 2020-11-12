package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {
    private final String taskName;
    private final String where;
    private final String using;
    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }
    public boolean executeTask() {
        boolean execTask = false;
        if( taskName != "" && where != "" && using != "" ){
            execTask = true;
        }
        return execTask;
    }
    public String getTaskName() {
        return taskName;
    }
    public boolean isTaskExecuted() {
        boolean isTaskExec = executeTask();
        return isTaskExec;
    }
}
