/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package st10259861_poe2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class TaskTest {
    
    public TaskTest() {
    }

    @Test
    public void testCheckTaskDescriptionValid() {
        System.out.println("checkTaskDescription");
        String taskDescription = "Create Login to authenticate users";
        Task instance = new Task();
        boolean expResult = true;
        boolean result = instance.checkTaskDescription(taskDescription);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCreateTaskID1() {
        System.out.println("createTaskID");
        String developerName = "Robyn Harrison";
        String taskName = "Login Feature";
        int numberOfTasks = 2;
        Task instance = new Task();
        String expResult = "LO:2:SON";
        String result = instance.createTaskID(developerName, taskName, numberOfTasks);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");
     
        Task instance = new Task();
        int totalTasksHours = instance.returnTotalHours(8);
        totalTasksHours = instance.returnTotalHours(10);
        
        int expResult = 18;
        int result = totalTasksHours;
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
     @Test
    public void testCheckTaskDescriptionInvalid() {
        System.out.println("checkTaskDescription");
        String taskDescription = "Create Add Task feature to add task users. asjdhksahdkjhskdjhakjshdkjshdkjahsdkj";
        Task instance = new Task();
        boolean expResult = false;
        boolean result = instance.checkTaskDescription(taskDescription);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCreateTaskID2() {
        System.out.println("createTaskID");
        String developerName = "Mike Smith";
        String taskName = "Add Task Feature";
        int numberOfTasks = 3;
        Task instance = new Task();
        String expResult = "AD:3:ITH";
        String result = instance.createTaskID(developerName, taskName, numberOfTasks);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    
    
}
