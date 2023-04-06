package com.dalvik.elementosui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;

import com.dalvik.elementosui.databinding.ActivityCheckBoxBinding;

public class CheckBox extends AppCompatActivity {
    private ActivityCheckBoxBinding binding;

    private boolean rememberUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_check_box);

        //Cambiar el texto del check box
        binding.checkRememberUser.setText("Recordar usuario");

        //Cambiar color de texto
        binding.checkRememberUser.setTextColor(getColor(android.R.color.holo_green_dark));

        //Cambiar tamaño de texto
        binding.checkRememberUser.setTextSize(20f);

        //Setear valor checked
        binding.checkRememberUser.setChecked(false);

        //Obtener el valor
        rememberUser= binding.checkRememberUser.isChecked();
        //Log.e("checkbox","isChecked: "+isChecked);

        binding.checkRememberUser.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                rememberUser = isChecked;
                //Log.e("checkbox","listener isChecked: "+isChecked);
            }
        });



        
    }
}