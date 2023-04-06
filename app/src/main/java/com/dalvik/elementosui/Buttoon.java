package com.dalvik.elementosui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.dalvik.elementosui.databinding.ActivityButtoonBinding;

public class Buttoon extends AppCompatActivity {

    private ActivityButtoonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_buttoon);

        //Cambiar texto
        binding.btnSave.setText("botoncito");

        //Cambiar color de texto
        //binding.btnSave.setTextColor(getColor(android.R.color.holo_red_dark));

        //Cambiar tamaño de texto
        //binding.btnSave.setTextSize(30f);

        //Cambiar background
        //binding.btnSave.setBackgroundColor(getColor(android.R.color.holo_green_dark));

        binding.btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"clic en button",Toast.LENGTH_SHORT).show();

            }
        });
    }
}