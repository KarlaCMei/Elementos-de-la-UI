package com.dalvik.elementosui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dalvik.elementosui.exampleCardView.CardViewActivity;
import com.dalvik.elementosui.exampleRecycler.RecyclerViewActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnTextView;
    private Button btnEditText;
    private Button btnButton;
    private Button btnImageView;
    private Button btnCheckBox;
    private Button btnRadioButtons;
    private Button btnSwitch;
    private Button btnSpinner;
    private Button btnSimpleList;
    private Button btnMenu;
    private Button btnRecycler;
    private Button btnCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTextView = findViewById(R.id.btn_text_view);
        btnEditText = findViewById(R.id.btn_edit_text);
        btnButton = findViewById(R.id.btn_button);
        btnImageView = findViewById(R.id.btn_image_view);
        btnCheckBox = findViewById(R.id.btn_check_box);
        btnRadioButtons = findViewById(R.id.btn_radio_buttons);
        btnSwitch = findViewById(R.id.btn_switch);
        btnSpinner = findViewById(R.id.btn_spinner);
        btnSimpleList = findViewById(R.id.btn_simple_list);
        btnMenu = findViewById(R.id.btn_menu);
        btnRecycler = findViewById(R.id.btn_recycler);
        btnCardView = findViewById(R.id.btn_card);


        btnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Textview.class);
                startActivity(intent);
            }
        });

        btnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Edittext.class);
                startActivity(intent);
            }
        });

        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Buttoon.class);
                startActivity(intent);
            }
        });

        btnImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ImageView.class);
                startActivity(intent);
            }
        });

        btnCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CheckBox.class);
                startActivity(intent);
            }
        });

        btnRadioButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RadioButtons.class);
                startActivity(intent);
            }
        });

        btnSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Switch.class);
                startActivity(intent);
            }
        });

        btnSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SpinnerActivity.class);
                startActivity(intent);
            }
        });

        btnSimpleList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SimpleListView.class);
                startActivity(intent);
            }
        });

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

        btnRecycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                startActivity(intent);
            }
        });

        btnCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CardViewActivity.class);
                startActivity(intent);
            }
        });


    }
}