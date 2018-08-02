package com.bansi.android_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements TextWatcher {

    EditText edt_txt1, edt_txt2;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_txt1 = (EditText) findViewById(R.id.edt_txt1);
        edt_txt2 = (EditText) findViewById(R.id.edt_txt2);
        txt = (TextView) findViewById(R.id.txt);

        edt_txt1.addTextChangedListener(this);
        edt_txt2.addTextChangedListener(this);

    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable)
    {
        Integer num1=0,num2=0;
        if(!edt_txt1.getText().toString().isEmpty())
        {
            num1 = Integer.parseInt(edt_txt1.getText().toString());
        }

        if(!edt_txt2.getText().toString().isEmpty())
        {
            num2 = Integer.parseInt(edt_txt2.getText().toString());
        }
        Integer sum = num1 + num2;
        txt.setText(sum+"");
    }
}