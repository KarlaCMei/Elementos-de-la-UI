package com.dalvik.elementosui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;

import com.dalvik.elementosui.databinding.ActivityEdittextBinding;

public class Edittext extends AppCompatActivity {

    private ActivityEdittextBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_edittext);


        //Setear nombre
        //binding.editName.setText("Nuevo texto");

        //Setearle un hint
        //binding.editName.setHint("Nuevo texto hint");

        //Obtener el texto
       /* String valor;
        binding.editName.setText("texto a obtener");
        valor = binding.editName.getText().toString();
        Log.e("valor","valor: "+valor);*/

        //Obtener valor y convertirlo a string
        /*int valor;
        binding.editName.setText("4");
        valor = Integer.parseInt(binding.editName.getText().toString());
        Log.e("valor","valor: "+valor);*/

        //Cambiar background
        //binding.editName.setBackgroundColor(getColor(android.R.color.holo_orange_dark));
        //Cambiar color texto
        //binding.editName.setTextColor(getColor(android.R.color.holo_blue_bright));


    }
}