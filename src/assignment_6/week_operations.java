package assignment_6;
import java.util.*;
public class week_operations {
    public static void main(String [] args){
        String [] weekdays={"Sunday","Monday","Tuesday", "Wednesday","Thursday","Friday", "Saturday"};
        System.out.println("Q7.1");
        for (String str: weekdays) {
            System.out.println(str);
        }
        System.out.println("----------------------------------------------------------------");
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("Q7.2");
        for(int i=0;i<weekdays.length;i++){
            if(i==(day-1)){
                continue;
            }else{
                System.out.println(weekdays[i]);
            }
        }
        System.out.println("----------------------------------------------------------------");

        Date d=new Date();
        int todaydate= d.getDate();
        for(int i=1;i<=31;i++){
            if(todaydate+1==i)
                break;
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
/*
Q7.1
Sunday
Monday
Tuesday
Wednesday
Thursday
Friday
Saturday
----------------------------------------------------------------
Q7.2
Sunday
Monday
Wednesday
Thursday
Friday
Saturday
----------------------------------------------------------------
1 2 3 4 5 6 7

 */