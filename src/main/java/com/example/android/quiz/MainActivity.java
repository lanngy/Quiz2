package com.example.android.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickme(View V) {
        RadioButton rightanswer = (RadioButton) findViewById(R.id.answer1a);
        boolean firstanswer = rightanswer.isChecked();

        RadioButton rightanswer2 = (RadioButton) findViewById(R.id.answer2a);
        boolean secondanswer = rightanswer2.isChecked();

        RadioButton rightanswer3 = (RadioButton) findViewById(R.id.answer3c);
        boolean thirdanswer = rightanswer3.isChecked();

        RadioButton rightanswer4 = (RadioButton) findViewById(R.id.answer4b);
        boolean fourthanswer = rightanswer4.isChecked();

        EditText rightanswer5 = (EditText) findViewById(R.id.continent);
        String fifthanswer = rightanswer5.getText().toString();

        CheckBox rightanswer6 = (CheckBox) findViewById(R.id.answer6a);
        boolean sixthanswera = rightanswer6.isChecked();

        CheckBox rightanswer6b = (CheckBox) findViewById(R.id.answer6b);
        boolean sixthanswerb = rightanswer6b.isChecked();

        CheckBox rightanswer6c = (CheckBox) findViewById(R.id.answer6c);
        boolean sixthanswerc = rightanswer6c.isChecked();

        EditText name = (EditText) findViewById(R.id.name);
        String helo = name.getText().toString();

        int rechne= calculate(firstanswer,secondanswer,thirdanswer,fourthanswer,fifthanswer,sixthanswera,sixthanswerb,sixthanswerc);

        String hello = message(helo, rechne,firstanswer,secondanswer,thirdanswer,fourthanswer,fifthanswer,sixthanswera,sixthanswerb,sixthanswerc);

        Toast.makeText(this, hello, Toast.LENGTH_LONG).show();

    }
    private String message(String helo,int rechne, boolean firstanswer, boolean secondanswer,boolean thirdanswer, boolean fourthanswer,String fifthanswer, boolean sixthhanswera,boolean sixthhanswerb,boolean sixthhanswerc) {
        String hello = "Hello " + helo + ", thank you for your participation.";
        hello += "\nYou got: " +rechne + "/6";

        return hello;

    }
    private int calculate(boolean firstanswer, boolean secondanswer,boolean thirdanswer, boolean fourthanswer,String fifthanswer, boolean sixthhanswera,boolean sixthhanswerb,boolean sixthhanswerc) {
        int rechne = 0;

        if (firstanswer) {
            rechne = rechne + 1;
        }
        if (secondanswer) {
            rechne = rechne + 1;
        }
        if (thirdanswer) {
            rechne = rechne + 1 ;
        }
        if (fourthanswer) {
            rechne = rechne + 1 ;
        }
        if (fifthanswer.equalsIgnoreCase("America")) {
            rechne = rechne + 1;
        }

        if (sixthhanswerb && sixthhanswerc && !sixthhanswera) {
            rechne = rechne + 1;

        }else

        Toast.makeText(this,"Ohh well..try again..I am pretty sure you can do it!", Toast.LENGTH_LONG).show();

        return rechne;
    }
}





