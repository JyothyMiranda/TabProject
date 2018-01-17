package com.example.jyothymariamiranda.tabproject;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Jyothy Maria Miranda on 1/16/2018.
 */

public class TrackVariables
{
    public static int day=0,month=0,year=0;
    public static String cTitle=null, cVenue=null, cTime=null;

//    public static boolean M1selected = false;
//    public static boolean M2selected = false;
//    public static boolean M3selected = false;
//    public static boolean M4selected = false;

    public static void setDateDetails(int pday, int pmonth, int pyear)
    {
        day=pday;
        month=pmonth;
        year=pyear;
    }

    public static void setMovieDetails(String title, String venue, String time)
    {
        cTitle=title;
        cVenue=venue;
        cTime=time;

    }

//    public static getLinearLayoutVals(LinearLayout ll)
//    {   String s;
//        int count = ll.getChildCount();
//        View v = null;
//        for(int i=0; i<count; i++) {
//            v = ll.getChildAt(i);
//            if (v instanceof TextView)
//             s=v.getText().toString();
//
//        }
//
//    }

    public static String getDate()
    {

        //String s = day+" "+month+", "+year;
        if(day!=0&&year!=0&&month!=0) {
            String s = Integer.toString(day).concat(" ").concat(Integer.toString(month)).concat(", ").concat(Integer.toString(year));
            return s;
        }
        else
            return null;

    }

    public static String getTitle()
    {
        if(cTitle!=null)
        return cTitle;
        else return "Not Selected yet";
    }

    public static String getVenue()
    {
        if(cVenue!=null)
        return cVenue;
        else return "Not Selected yet";
    }

    public static String getTime()
    {
        if(cTime!=null)
        return cTime;
        else return "Not Selected yet";
    }


}
