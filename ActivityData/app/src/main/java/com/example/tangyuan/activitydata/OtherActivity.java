package com.example.tangyuan.activitydata;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Intent intent=getIntent();
        String Id=intent.getStringExtra("id");
        Integer num=intent.getIntExtra("num",2014011449);
        Toast.makeText(this,Id+num,Toast.LENGTH_LONG).show();

    }

}
