package com.example.admin.p0151_contextmenu;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    TextView tvColor;
    TextView tvSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvColor = (TextView)findViewById(R.id.textViewColor);
        tvSize = (TextView)findViewById(R.id.textViewSize);

        registerForContextMenu(tvColor);
        registerForContextMenu(tvSize);
    }

    @Override
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo menuInfo)
    {
        switch (view.getId())
        {
            case R.id.textViewColor:
            {
                contextMenu.add(0, R.integer.menu_color_red, 0, R.string.menu_title_red);
                contextMenu.add(0, R.integer.menu_color_green, 0, R.string.menu_title_green);
                contextMenu.add(0, R.integer.menu_color_black, 0, R.string.menu_title_black);
                break;
            }

            case R.id.textViewSize:
            {
                contextMenu.add(0, R.integer.menu_size_10, 0, R.string.menu_title_10);
                contextMenu.add(0, R.integer.menu_size_22, 0, R.string.menu_title_22);
                contextMenu.add(0, R.integer.menu_size_30, 0, R.string.menu_title_30);
                break;
            }
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem menuItem)
    {
        switch (menuItem.getItemId())
        {
            case R.integer.menu_color_black:
            {
                tvColor.setTextColor(Color.BLACK);
                tvColor.setText("BLACK");
                break;
            }

            case R.integer.menu_color_red:
            {
                tvColor.setTextColor(Color.RED);
                tvColor.setText("RED");
                break;
            }

            case R.integer.menu_color_green:
            {
                tvColor.setTextColor(Color.GREEN);
                tvColor.setText("GREEN");
                break;
            }

            case R.integer.menu_size_10:
            {
                tvSize.setTextColor(Color.BLACK);
                tvSize.setTextSize(R.integer.menu_size_10);
                tvSize.setText("text size 10");
                break;
            }

            case R.integer.menu_size_22:
            {
                tvSize.setTextColor(Color.BLACK);
                tvSize.setTextSize(R.integer.menu_size_22);
                tvSize.setText("text size 22");
                break;
            }

            case R.integer.menu_size_30:
            {
                tvSize.setTextColor(Color.BLACK);
                tvSize.setTextSize(R.integer.menu_size_30);
                tvSize.setText("text size 30");
                break;
            }
        }

        return true;// super.onContextItemSelected(menuItem);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
