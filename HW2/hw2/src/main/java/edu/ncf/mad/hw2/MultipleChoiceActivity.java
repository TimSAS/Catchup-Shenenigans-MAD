package edu.ncf.mad.hw2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MultipleChoiceActivity extends AppCompatActivity {

    // It is easier to work on this one after you code the other two activities
    // This activity should have at least:
    // 1- a textview to display a question
    // 2- next and previous buttons to move to the next question
    // 3- radio buttons placed in a radio group. why?
    // 4- a submit answer button
    // I am giving you some snippits of code that may help

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_choice);
    }
}
