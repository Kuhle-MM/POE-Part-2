/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package st10259861_poe2;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class ST10259861_POE2Test {
    
    public ST10259861_POE2Test() {
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ST10259861_POE2.main(args);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testDisplayingTaskDetails() {
        System.out.println("displayingTaskDetails");
        ArrayList<String> taskNames = new ArrayList<>();
               taskNames.add("Create Login");
               taskNames.add("Create Add Features");
               taskNames.add("Create Reports");
               taskNames.add("Add Arrays");
       
        ArrayList<String> taskStatuses = new ArrayList<>();
               taskStatuses.add("To Do");
               taskStatuses.add("Doing");
               taskStatuses.add("Done");
               taskStatuses.add("To Do");
               
        ArrayList<String> developerNames = new ArrayList<>();
               developerNames.add("Mike Smith");
               developerNames.add("Edward Harrison");
               developerNames.add("Samantha Paulson");
               developerNames.add("Glenda Oberholzer");
               
        ArrayList<Integer> taskDurations = new ArrayList<>();
               taskDurations.add(5);
               taskDurations.add(8);
               taskDurations.add(2);
               taskDurations.add(11);
        ST10259861_POE2.displayingTaskDetails(taskNames, taskStatuses, developerNames, taskDurations);
       // fail("The test case is a prototype.");
    }

    @Test
    public void testDisplayingLongestTask() {
        System.out.println("displayingLongestTask");
        ArrayList<String> developerNames = new ArrayList<>();
               developerNames.add("Mike Smith");
               developerNames.add("Edward Harrison");
               developerNames.add("Samantha Paulson");
               developerNames.add("Glenda Oberholzer");
        ArrayList<Integer> taskDurations = new ArrayList<>();               
                taskDurations.add(5);               
                taskDurations.add(8);               
                taskDurations.add(2);               
                taskDurations.add(11);
        ST10259861_POE2.displayingLongestTask(developerNames, taskDurations);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSearchUsingTaskName() {
        System.out.println("searchUsingTaskName");
                
        ArrayList<String> taskNames = new ArrayList<>();
               taskNames.add("Create Login");
               taskNames.add("Create Add Features");
               taskNames.add("Create Reports");
               taskNames.add("Add Arrays");
        ArrayList<String> developerNames = new ArrayList<>();
               developerNames.add("Mike Smith");
               developerNames.add("Edward Harrison");
               developerNames.add("Samantha Paulson");
               developerNames.add("Glenda Oberholzer");
        ArrayList<String> taskStatuses = new ArrayList<>();
               taskStatuses.add("To Do");
               taskStatuses.add("Doing");
               taskStatuses.add("Done");
               taskStatuses.add("To Do");
        ST10259861_POE2.searchUsingTaskName(taskNames, developerNames, taskStatuses);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSearchUsingDeveloperName() {
        System.out.println("searchUsingDeveloperName");
        ArrayList<String> developerNames = new ArrayList<>();
               developerNames.add("Mike Smith");
               developerNames.add("Edward Harrison");
               developerNames.add("Samantha Paulson");
               developerNames.add("Glenda Oberholzer");
        ArrayList<String> taskNames = new ArrayList<>();
               taskNames.add("Create Login");
               taskNames.add("Create Add Features");
               taskNames.add("Create Reports");
               taskNames.add("Add Arrays");
        ArrayList<String> taskStatuses = new ArrayList<>();
               taskStatuses.add("To Do");
               taskStatuses.add("Doing");
               taskStatuses.add("Done");
               taskStatuses.add("To Do");
        ST10259861_POE2.searchUsingDeveloperName(developerNames, taskNames, taskStatuses);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testDeletingTask() {
        System.out.println("deletingTask");
        ArrayList<String> taskNames = new ArrayList<>();
               taskNames.add("Create Login");
               taskNames.add("Create Add Features");
               taskNames.add("Create Reports");
               taskNames.add("Add Arrays");
        ArrayList<String> taskStatuses = new ArrayList<>();
               taskStatuses.add("To Do");
               taskStatuses.add("Doing");
               taskStatuses.add("Done");
               taskStatuses.add("To Do");
        ArrayList<String> developerNames = new ArrayList<>();
               developerNames.add("Mike Smith");
               developerNames.add("Edward Harrison");
               developerNames.add("Samantha Paulson");
               developerNames.add("Glenda Oberholzer");
        ArrayList<Integer> taskIDs = null;
        ArrayList<Integer> taskDurations = new ArrayList<>();               
                taskDurations.add(5);               
                taskDurations.add(8);               
                taskDurations.add(2);               
                taskDurations.add(11);
        ST10259861_POE2.deletingTask(taskNames, taskStatuses, developerNames, taskIDs, taskDurations);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testReportCapturedTasks() {
        System.out.println("reportCapturedTasks");
        ArrayList<String> taskNames = new ArrayList<>();
               taskNames.add("Create Login");
               taskNames.add("Create Add Features");
               taskNames.add("Create Reports");
               taskNames.add("Add Arrays");
        ArrayList<String> taskStatuses = new ArrayList<>();
               taskStatuses.add("To Do");
               taskStatuses.add("Doing");
               taskStatuses.add("Done");
               taskStatuses.add("To Do");
        ArrayList<String> developerNames = new ArrayList<>();
               developerNames.add("Mike Smith");
               developerNames.add("Edward Harrison");
               developerNames.add("Samantha Paulson");
               developerNames.add("Glenda Oberholzer");
        ArrayList<String> taskIDs = null;
        ArrayList<Integer> taskDurations = new ArrayList<>();               
                taskDurations.add(5);               
                taskDurations.add(8);               
                taskDurations.add(2);               
                taskDurations.add(11);
        ST10259861_POE2.reportCapturedTasks(taskNames, taskStatuses, developerNames, taskIDs, taskDurations);
        //fail("The test case is a prototype.");
    }
    
}
