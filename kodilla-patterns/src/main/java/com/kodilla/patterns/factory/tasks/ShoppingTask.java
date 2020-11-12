package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }
    public boolean executeTask() {
        boolean execTask = false;
        if( taskName != "" && whatToBuy != "" && quantity > 0.0 ){
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
