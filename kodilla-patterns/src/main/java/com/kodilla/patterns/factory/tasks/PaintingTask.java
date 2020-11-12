package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {
    private final String taskName;
    private final String color;
    private final String whatToPaint;
    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }
    public boolean executeTask() {
        boolean execTask = false;
        if( taskName.length() > 0 && color.length() > 0 && whatToPaint.length() > 0 ){
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
