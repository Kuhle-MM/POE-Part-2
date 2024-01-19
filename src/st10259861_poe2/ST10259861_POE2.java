package st10259861_poe2;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class ST10259861_POE2 {

    public static String taskDescription, developerName, taskName, taskID;
    private static int numberOfTasks, taskDuration,totalHours, taskNumber;
    
     

    public static void main(String[] args) {

        boolean login = true;
        String optionChosen;

        //Login feature that ensures that the user has logged in
        if (login == true) {
            System.out.println("Welcome to EasyKanban");
            optionChosen = JOptionPane.showInputDialog(null, """
                                                                   Option 1) Add tasks 
                                                                   Option 2) Show report 
                                                                   Option 3) Quit""", "Choose an Option:", 1);

        } else {
            optionChosen = "3";
        }
        
        //while loop that takes the user back to the menu that allows them to select a different option to the second one
        while (!optionChosen.equals("3")) {

            
            //an if statement that checks the option that the user has selected 
            if (optionChosen.equals("1")) {
                Task t1 = new Task();

                String strNumberOfTasks = JOptionPane.showInputDialog("How many Tasks would you like to add?");
                numberOfTasks = Integer.parseInt(strNumberOfTasks);

                ArrayList<String> taskStatuses = new ArrayList<>();
                ArrayList<String> taskIDs = new ArrayList<>();
                ArrayList<String> taskNames = new ArrayList<>();
                ArrayList<Integer> taskDurations = new ArrayList<>();
                ArrayList<String> developerNames = new ArrayList<>();
                
                //for loop that allows the user to add more information about the other tasks
                for (int i = 0; i < numberOfTasks; i++) {

                    taskNumber = i;
                    
                    
                    /////////////////////////////////////////////////////////////
                    String strTaskNumber = "Task Number: " + (taskNumber + 1);
                    boolean validTaskDescription = false;
                    taskDescription = JOptionPane.showInputDialog(null, "Enter your task Description.(less than 50 characters)", strTaskNumber, 1);

                    while (validTaskDescription == false) {
                        validTaskDescription = t1.checkTaskDescription(taskDescription);
                        if (validTaskDescription == false) {
                            taskDescription = JOptionPane.showInputDialog("Please enter a task description of less than 50 characters");
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Task successfully captured");
                    
                    ///////////////////////////////////////////////////////////////
                    developerName = JOptionPane.showInputDialog("Enter the Full name of the developer.");
                    taskName = JOptionPane.showInputDialog("Enter a name for Task " + (taskNumber + 1));

                     System.out.println(t1.createTaskID(developerName, taskName, numberOfTasks));
                    
                    //////////////////////////////////////////////////////////
                    String strTaskDuration = JOptionPane.showInputDialog("Enter the amount of time in hours it should take to complete the task.");
                    taskDuration = Integer.parseInt(strTaskDuration);

                    taskStatuses.add(null);
                    
                    // while loop that ensure that the user selected one of the options
                    while (taskStatuses.get(taskNumber) == null) {
                        optionChosen = JOptionPane.showInputDialog(null, """
                                                                    Option 1) To Do 
                                                                    Option 2) Done 
                                                                    Option 3) Doing
                                                                     """, "Choose an Option", 1);
                        int intTaskStatus = Integer.parseInt(optionChosen);

                        taskStatuses.remove(null);
                        switch (intTaskStatus) {
                            case 1:
                                taskStatuses.add("To Do");
                                break;
                            case 2:
                                taskStatuses.add("Done");
                                break;
                            case 3:
                                taskStatuses.add("Doing");
                                break;
                            default: {
                                taskStatuses.add(null);
                                JOptionPane.showMessageDialog(null, "Invalid option. Please pick 1, 2 or 3");
                                break;
                            }

                        }
                        
                        
                       
                        
                    }
                    //created an array to store taskStatuses[taskNumber] and taskDuration
                //    taskStatuses[taskNumber] = taskStatuses[taskNumber];
                    taskDurations.add(taskDuration);
                    //created an array to store taskID
                    taskIDs.add(t1.createTaskID(developerName, taskName, numberOfTasks));
                    //created an array to store taskName and devName
                    developerNames.add(developerName);
                    taskNames.add(taskName);
                        
                    System.out.println(t1.printTaskDetails(taskStatuses.get(taskNumber), developerName, taskName, numberOfTasks, taskDescription, taskDuration));
                    ////////////////////////////////////////////////////
                    totalHours = t1.returnTotalHours(taskDuration);
                    
                    
                }
                
                System.out.println("Total hours for all tasks: " + totalHours + "hrs");
                
                displayingTaskDetails(taskNames, taskIDs, taskStatuses, developerNames,taskDurations);
                displayingLongestTask(developerNames, taskDurations);
                
                deletingTask(taskNames, taskStatuses, developerNames, taskDurations, taskDurations);
                searchUsingTaskName(taskNames,developerNames,taskStatuses);
                searchUsingDeveloperName(developerNames, taskNames, taskStatuses);
                
                reportCapturedTasks(taskNames, taskStatuses, developerNames, taskIDs, taskDurations);
                
                 
            } else if (optionChosen.equalsIgnoreCase("2")) {
                JOptionPane.showMessageDialog(null, "Coming Soon");
            } else if (optionChosen.equalsIgnoreCase("3")) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Choice.(Choose 1,2 or 3)");
            }

            optionChosen = JOptionPane.showInputDialog(null, """
                                                                   Option 1) Add tasks 
                                                                   Option 2) Show report 
                                                                   Option 3) Quit""", "Choose an Option:", 1);
        }
        
        
        
    }
    
    public static void displayingTaskDetails(ArrayList<String> taskNames,ArrayList<String> taskStatuses, ArrayList<String> developerNames,ArrayList<Integer> taskDurations){
        System.out.println("\nCompleted tasks \n====================\n");
        int arrayLength = taskNames.size();
        for (int i = 0; i < arrayLength; i++) {
            
            if (taskStatuses.get(i).equals("Done")){
               
                System.out.println("Developer Name: "+developerNames.get(i));
                System.out.println("Task Name: "+taskNames.get(i));
                System.out.println("Task Duration: " + taskDurations.get(i)); 
            }
        }
    }
    
    public static void displayingLongestTask(ArrayList<String> developerNames,ArrayList<Integer> taskDurations){
        int longDuration = 0;
        int index =999999;
        for (int i = 0; i < taskDurations.size() ; i++) {
             
             if (taskDurations.get(i)> longDuration){
                 longDuration = taskDurations.get(i);
                 index = i;
             }
        }
                System.out.println("\nLongest Task \n=======================");
                System.out.println("Developer Name: "+developerNames.get(index));
                System.out.println("Task Duration: " + taskDurations.get(index)); 
    }
    
    public static void searchUsingTaskName(ArrayList<String> taskNames,ArrayList<String> developerNames,ArrayList<String> taskStatuses){
    
        String searchTName = JOptionPane.showInputDialog("Enter the task name you are searching for");
//        String dne = "DNE";
//        while (dne.equals("DNE")){
            for (int i = 0; i < 10; i++) {
                if (searchTName.equals(taskNames.get(i))){
                    System.out.println(taskNames.get(i));
                    System.out.println(developerNames.get(i));
                    System.out.println(taskStatuses.get(i));
                }
//                    dne ="";
//                }else
//                    dne =("DNE");
//                System.out.println("Does not exist");
//            }
//        searchTName = JOptionPane.showInputDialog("Re-enter the task name you are searching for");
        }
    }
    
    public static void searchUsingDeveloperName(ArrayList<String> developerNames,ArrayList<String> taskNames,ArrayList<String> taskStatuses){
         String searchDName = JOptionPane.showInputDialog("Enter the Developer's name you are searching for");
         String dne = "DNE";
        while (dne.equals("DNE")){
            for (int i = 0; i < 10; i++) {
                if (searchDName.equals(developerNames.get(i))){
                    System.out.println(taskNames.get(i));
                    System.out.println(taskStatuses.get(i));
                    dne ="";
                }else
                    dne =("DNE");
            }
        searchDName = JOptionPane.showInputDialog("Re-enter the task name you are searching for");
        }
    }
    
    public static void deletingTask(ArrayList<String> taskNames,ArrayList<String> taskStatuses,ArrayList<String> developerNames,ArrayList<Integer> taskIDs,ArrayList<Integer> taskDurations){
       String deleteTaskName = JOptionPane.showInputDialog("Enter the name of the task you would like to delete.");
       
        for (int i = 0; i < taskNames.size(); i++) {
            if (taskNames.get(i).equals(deleteTaskName)){
                taskNames.remove(i);
                taskIDs.remove(i);
                taskStatuses.remove(i);
                developerNames.remove(i);
                taskDurations.remove(i);
            } else {
                System.out.println("The task you tried to delete does not exist");
            }
        }
    }
    
    public static void reportCapturedTasks(ArrayList<String> taskNames,ArrayList<String> taskStatuses,ArrayList<String> developerNames,ArrayList<String> taskIDs,ArrayList<Integer> taskDurations){
        for (int i = 0; i < taskNames.size(); i++) {
            System.out.println("\nReport\n====================");
            System.out.println("Task " +(i+1));
            System.out.println(taskNames);
            System.out.println(taskStatuses);
            System.out.println(taskDurations);
            System.out.println(taskIDs);
            System.out.println(developerNames);
        }
        
        
    }
}
///REFERENCE 
///Java programming, Ninth edition. IN. Java programming, Ninth edition. 
///Farrell, J., 2012.
///pp. 110 - 330

///https://www.youtube.com/watch?v=Bj9Mx_Lx3q4
///Java Strings are Immutable - Here's What That Actually Means
///Coding with John