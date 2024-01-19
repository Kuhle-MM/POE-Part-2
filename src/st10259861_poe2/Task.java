package st10259861_poe2;

public class Task {
    private static int totalTasksHours = 0;
    
    //getter for totalTaskHours 
    public int getTotalTasksHours() {
        return totalTasksHours;
    }

    //setter for totalTaskHours
    public void setTotalTasksHours(int totalTasksHours) {
        Task.totalTasksHours = totalTasksHours;
    }
     
    //a method that checks the task description is less than 50 characters
    public boolean checkTaskDescription(String taskDescription){
        boolean validCheckTaskDescription;
        validCheckTaskDescription = taskDescription.length()<50;
        return validCheckTaskDescription;
    }
    
    
    //a method that creates a task ID for the developer for that task
    public String createTaskID(String developerName,String taskName, int numberOfTasks){
        StringBuilder sbID = new StringBuilder();
        sbID.append(taskName.substring(0,2)).append(":").append(numberOfTasks).append(":").append(developerName.substring(developerName.length()-3, developerName.length()));
        String taskID = sbID.toString().toUpperCase();
        return taskID; 
    }
    
    // displays all the developer details 
    public String printTaskDetails(String taskStatus,String developerName,String taskName, int numberOfTasks, String taskDescription,int taskDuration)
    {
        StringBuilder sbDetails = new StringBuilder();
        sbDetails.append("\nTask Status: ").append(taskStatus).append("\n").append("DeveloperName: ").append(developerName).append("\n").append("Number of tasks: ").append(numberOfTasks).append("\n").append("Task Name: ").append(taskName).append("\n").append("Task Description: ").append(taskDescription).append("\n").append("Task ID: ").append(createTaskID( developerName, taskName, numberOfTasks )).append("\n").append("Task Duration: ").append(taskDuration).append("hrs");
        
        return sbDetails.toString();
    }

    //calculates and returns the total hours of all the tasks
    public int returnTotalHours(int taskDuration){
        setTotalTasksHours(getTotalTasksHours() + taskDuration);
        return getTotalTasksHours();
    }

}
