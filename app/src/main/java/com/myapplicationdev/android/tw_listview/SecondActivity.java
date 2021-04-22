package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayAdapter aa;
    ArrayList<Module> modules;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvModules);
        tvYear = (TextView) findViewById(R.id.tvYear);



        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);

        modules = new ArrayList< Module>();

        if (year == "Year 1"){
            modules.add(new Module("C100", true));
            modules.add(new Module("C101", true));
            modules.add(new Module("C102", false));
        }else if (year == "Year 2"){
            modules.add(new Module("C208", true));
            modules.add(new Module("C200", false));
            modules.add(new Module("C346", true));
        }else{
            modules.add(new Module("C301", true));
            modules.add(new Module("C302", true));
            modules.add(new Module("C303", false));
        }
        aa = new ModuleAdapter(this, R.layout.row, modules);
        lv.setAdapter(aa);



    }



}
