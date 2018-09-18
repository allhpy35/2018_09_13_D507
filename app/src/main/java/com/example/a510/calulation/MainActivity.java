package com.example.a510.calulation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    protected double ans = 0.; //Answer
    protected Button btnEqual;

    protected void inputNum(){

    }

  protected   double op4(String  sOp, double x){
        return 0;
    }

    protected double mathOp(String sFun, double x){
        return 0;
    }


   protected void printNum(double x){

    }

    protected void calculate(){

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnEqual = (Button)findViewById(R.id.btnEqual);

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
            }
        });
    }







}
