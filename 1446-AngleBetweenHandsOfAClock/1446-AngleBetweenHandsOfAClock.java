// Last updated: 4/22/2026, 3:45:09 PM
class Solution {
    public double angleClock(int hour, int minutes) {

    //     if(hour==12)
    //     {
    //         hour=0;
    //     }

    //    double num=((double)minutes/5);

    //    double new1=(hour-num)*30;
    //    if(new1==0)
    //    {
    //     double new3=((double)minutes/2);

    //     return new3;
    //    }

    //    double num2=Math.abs(new1);

    //    double new2=num2-(minutes/2);
        
    //     return new2;

    double new1=minutes/60.0*360;
    double new2=hour*30+(minutes/60.0)*30;
    double diff=Math.abs(new1-new2);

  return Math.min(diff,360-diff);

    }
}