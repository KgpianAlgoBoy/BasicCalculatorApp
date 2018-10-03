package com.example.divyamsharma.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public static final String TAG="BTN";
    TextView tvresult;
    EditText etvar1;
    Button plus;
    Button minus;
    Button multiply;
    Button divide;
    Button nine;
    Button eight;
    Button seven;
    Button six;
    Button five;
    Button four;
    Button three;
    Button two;
    Button one;
    Button clear;
    Button equal;
    Button zero;
    String var;
    char v1;
    String v3;
    int var2=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvresult=findViewById(R.id.tvresult);
        etvar1=findViewById(R.id.etvar1);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        multiply=findViewById(R.id.multiply);
        divide=findViewById(R.id.divide);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        zero=findViewById(R.id.zero);
        clear=findViewById(R.id.clear);
        equal=findViewById(R.id.equal);





        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int var1=Integer.valueOf(etvar1.getText().toString());
                //int var2=Integer.valueOf(etvar2.getText().toString());
                //int var3=var1+var2;
                tvresult.setText(String.valueOf(""));
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  var=(etvar1.getText().toString());
                tvresult.setText(String.valueOf(""));
                v1 ='p';


            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var=(etvar1.getText().toString());
                tvresult.setText(String.valueOf(""));
                v1 ='m';


            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var=(etvar1.getText().toString());
                tvresult.setText(String.valueOf(""));
                v1 ='u';


            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var=(etvar1.getText().toString());
                tvresult.setText(String.valueOf(""));
                v1 ='d';


            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvresult.append(String.valueOf(0));



            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvresult.append(String.valueOf(1));



            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvresult.append(String.valueOf(2));



            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvresult.append(String.valueOf(3));



            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvresult.append(String.valueOf(4));



            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvresult.append(String.valueOf(5));



            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String already=etvar1.getText().toString();
                tvresult.append(String.valueOf(6));



            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvresult.append(String.valueOf(7));



            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvresult.append(String.valueOf(8));



            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvresult.append(String.valueOf(9));



            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v3=etvar1.getText().toString();

                if(v1=='p')
                {
                    var2=Integer.parseInt(var)+Integer.parseInt(v3);
                }
                if(v1=='m')
                {
                    var2=Integer.parseInt(var)-Integer.parseInt(v3);
                }
                if(v1=='u')
                {
                    var2=Integer.parseInt(var)*Integer.parseInt(v3);
                }
                if(v1=='d')
                {
                    var2=Integer.parseInt(var)/Integer.parseInt(v3);
                }


                tvresult.setText(String.valueOf(var2));



            }
        });








    }






}
