package com.dalvik.elementosui.exampleRecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.dalvik.elementosui.R;
import com.dalvik.elementosui.databinding.ActivityRecyclerViewBinding;

public class RecyclerViewActivity extends AppCompatActivity {
    private ActivityRecyclerViewBinding binding;
    private CustomAdapter adapter;
    String[] array_experience = new String[]{"Word", "Excel", "Power Point"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler_view);
        adapter = new CustomAdapter(array_experience);
        //binding.recyclerPrograms.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerPrograms.setAdapter(adapter);
    }
}