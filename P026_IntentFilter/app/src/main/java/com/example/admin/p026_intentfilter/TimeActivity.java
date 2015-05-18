package com.example.admin.p026_intentfilter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by admin on 18.05.2015.
 */
public class TimeActivity extends Activity
{

    @Override
    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(R.layout.time);

        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String date = dateFormat.format(new Date(System.currentTimeMillis()));

        TextView textView = (TextView)findViewById(R.id.tvTime);
        textView.setText(date);
    }
}
