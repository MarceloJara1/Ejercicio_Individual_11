package com.example.ejercicio_individual_11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;

import com.example.ejercicio_individual_11.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        View.OnClickListener snackbarClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String text = "";

                if (v == binding.button1){
                    text = "Turn off flight mode";
                }else if(v == binding.button2){
                    text = "Picture saved to gallery";
                } else if (v == binding.button3) {
                    text = "Level 4 completed";
                } else if (v == binding.button4) {
                    text = "Updating profile";
                } else if (v == binding.button5) {
                    text = "Unlocked level 5";
                } else if (v == binding.button6) {
                    text = "Music paused";
                }


                //Crear snackbar
                Snackbar snack = Snackbar.make(v, text,Snackbar.LENGTH_SHORT);
                snack.setAction("Cerrar", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        snack.dismiss();
                    }
                });
                //Mostrar snackbar
                snack.show();
            }
        };


        binding.button1.setOnClickListener(snackbarClickListener);
        binding.button2.setOnClickListener(snackbarClickListener);
        binding.button3.setOnClickListener(snackbarClickListener);
        binding.button4.setOnClickListener(snackbarClickListener);
        binding.button5.setOnClickListener(snackbarClickListener);
        binding.button6.setOnClickListener(snackbarClickListener);




    }
}