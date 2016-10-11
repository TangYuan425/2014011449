package com.example.tangyuan.listview;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import com.example.tangyuan.listview.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class MainActivity extends AppCompatActivity {
    ListView list;
    private final static String NAME = "name";
    private final static String AGE = "age";
    private final static String PHONE = "phone";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.listView);
        String[] name = {"糖糖 ","娅娅","玲玲"};
        String[] age = {"20","21","20"};
        String[] phone = {"001","002","003"};
        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();
        for(int i=0;i<name.length;i++) {
            Map<String, Object> item = new HashMap<String, Object>();
            item.put(NAME, name[i]);
            item.put(AGE, age[i]);
            item.put(PHONE, phone[i]);
            items.add(item);
        }
        SimpleAdapter adapter=new SimpleAdapter(this,items,R.layout.item,new String[]{NAME,AGE,PHONE},
        new int[]{R.id.name,R.id.age,R.id.phone});
    list.setAdapter(adapter);
    }
}