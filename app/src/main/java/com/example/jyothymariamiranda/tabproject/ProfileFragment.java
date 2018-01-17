package com.example.jyothymariamiranda.tabproject;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ProfileFragment extends Fragment {

    public static final String TITLE = "Shows";

    public static ProfileFragment newInstance() {

        return new ProfileFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_profile, container, false);


        final LinearLayout m1 = (LinearLayout)v.findViewById(R.id.Movie1);
        final LinearLayout m2 = (LinearLayout)v.findViewById(R.id.Movie2);
        final LinearLayout m3 = (LinearLayout)v.findViewById(R.id.Movie3);
        final LinearLayout m4 = (LinearLayout)v.findViewById(R.id.Movie4);

        final TextView t1 = (TextView)v.findViewById(R.id.mTitle1);
        final TextView t2 = (TextView)v.findViewById(R.id.mTitle2);
        final TextView t3 = (TextView)v.findViewById(R.id.mTitle3);
        final TextView t4 = (TextView)v.findViewById(R.id.mTitle4);

        final TextView v1 = (TextView)v.findViewById(R.id.mVenue1);
        final TextView v2 = (TextView)v.findViewById(R.id.mVenue2);
        final TextView v3 = (TextView)v.findViewById(R.id.mVenue3);
        final TextView v4 = (TextView)v.findViewById(R.id.mVenue4);

        final TextView ti1 = (TextView)v.findViewById(R.id.mTime1);
        final TextView ti2 = (TextView)v.findViewById(R.id.mTime2);
        final TextView ti3 = (TextView)v.findViewById(R.id.mTime3);
        final TextView ti4 = (TextView)v.findViewById(R.id.mTime4);





        m1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                    m2.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    m3.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    m4.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    m1.setBackgroundColor(Color.parseColor("#FFCCCC"));

                    String title1= t1.getText().toString();
                    String ven1= v1.getText().toString();
                    String time1= ti1.getText().toString();
                Log.i("test", title1+ven1+time1);
                    TrackVariables.setMovieDetails(title1, ven1, time1);




            }
        });



        m2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                m2.setBackgroundColor(Color.parseColor("#FFCCCC"));
                m3.setBackgroundColor(Color.parseColor("#FFFFFF"));
                m4.setBackgroundColor(Color.parseColor("#FFFFFF"));
                m1.setBackgroundColor(Color.parseColor("#FFFFFF"));

                String time2= ti2.getText().toString();
                String ven2= v2.getText().toString();
                String title2= t2.getText().toString();

                Log.i("test1", title2+ven2+time2);

                TrackVariables.setMovieDetails(title2, ven2, time2);




            }
        });


        m3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                m3.setBackgroundColor(Color.parseColor("#FFCCCC"));
                m2.setBackgroundColor(Color.parseColor("#FFFFFF"));

                m4.setBackgroundColor(Color.parseColor("#FFFFFF"));
                m1.setBackgroundColor(Color.parseColor("#FFFFFF"));

                String time3= ti3.getText().toString();
                String ven3= v3.getText().toString();
                String title3= t3.getText().toString();

                Log.i("test2", title3+ven3+time3);

                TrackVariables.setMovieDetails(title3, ven3, time3);




            }
        });


        m4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                m2.setBackgroundColor(Color.parseColor("#FFFFFF"));
                m3.setBackgroundColor(Color.parseColor("#FFFFFF"));
                m4.setBackgroundColor(Color.parseColor("#FFCCCC"));
                m1.setBackgroundColor(Color.parseColor("#FFFFFF"));

                String time4= ti4.getText().toString();
                String ven4= v4.getText().toString();
                String title4= t4.getText().toString();

                Log.i("test3", title4+ven4+time4);

                TrackVariables.setMovieDetails(title4, ven4, time4);




            }
        });


        Button btn = (Button)v.findViewById(R.id.confirmBooking);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final ViewPager mViewPager;
                mViewPager = (ViewPager) container.findViewById(R.id.pager);




               mViewPager.setCurrentItem(2); // Change to page 1, i.e., FragmentB
            }
        });


        return v;
    }
}