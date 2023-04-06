package com.dalvik.elementosui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;

import com.dalvik.elementosui.databinding.ActivitySwitchBinding;

public class Switch extends AppCompatActivity {
    private ActivitySwitchBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_switch);

        /* //Cambiar el texto
        binding.switchTermnAndConditions.setText("Aceptar terminos y condiciones");

        //Cambiar el color del texto
        binding.switchTermnAndConditions.setTextColor(getColor(android.R.color.holo_purple));

        //Cambiar el tamaño del texto
        binding.switchTermnAndConditions.setTextSize(20f);

        //Cambiar el estado de un switch checked o unChecked
        binding.switchTermnAndConditions.setChecked(false);*/

        //Saber si un switch esta seleccionado
        //boolean isChecked = binding.switchTermnAndConditions.isChecked();
        //Log.e("Checkbox","Switch is checked: "+isChecked);


        //Saber si un switch esta cambiando de estado seleccionado y no seleccionado

        binding.switchTermnAndConditions.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.e("Checkbox","Listener Switch is checked: "+isChecked);
            }
        });
    }
}