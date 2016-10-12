package com.example.tangyuan.activitydata2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent intent=getIntent();
        String id=intent.getStringExtra("id");
        Integer num=intent.getIntExtra("num",2014011449);
        Toast.makeText(this,id+num,Toast.LENGTH_LONG).show();

        Button button=(Button)findViewById(R.id.button9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=getIntent();
                String id=intent.getStringExtra("id");
                Integer num=intent.getIntExtra("num",2014011449);
                intent.putExtra("data","回传数据:"+id+num);
                setResult(0,intent);
                finish();
            }
        });


    }

}
