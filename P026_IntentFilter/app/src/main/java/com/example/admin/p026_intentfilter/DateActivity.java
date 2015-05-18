package com.example.admin.p026_intentfilter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by admin on 18.05.2015.
 */
public class DateActivity extends Activity
{

    @Override
    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(R.layout.date);


        SimpleDateFormat timeFormat = new SimpleDateFormat("dd.MM.yyy");
        String time = timeFormat.format(new Date(System.currentTimeMillis()));

        TextView textView = (TextView)findViewById(R.id.tvDate);
        textView.setText(time);
    }
}
