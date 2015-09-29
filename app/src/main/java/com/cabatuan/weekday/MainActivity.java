package com.cabatuan.weekday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.IllegalFormatException;

public class MainActivity extends AppCompatActivity {

    private TextView tv_out;
    private int day, month, year, day_out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void getInputValues(){
        EditText et_day = (EditText) findViewById(R.id.edittextmonth);
        EditText et_month = (EditText) findViewById(R.id.edittextmonth);
        EditText et_year = (EditText) findViewById(R.id.edittextmonth);

        try {
             day = Integer.parseInt(et_day.getText().toString());
        }
        catch (IllegalFormatException e){
             day = 0;
        }

        try {
            month = Integer.parseInt(et_month.getText().toString());
        }
        catch (IllegalFormatException e){
            month = 0;
        }

        try {
             year = Integer.parseInt(et_year.getText().toString());
        }
        catch (IllegalFormatException e){
            year = 0;
        }

    }

    private void computeDay(){
        // TODO: Give the formula here:
        day_out = 0;
    }

    public void onClickCompute(View view){
        getInputValues();
        computeDay();
        printDay();
    }

private void printDay(){
    String day_text;
    switch(day_out) {
        case 0:
            day_text = "It's Saturday!";
            break;
        case 1:
            day_text = "It's Sunday!";
            break;
        case 2:
            day_text = "It's Monday!";
            break;
        case 3:
            day_text = "It's Tuesday!";
            break;
        case 4:
            day_text ="It's Wednesday!";
            break;
        case 5:
            day_text ="It's Thursday!";
            break;
        case 6:
            day_text ="It's Friday!";
            break;
        default:
            day_text ="Invalid day!";
    }

    // Set the textview text
    tv_out = (TextView) findViewById(R.id.textviewoutput);
    tv_out.setText(day_text);
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
