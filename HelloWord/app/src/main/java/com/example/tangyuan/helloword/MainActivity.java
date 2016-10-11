package com.example.tangyuan.helloword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    Button mButton;
    TextView mTextView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.button);
        mTextView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button2);
        mButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0) {
                String answer = "Yes";
                mTextView.setText(answer);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String answer = "No";
                mTextView.setText(answer);
            }
        });
    }
}
