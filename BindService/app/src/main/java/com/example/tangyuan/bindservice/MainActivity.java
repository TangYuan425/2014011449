package com.example.tangyuan.bindservice;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MyService myService=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ServiceConnection serviceConnection=new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                Toast.makeText(MainActivity.this, "onServiceConnected", Toast.LENGTH_SHORT).show();
                myService=((MyService.LocalBinder)iBinder).getService();
            }

            @Override
            public void onServiceDisconnected(ComponentName componentName) {
                Toast.makeText(MainActivity.this, "onServiceDisconnected", Toast.LENGTH_SHORT).show();
            }
        } ;

        Button buttonStart=(Button)findViewById(R.id.buttonStart);
        Button buttonEnd=(Button)findViewById(R.id.buttonEnd);
        Button buttonUsing=(Button)findViewById(R.id.buttonUse);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MyService.class);
                bindService(intent,serviceConnection, Service.BIND_AUTO_CREATE);
            }
        });

        buttonEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unbindService(serviceConnection);
            }
        });
        buttonUsing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(myService!=null){
                    Toast.makeText(MainActivity.this, "Using Service:"+myService.add(1,2), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
