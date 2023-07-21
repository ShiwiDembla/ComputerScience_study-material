package com.example.notes1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button SubmitBtn;
    EditText text;
    ListView lstview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] task = new String[] { };
        final List<String> task_list = new ArrayList<String>(Arrays.asList(task));

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, task_list);


        SubmitBtn = (Button) findViewById(R.id.Submit);
        text = (EditText) findViewById(R.id.inputtext);
        lstview= (ListView) findViewById(R.id.txt);

        lstview.setAdapter(arrayAdapter);
        SubmitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item = text.getText().toString();
                task_list.add(item);

                arrayAdapter.notifyDataSetChanged();
            }
        });

    }


}