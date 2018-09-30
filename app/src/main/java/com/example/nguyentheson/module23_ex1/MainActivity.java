package com.example.nguyentheson.module23_ex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee("1","Ng Can A",true));
        empList.add(new Employee("2","Ng Can B",true));
        empList.add(new Employee("3","Ng Can C",false));
        empList.add(new Employee("4","Ng Can D",true));

        final CustomArrayAdapter arrayAdapter = new CustomArrayAdapter(this, R.layout.my_list_layout,empList);

        final ListView lv_empList = findViewById(R.id.empList);
        lv_empList.setAdapter(arrayAdapter);

        Button btn_delete = findViewById(R.id.btn_delete);
        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.out.println("Action call");
                Toast.makeText(MainActivity.this, "Clicked",Toast.LENGTH_LONG);

                for (int i=0; i< lv_empList.getCount();i++){
                    CheckBox cb = lv_empList.getChildAt(i).findViewById(R.id.cb_checker);

                    if(cb.isChecked()){
                        empList.remove(i);
                        arrayAdapter.notifyDataSetChanged();
                    }
                }
            }
        });
    }
}
