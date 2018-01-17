package com.example.jyothymariamiranda.tabproject;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SettingsFragment extends Fragment {

    public static final String TITLE = "Confirm";
    View v;

    public static SettingsFragment newInstance() {

        return new SettingsFragment();
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
    if(isVisibleToUser) {
        final String date = TrackVariables.getDate();
        String time = TrackVariables.getTime();
        final String title = TrackVariables.getTitle();
        String venue = TrackVariables.getVenue();
        Log.i("testlog", date + time + venue);

        TextView titleText = (TextView) v.findViewById(R.id.confirmTitle);
        TextView venText = (TextView) v.findViewById(R.id.confirmVenue);
        TextView timeText = (TextView) v.findViewById(R.id.confirmTime);
        TextView dateText = (TextView) v.findViewById(R.id.confirmDate);

        if (date != null)
            dateText.setText("Show Date: " + date);
        if (time != null)
            timeText.setText("Show Time: " + time);
        if (title != null)
            titleText.setText("Show Title: " + title);
        if (venue != null)
            venText.setText("Show Venue: " + venue);

        final String notiText = title + " reservation successful at " + time + " on " + date + ".";

        Button confirm = (Button) v.findViewById(R.id.confirmBooking);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (date == null && title == null)
                    Toast.makeText(getContext(), "Enter Booking Details", Toast.LENGTH_SHORT).show();
                else if (date == null)
                    Toast.makeText(getContext(), "Select Movie Date", Toast.LENGTH_SHORT).show();
                else if (title == null)
                    Toast.makeText(getContext(), "Select a Movie", Toast.LENGTH_SHORT).show();
                else {
                    Toast.makeText(getContext(), "Booking Successful!", Toast.LENGTH_SHORT).show();


                    NotificationCompat.Builder mBuilder =
                            new NotificationCompat.Builder(getContext())
                                    .setSmallIcon(R.drawable.ic_launcher_foreground)
                                    .setContentTitle("Booking Successful!")
                                    .setContentText(notiText);
                    NotificationManager mNotificationManager =

                            (NotificationManager) getContext().getSystemService(Context.NOTIFICATION_SERVICE);


                    mNotificationManager.notify(001, mBuilder.build());
                }
            }
        });


    }
        Log.i("abc","gsmhfmhgfd");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
         v = inflater.inflate(R.layout.fragment_settings, container, false);




        return v;
    }
}
