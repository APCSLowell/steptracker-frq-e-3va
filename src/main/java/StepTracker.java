import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
    private int min, total, days, activeDays;
 
    public StepTracker(int minActivity) {
       // min = minActivity;
       // total = 0;
       // days = 0;
       // activeDays = 0;
       total = days = activeDays = 0;
    }
    public void addDailySteps(int steps) {
       total += steps;
       days++;
       if (steps >= min)
          activeDays++;
    }
   
    public int activeDays(){
       return activeDays;
    }
    
    public double averageSteps(){
       if (days == 0)
          return 0.0;
       return (double) total / days;
    }
} 
