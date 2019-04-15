package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context ctx = MainActivity.this;
        class Calc{
            int num, res;
            String op;
            public void execute(int int1){
                switch (op){
                    case "+":
                        res = num +
                        break;
                    case "-":

                        break;
                    case "*":

                        break;
                    case "/":

                        break;
                }
            }
            int getNum(){return num;}
            void setNum(){this.num = num;}
        }
        final EditText num = findViewById(R.id.num);


        findViewById(R.id.plus).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int int1 = Integer.parseInt(num.getText().toString());
                //sum = int1 + int2;
                
                Calc c = new Calc();
                c.execute(int1);
            }
        });

        findViewById(R.id.minus).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int int1 = Integer.parseInt(num.getText().toString());

            }
        });

        findViewById(R.id.multi).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int int1 = Integer.parseInt(num.getText().toString());

            }
        });

        findViewById(R.id.divid).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int int1 = Integer.parseInt(num.getText().toString());

            }
        });

        findViewById(R.id.equal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }
}
