// Last updated: 4/22/2026, 3:45:15 PM
// class Solution {
//     private int []month=new int []{31,28,31,30,31,30,31,31,30,31,30,31};
//     public int daysBetweenDates(String date1, String date2) {

//        return Math.abs(from1971(date1)-from1971(date2));

//     }
//        private  int from1971(String date)
//        {
//         String[] parts=date.split("-");
//         int year=Integer.parseInt(parts[0]);
//         int month=Integer.parseInt(parts[1]);
//         int day=Integer.parseInt(parts[2]);

//         int count=day;
//         // for(int i=1971;i<year;i++)
//         // {
//         //     count=count+(isLeapYear(i))? 366 : 365;
//         // }
//          for (int i = 1971; i < year; i++) count += (isLeapYear(i)) ? 366 : 365;
//         // for(int j=0;j<month-1;j++)
//         // {
//         //     count =count+month[j];
//         // }
//          for (int j = 0; j < month - 1; j++) count += month[j];
//         if(month>2&& isLeapYear(year))
//         {
//             count=count+1;
//         }
//         return count;
//        }
//         private boolean isLeapYear(Integer year)
//         {
//             if(year%400==0|| year%100!=0 && year%4==0)
//             {
//                 return true;
//             }
//             return false;
//         }
//        } 
        
    

// //...................................................................................
class Solution {
    private int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(from1971(date1) - from1971(date2));
    }
    private int from1971(String date) {
       // String[] parts = date.split("-");
        // int year = Integer.parseInt(parts[0]), month = Integer.parseInt(parts[1]), day = Integer.parseInt(parts[2]);
        int year = Integer.parseInt(date.substring(0,4)), month = Integer.parseInt(date.substring(5,7)), day = Integer.parseInt(date.substring(8,10));
        int count = day;
        for (int i = 1971; i < year; i++) count += (isLeapYear(i)) ? 366 : 365;
        for (int i = 0; i < month - 1; i++) count += months[i];
        if (month > 2 && isLeapYear(year)) count += 1;
        return count;
    }
    private boolean isLeapYear(Integer year) {
        return (year % 400 == 0 || year % 100 != 0) && year % 4 == 0;
    }
}