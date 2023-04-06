package com.dalvik.elementosui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.dalvik.elementosui.databinding.ActivitySpinnerBinding;

public class SpinnerActivity extends AppCompatActivity {

    private ActivitySpinnerBinding binding;

    String[] array_experience = new String[]{"Selecciona experiencia", "Word", "Excel", "Power Point"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_spinner);

        //Simple spinner adapter
        //Este adapter es el que utiliza el spinner por default, no se puede modifcar
        //ArrayAdapter adapterSpinner = new ArrayAdapter(this, android.R.layout.simple_spinner_item, array_experience);
        ArrayAdapter adapterSpinnerDefault = new ArrayAdapter(this, android.R.layout.simple_spinner_item, array_experience);
        binding.spinExperienceDefault.setAdapter(adapterSpinnerDefault);


        //Simple custom adapter
        //Este adapter le podemos cambiar el layout por uno customizado, pero solo el texto, el color.
        //ArrayAdapter adapterSpinner = new ArrayAdapter(this, R.layout.spinner_item, array_experience);

        ArrayAdapter adapterSpinnerCustom = new ArrayAdapter(this, R.layout.spinner_item, array_experience);
        binding.spinExperienceCustom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position != 0) {
                    Toast.makeText(getApplicationContext(), array_experience[position], Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        binding.spinExperienceCustom.setAdapter(adapterSpinnerCustom);

    }
}