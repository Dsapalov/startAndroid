package com.example.admin.p0131_menusimple;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    TextView textView;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        checkBox = (CheckBox) findViewById(R.id.checkbox);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        menu.add(0, R.integer.menu_add_id, 0, R.string.menu_add);
        menu.add(0, R.integer.menu_del_id, 2, R.string.menu_del);
        menu.add(1, R.integer.menu_exit_id, 1, R.string.menu_exit);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

      //  Toast.makeText(this, item.getTitle(), Toast.LENGTH_LONG).show();

        //noinspection SimplifiableIfStatement

        switch (id)
        {
            case R.integer.menu_add_id:
            {
                Toast.makeText(this, "Pressed:" + item.getTitle(), Toast.LENGTH_LONG).show();
                break;
            }
            case R.integer.menu_del_id:
            {
                Toast.makeText(this, "Pressed:" + item.getTitle(), Toast.LENGTH_LONG).show();
                break;
            }
            case R.integer.menu_exit_id:
            {
                Toast.makeText(this, "Pressed:" + item.getTitle(), Toast.LENGTH_LONG).show();
                break;
            }
        }

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
