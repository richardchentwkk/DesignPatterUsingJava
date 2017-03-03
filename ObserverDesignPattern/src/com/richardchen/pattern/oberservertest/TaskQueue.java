/**
 * Implement task queue in this class.
 * @author Richard Chen
 * @since 2015/10/01
 */
package com.richardchen.pattern.oberservertest;

import java.util.LinkedList;
import java.util.List;
/**
 *  Task Queue class.
 * @author Richard_Chen
 */
public class TaskQueue {
    //Init for task and listener list.
    private List<Task> tasks = new LinkedList<Task>();
    private List<TaskListener> task_listeners = new LinkedList<TaskListener>();
    
    /**
     * Public method to register listener.
     */
    public void addTaskListener(TaskListener task_listener){
        task_listeners.add(task_listener);
    }
    
    /**
     * Public method to unregister listener.
     */
    public void removeTaskListener(TaskListener task_listener){
        task_listeners.remove(task_listener);
    }
    
    /**
     * Public method to add tasks.
     */
    
    public void addtask(Task task){
        tasks.add(task);
        notifyTaskadded(task);
    }
    
    /**
     * Public method to remove task.
     */
    public void removetask(Task task){
        tasks.remove(task);
        notifyTaskRemoved(task);
    }
    
    /**
     * Notify Observer task added.
     */
    private void notifyTaskadded(Task task){
        TaskEvent event = new TaskEvent(task);
        //Notify Observer
        for(TaskListener listener : task_listeners){
            listener.taskadded(event);
        }
    }
    
    /**
     * Notify Observer task removed.
     */
    private void notifyTaskRemoved(Task task){
        TaskEvent event = new TaskEvent(task);
        for(TaskListener listener : task_listeners){
            listener.taskremoved(event);
        }
    }
}
