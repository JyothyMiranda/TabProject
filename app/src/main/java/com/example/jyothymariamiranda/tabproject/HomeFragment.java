package com.example.jyothymariamiranda.tabproject;


import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class HomeFragment extends Fragment {

    public static final String TITLE = "Date";

    Date date= new Date();
    Calendar cal = Calendar.getInstance();
    //cal.setTime(date);
    int cur_year = cal.get(Calendar.YEAR);
    int cur_month = cal.get(Calendar.MONTH)+1;
    int cur_day = cal.get(Calendar.DAY_OF_MONTH);
    DatePicker simpleDatePicker;
    Button button;

    public static HomeFragment newInstance() {

        return new HomeFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, Bundle savedInstanceState) {
        View v=  inflater.inflate(R.layout.fragment_home, container, false);



        simpleDatePicker = (DatePicker) v.findViewById(R.id.simpleDatePicker);

        button = (Button) v.findViewById(R.id.submitButton);
        // perform click event on submit button
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // get the values for day of month , month and year from a date picker
                int day =simpleDatePicker.getDayOfMonth();
                int month =simpleDatePicker.getMonth() + 1;
                int year =simpleDatePicker.getYear();
                // display the values by using a toast
                if((year<cur_year)||(year==cur_year && month<cur_month)||(year==cur_year&&month==cur_month&&day<cur_day))
                {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(v.getContext());
                    dialog.setCancelable(false);
                    // dialog.setTitle("ALERT");
                    dialog.setMessage("Previous day shows can not be searched");
                    dialog.setNegativeButton("OK ", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    dialog.create().show();

                    //Toast.makeText(MainActivity.this, "Previous day shows can not be searched", Toast.LENGTH_LONG).show();
                }
                else
                {
                    TrackVariables.setDateDetails(day,month,year);
                    Toast.makeText(v.getContext(), "Day: " + day + "\n" + "Month: " + month + "\n" + "Year: " + year, Toast.LENGTH_LONG).show();

                    final ViewPager mViewPager;
                    mViewPager = (ViewPager) container.findViewById(R.id.pager);

                    mViewPager.setCurrentItem(1); // Change to page 1, i.e., FragmentB


                }
            }
        });







        return v;
    }

}