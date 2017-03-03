
package com.richardchen.pattern.oberservertest;

/**
 *  Test app to verify Observer design pattern.
 * @author Richard_Chen
 * @since 2015/10/01
 */
public class OberserverTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Start to test Observer pattern.
        
        //Init Queue.
        TaskQueue queue = new TaskQueue();
        queue.addTaskListener(new TaskRecorder());
        /**
         * Task can automatic generate, in this practice, asign task manual.
         * Asign tasks can more flexable.
         */
        Task task1 = new Task("Test1.tar.gz","com.task1");
        Task task2 = new Task("Test2.tar.gz","com.task2");

        //Add task test.
        queue.addtask(task1);
        queue.addtask(task2);

        //Remove task, test.
        queue.removetask(task2);
        queue.removetask(task1);
    }
}
