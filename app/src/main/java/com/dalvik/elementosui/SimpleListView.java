package com.dalvik.elementosui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.dalvik.elementosui.databinding.ActivitySimpleListViewBinding;

public class SimpleListView extends AppCompatActivity {

    private ActivitySimpleListViewBinding binding;

    String[] array_experience = new String[]{"Word", "Excel", "Power Point"};

    //Este array lo obtenemos de los archivos res
    String[] array_experience_res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_simple_list_view);

        array_experience_res = getResources().getStringArray(R.array.array_technology);

        //Listview con adapter default
        //ArrayAdapter adapterSpinnerDefault = new ArrayAdapter(this, android.R.layout.simple_list_item_1, array_experience);

        //Listview con adapter custom
        ArrayAdapter<String> adapterSpinnerDefault = new ArrayAdapter<>(this, R.layout.spinner_item, array_experience_res);

        binding.listExperience.setAdapter(adapterSpinnerDefault);

        //Listview clic
        binding.listExperience.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), adapterSpinnerDefault.getItem(position), Toast.LENGTH_LONG).show();
            }
        });
    }
}