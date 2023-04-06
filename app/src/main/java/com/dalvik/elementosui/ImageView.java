package com.dalvik.elementosui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.dalvik.elementosui.databinding.ActivityButtoonBinding;
import com.dalvik.elementosui.databinding.ActivityImageViewBinding;

public class ImageView extends AppCompatActivity {
    private ActivityImageViewBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_image_view);

        //Esta linea es para cambiar una imagen
        binding.imgCover.setImageResource(R.drawable.cambiarimagen);

        //Esta linea es para ponerle un ScaleType a una imagen
        binding.imgCover.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);

        binding.imgCover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Clic en la imagen", Toast.LENGTH_SHORT).show();
            }
        });
    }
}