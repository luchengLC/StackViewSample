package com.example.lc.stackviewsample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.SimpleAdapter;
import android.widget.StackView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends Activity {
    StackView stackView;
    int[] imageIds = new int[]{
            R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f
    };

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stackView = (StackView) findViewById(R.id.stackView);

        List<Map<String ,Object>> listItems = new ArrayList<Map<String, Object>>();
        for (int i = 0;i<imageIds.length;i++){
            Map<String,Object> listItem = new HashMap<String, Object>();
            listItems.add(listItem);
        }

        //创建一个SimpleAdapter
        SimpleAdapter simpleAdapter = new SimpleAdapter(this,listItems,R.layout.cell,new String[]{"image"},new int[] {R.id.image1});

        stackView.setAdapter(simpleAdapter);
    }
    public void prev(View view){
        stackView.showPrevious();
    }
    public void next(View view){
        stackView.showNext();
    }

}
