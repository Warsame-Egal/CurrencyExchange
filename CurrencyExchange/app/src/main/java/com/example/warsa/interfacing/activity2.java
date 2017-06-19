package com.example.warsa.interfacing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {

    double cadValue = 0.0;

    double calculatedValue = 0.0;

    String radioButtonChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
    }

    public void result(View view) {
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        radioButtonChoice = intent.getStringExtra(MainActivity.EXTRA_MESSAGE); //using intent to get the texts from mainactivity

        EditText editText = (EditText) findViewById(R.id.canadianCurrency);
        cadValue = Double.parseDouble(editText.getText().toString());

        switch (radioButtonChoice) {
            case "us": //get the text from mainactivity
                calculatedValue = (double) Math.round(((cadValue / 1.3804)) * 100d) / 100d; //us calculation
                ;
                break;

            case "euro": //get the text from mainactivity
                calculatedValue = (double) Math.round(((cadValue / 1.4995)) * 100d) / 100d; //euro calculation
                ;
                break;

            case "chinese": //get the text from mainactivity
                calculatedValue = (double) Math.round(((cadValue / 0.2121)) * 100d) / 100d; //chinese calculation
                break;
        }
        TextView textView = (TextView) findViewById(R.id.LocalCurrency); //get the localCurrency id
        textView.setText(Double.toString(calculatedValue)); //set the calculatedvalue into the localcurrency textview

    }

}
