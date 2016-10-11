package com.example.tangyuan.component;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton radioButton1;
    RadioButton radioButton2;
    CheckBox checkbox;
    TextView textView;
    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioButton1 = (RadioButton) findViewById(R.id.radioButton);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        checkbox = (CheckBox) findViewById(R.id.checkBox);
        editText = (EditText)  findViewById(R.id.extractEditText);
        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {
                String edit = editText.getText().toString();
                textView.setText(edit);
            }
        });
        radioButton1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {
                String edit = "男";
                textView.setText(edit);
            }
        });
        radioButton2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {
                String edit = "女";
                textView.setText(edit);
            }
        });
    }
}

