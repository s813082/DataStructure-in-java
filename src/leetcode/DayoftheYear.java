package leetcode;

import java.util.Calendar;

public class DayoftheYear {

    public static void main(String[] args) {
        String date = "2020-10-14";
        int totalday = dayOfYear(date);
        System.out.println(totalday);
    }

    public static int dayOfYear(String date) {
        int totalday=0;
        Calendar initDate = Calendar.getInstance();
        String[] DateList = date.split("-");

        int Year = Integer.parseInt(DateList[0]);
        int Month = Integer.parseInt(DateList[1]);
        int Day = Integer.parseInt(DateList[2]);

        initDate.set(Year,Month,Day);

        if(Month == 1){
            return Day;
        }else {
            for(int i = 1 ; i < Month ; i++){
                initDate.set(Year,i,0);
                totalday = totalday + initDate.get(Calendar.DATE);
            }
        }
        totalday = totalday+Day;

        return totalday;

    }
}
