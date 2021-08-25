package com.example.zainali.tempconvtest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn ;
    RadioButton c2f, f2c ;
    TextView display;
    EditText enterview;
    //Boolean isChecked = true;
    String enterTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        c2f = (RadioButton) findViewById(R.id.c2f);
        f2c = (RadioButton) findViewById(R.id.f2c);
        display = (TextView) findViewById(R.id.display);
        enterview = (EditText) findViewById(R.id.enterView);

        btn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                enterTemp = enterview.getText().toString();

                if (enterTemp.equals("")) {

                    
                }else{

                    double convertTemp;
                    String finalTemp;

                    if (c2f.isChecked()) {

                        convertTemp = ((Double.parseDouble(enterTemp)) * 9 / 5) + 32;

                        finalTemp = String.valueOf(convertTemp);

                        display.setText(finalTemp);


                    } else if (f2c.isChecked()) {

                        convertTemp = ((Double.parseDouble(enterTemp)) - 32) * 5 / 9;

                        finalTemp = String.valueOf(convertTemp);

                        display.setText(finalTemp);

                    }

                }
            }
        });

    }

//    public void setc2f(){
//        f2c.setChecked(false);
//        isChecked = true;
//    }
//    public void setf2c(){
//        c2f.setChecked(false);
//        isChecked = false;
//
//    }
    public void setbtn(){


    }

}
