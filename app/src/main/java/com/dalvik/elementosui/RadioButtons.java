package com.dalvik.elementosui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.dalvik.elementosui.databinding.ActivityRadioButtonsBinding;

public class RadioButtons extends AppCompatActivity {

    private ActivityRadioButtonsBinding binding;
    private String gender = "no selected";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_radio_buttons);

        //Cambiar el texto de un Radio button en especial
        binding.radioMan.setText("Hombrecito");

        //cambiar el color del texto
        binding.radioMan.setTextColor(getColor(android.R.color.holo_orange_dark));

        //Cambiar el tamaño del texto
        binding.radioMan.setTextSize(20f);

        //PROPIEDADES DEL RADIO GROUP

        int genderSelected = binding.radioGroupGender.getCheckedRadioButtonId();
        if (genderSelected != -1) {
            RadioButton radioGender = findViewById(genderSelected);
            gender = "no selected";
            Log.e("RadioButtons", "Gender selected :" + radioGender.getText().toString());
        }

        //Listener para saber cuando ek usuario selecciona un radio
        binding.radioGroupGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radio_man:
                        gender = "man";
                        Log.e("RadioButtons", "Gender selected man");
                        break;
                    case R.id.radio_woman:
                        gender = "woman";
                        Log.e("RadioButtons", "Gender selected woman");
                        break;
                    default:
                        gender = "no selected";
                        Log.e("RadioButtons", "Gender no selected");

                }
            }
        });

    }
}