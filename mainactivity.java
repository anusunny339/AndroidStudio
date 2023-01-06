package com.example.sjcet.myapplication3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,et2;
   TextView tv1;
    String a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        tv1=findViewById(R.id.tv1);




    }

    public void add(View view) {

        a=(e1.getText().toString());
        b=et2.getText().toString();
        int res= (Integer.parseInt(a)+(Integer.parseInt(b)));
        tv1.setText("result = "+String.valueOf(res));
       // Integer c=(Integer.parseInt(a)+Integer.parseInt(b));
        //Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }


    public void sub(View view) {
        a=(e1.getText().toString());
        b=et2.getText().toString();
        int res= (Integer.parseInt(a)-(Integer.parseInt(b)));
        tv1.setText("result = "+String.valueOf(res));
    }

    public void mul(View view) {
        a=(e1.getText().toString());
        b=et2.getText().toString();
        int res= (Integer.parseInt(a)*(Integer.parseInt(b)));
        tv1.setText("result = "+String.valueOf(res));
    }

    public void div(View view) {
        a=(e1.getText().toString());
        b=et2.getText().toString();
        int res= (Integer.parseInt(a)/(Integer.parseInt(b)));
        tv1.setText("result = "+String.valueOf(res));
    }
}
