package com.dalvik.elementosui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.DataBindingUtil;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.dalvik.elementosui.databinding.ActivityTextviewBinding;

public class Textview extends AppCompatActivity {

    //Pasos para data binding
    //Paso 2 Crear objeto binding del tipo de tu layout
    private ActivityTextviewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Pasos para data binding
        //Paso 3 Inicializar el objeto binding con nuestro layout
        //Paso 4 Convertir nuestro layout a binding layout, que es basicamente
        //agregar _todo nuestro diseño entre estas etiquetas <layout></layout>
        binding = DataBindingUtil.setContentView(this,R.layout.activity_textview);

        //Cambiar texto o setearle
        //binding.textName.setText("Mi nueva cadena con binding");
        //binding.textColor.setText("nuevo volor");

        //Cambiar tamaño de texto
        //binding.textName.setTextSize(5f);

        //Cambiar tipo de texto a negritas
        //binding.textName.setTypeface(Typeface.DEFAULT_BOLD);

        //Cambiar background
        //binding.textName.setBackgroundColor(getColor(android.R.color.holo_green_dark));

        //Cambiar FONT FAMILY TAREA
        //binding.textName


        //Cambiar margins TAREA
        //RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        //params.setMargins(10,10,10,10);
        //binding.textName.setLayoutParams(params);

        //Clic en elemento

        binding.textName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"clic en textview",Toast.LENGTH_SHORT).show();
            }
        });

    }
}