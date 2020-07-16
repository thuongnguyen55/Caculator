package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editA, editB;
    RadioButton rbdCong, rbdTru, rbdNhan, rbdChia;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    TextView txtHt;
    boolean flag = false;
    String a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = "";
        b = "";
        editA = (EditText) findViewById(R.id.editA);
        editB = (EditText) findViewById(R.id.editB);
        rbdCong = (RadioButton) findViewById(R.id.rbdCong);
        rbdTru = (RadioButton) findViewById(R.id.rbdTru);
        rbdNhan = (RadioButton) findViewById(R.id.rbdNhan);
        rbdChia = (RadioButton) findViewById(R.id.rbdChia);
        txtHt = (TextView) findViewById(R.id.txtHt);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);

    editA.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            flag = true;
        }
    });

        editA.setOnFocusChangeListener(new View.OnFocusChangeListener() {
        @Override
        public void onFocusChange(View v, boolean hasFocus) {
            if (hasFocus) {
                flag = true;
            }
        }
    });


        editB.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            flag = false;
        }
    });

        editB.setOnFocusChangeListener(new View.OnFocusChangeListener() {
        @Override
        public void onFocusChange(View v, boolean hasFocus) {
            if (hasFocus) {
                flag = false;
            }
        }
    });
}


    public void so1(View v)
    {
        if (flag) {
            a += btn1.getText().toString();
            editA.setText(a);
        } else {
            b += btn1.getText().toString();
            editB.setText(b);
        }
    }
    public void so2(View v)
    {
        if (flag) {
            a += btn2.getText().toString();
            editA.setText(a);
        } else {
            b += btn2.getText().toString();
            editB.setText(b);
        }
    }
    public void so3(View v)
    {
        if (flag) {
            a += btn3.getText().toString();
            editA.setText(a);
        } else {
            b += btn3.getText().toString();
            editB.setText(b);
        }
    }
    public void so4(View v)
    {
        if (flag) {
            a += btn4.getText().toString();
            editA.setText(a);
        } else {
            b += btn4.getText().toString();
            editB.setText(b);
        }
    }
    public void so5(View v)
    {
        if (flag) {
            a += btn5.getText().toString();
            editA.setText(a);
        } else {
            b += btn5.getText().toString();
            editB.setText(b);
        }
    }
    public void so6(View v)
    {
        if (flag) {
            a += btn6.getText().toString();
            editA.setText(a);
        } else {
            b += btn6.getText().toString();
            editB.setText(b);
        }
    }
    public void so7(View v)
    {
        if (flag) {
            a += btn7.getText().toString();
            editA.setText(a);
        } else {
            b += btn7.getText().toString();
            editB.setText(b);
        }
    }
    public void so8(View v)
    {
        if (flag) {
            a += btn8.getText().toString();
            editA.setText(a);
        } else {
            b += btn8.getText().toString();
            editB.setText(b);
        }
    }
    public void so9(View v)
    {
        if (flag) {
            a += btn9.getText().toString();
            editA.setText(a);
        } else {
            b += btn9.getText().toString();
            editB.setText(b);
        }
    }
    public void so0(View v)
    {
        if (flag) {
            a += btn0.getText().toString();
            editA.setText(a);
        } else {
            b += btn0.getText().toString();
            editB.setText(b);
        }
    }

    public void display(View v){
        Double a = Double.parseDouble(editA.getText().toString());
        Double b = Double.parseDouble(editB.getText().toString());
        Double s;
        if (rbdCong.isChecked() == true)
            s = a + b;
        else if (rbdTru.isChecked() == true)
            s= a-b;
        else if (rbdNhan.isChecked() == true)
            s= a*b;
        else
            s= a/b;
        txtHt.setText(String.valueOf(s));
    }

    public void reset(View view){
        a="";
        b="";
        editA.setText("");
        editB.setText("");
    }


    public void exit(View view) {
        System.exit(0);
    }
}