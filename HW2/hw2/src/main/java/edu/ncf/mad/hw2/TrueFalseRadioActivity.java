package edu.ncf.mad.hw2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TrueFalseRadioActivity extends AppCompatActivity {

    // This activity should have at least:
    // 1- a textview to display a question
    // 2- next and previous buttons to move to the next question
    // 3- Two radio buttons (one for true and one for false) placed in a radio group. why?
    // 4- a submit answer button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_true_false_radio);
    }
}
