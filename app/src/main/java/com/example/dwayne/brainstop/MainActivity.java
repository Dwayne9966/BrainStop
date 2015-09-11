package com.example.dwayne.brainstop;


import android.media.AudioManager;
import android.media.MediaPlayer;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.VelocityTrackerCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.app.Application;


public class MainActivity extends AppCompatActivity {
private MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void btn_play(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentA = new Number_1();
        fragmentManager.beginTransaction()
                .replace(R.id.home_page, fragmentA)
                .addToBackStack(null)
                .commit();
    }
    /**
     * The First button number after the home_click
     **/
    public void btn_number_1(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentB = new Excercise_1();
        fragmentManager.beginTransaction()
                .replace(R.id.home_page,fragmentB)
                .addToBackStack(null)
                .commit();
    }
    public void sound_five(View v) {
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        mp = MediaPlayer.create(this, R.raw.five);
        mp.start();
    }
/**
 * The First exercise button after the home_click
 **/
    public void four_ex(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentC =new Smile();
        fragmentManager.beginTransaction()
                .replace(R.id.home_page,fragmentC)
                .addToBackStack(null)
                .commit();
    }
    public void one_ex(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentD = new Frown();
        fragmentManager.beginTransaction()
                .replace(R.id.home_page,fragmentD)
                .addToBackStack(null)
                .commit();
    }
    public void frwn_bck(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentE = new Excercise_1();
        fragmentManager.beginTransaction()
                .replace(R.id.home_page,fragmentE)
                .addToBackStack(null)
                .commit();
    }
    public void btn_smile(View v ){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentF = new Number_2();
        fragmentManager.beginTransaction()
                .replace(R.id.home_page,fragmentF)
                .addToBackStack(null)
                .commit();
    }
    /**
    // After the first Exercise continuing with the Numbers after that.
    **/
    public void btn_number_2(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentG = new Exercise_2();
        fragmentManager.beginTransaction()
                .replace(R.id.home_page,fragmentG)
                .addToBackStack(null)
                .commit();
    }
        public void sound_ten(View v){
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        mp = MediaPlayer.create(this, R.raw.ten);
        mp.start();
    }
    /**
     * Exercise 2
     */
    public void five_ex(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentH = new Frown_2();
        fragmentManager.beginTransaction()
                .replace(R.id.home_page,fragmentH)
                .addToBackStack(null)
                .commit();
    }
    public void nine_ex(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentI = new Smile_2();
        fragmentManager.beginTransaction()
                .replace(R.id.home_page,fragmentI)
                .addToBackStack(null)
                .commit();
    }
    public void btn_frown_2(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentJ = new Exercise_2();
        fragmentManager.beginTransaction()
                .replace(R.id.home_page,fragmentJ)
                .addToBackStack(null)
                .commit();
    }
}
