package com.example.admin.p0191_calc;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener
{
    Button btnAdd, btnSub, btnMul, btnDiv;
    EditText etFirstOperand, etSecondOperand;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstOperand = (EditText) findViewById(R.id.etNum1);
        etSecondOperand = (EditText) findViewById(R.id.etNum2);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);

        btnSub = (Button) findViewById(R.id.btnSub);
        btnSub.setOnClickListener(this);

        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(this);

        btnMul = (Button) findViewById(R.id.btnMul);
        btnMul.setOnClickListener(this);

        tvResult = (TextView) findViewById(R.id.tvResult);
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


    @Override
    public void onClick(View v)
    {
        float firstOperand = 0;
        float secondOperand = 0;
        float result = 0;

        if(TextUtils.isEmpty(etFirstOperand.getText().toString()) ||
                TextUtils.isEmpty(etSecondOperand.getText().toString()))
        {
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
            alertDialog.setTitle("Wrong input params").setCancelable(true);
            return;
        }

        firstOperand = Float.parseFloat(etFirstOperand.getText().toString());
        secondOperand = Float.parseFloat(etSecondOperand.getText().toString());

        switch (v.getId())
        {
            case R.id.btnAdd:
            {
                result = firstOperand + secondOperand;
                break;
            }

            case R.id.btnSub:
            {
                result = firstOperand - secondOperand;
                break;
            }

            case R.id.btnMul:
            {
                result = firstOperand * secondOperand;
                break;
            }

            case R.id.btnDiv:
            {
                result = firstOperand / secondOperand;
                break;
            }
        }

        tvResult.setText(""+result);


    }

}
