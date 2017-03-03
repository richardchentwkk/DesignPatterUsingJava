package com.richardchen.pattern.oberservertest;

/**
 * Interface for TaskListener.
 * @author Richard_Chen
 */
public interface TaskListener {
    public void taskadded(TaskEvent event);
    public void taskremoved(TaskEvent event);
}
