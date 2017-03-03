package com.richardchen.pattern.oberservertest;

/**
 * Class to handle Task Event.
 * @author Richard_Chen
 */
class TaskEvent {
    final String filename;
    final String packagename;
    public TaskEvent(Task task){
        this.filename = task.getfilename();
        this.packagename = task.getpackagename();
    }
}
