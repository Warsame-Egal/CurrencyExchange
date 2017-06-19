package com.example.warsa.interfacing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.warsa.interfacing.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttons(View view) {
        String message = null;
        Intent intent = new Intent(MainActivity.this, activity2.class); //using intent to bind 2 activitys
        //is the button now checked ?
        boolean button = ((RadioButton) view).isChecked(); //boolean value for radio button

        if (view.getId() == R.id.us) {//get us id
            if(button)//check if radio button is clicked
                message = "us";//pass text into message
        }
        else if (view.getId() == R.id.euro) {//get us id
            if(button) //check if radio button is clicked
                message = "euro"; //pass text into message
        }
        else if (view.getId() == R.id.chineseYen) {//get us id
            if(button) //check if radio button is clicked
                message = "chinese";//pass text into message
        }

        intent.putExtra(EXTRA_MESSAGE, message); //send the message using intent, will be called in activity2
        startActivity(intent); //start the activity

    }
}
