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
                .commit();}
    public void btn_frown_2(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentJ = new Exercise_2();
        fragmentManager.beginTransaction()
                .replace(R.id.home_page,fragmentJ)
                .addToBackStack(null)
                .commit();
    }
    public void btn_smile_2(View v){
        FragmentManager fragmentManager  = getSupportFragmentManager();
        Fragment fragmentK = new Number_3();
        fragmentManager.beginTransaction()
                .replace(R.id.home_page,fragmentK)
                .addToBackStack(null)
                .commit();
    }
/**
 * Number 3_xml forwarding to the Smile and Frown
 */
public void btn_number_3(View v) {
    FragmentManager fragmentManager = getSupportFragmentManager();
    Fragment fragmentL = new Exercise_3();
    fragmentManager.beginTransaction()
            .replace(R.id.home_page, fragmentL)
            .addToBackStack(null)
            .commit();
}
    public void sound_three(View v){
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        mp = MediaPlayer.create(this, R.raw.three);
        mp.start();
    }
/**
 * Exercise 3 waar n keuse gemaak moet word.(Smile/Frown)
 */
public void two_ex(View v){
    FragmentManager fragmentManager = getSupportFragmentManager();
    Fragment fragmentM = new Smile_3();
    fragmentManager.beginTransaction()
            .replace(R.id.home_page,fragmentM)
            .addToBackStack(null)
            .commit();
}
public void zero_ex(View v){
    FragmentManager fragmentManager = getSupportFragmentManager();
    Fragment fragmentN = new Frown_3();
    fragmentManager.beginTransaction()
            .replace(R.id.home_page,fragmentN)
            .addToBackStack(null)
            .commit();
}
    public void btn_frown_3(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentO = new Exercise_3();
        fragmentManager.beginTransaction()
                .replace(R.id.home_page, fragmentO)
                .addToBackStack(null)
                .commit();
    }

    public void btn_smile_3(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentP = new Exercise_4();
        fragmentManager.beginTransaction()
                .replace(R.id.home_page,fragmentP)
                .addToBackStack(null)
                .commit();
    }
    public void btn_number_six(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentR = new Frown_4();
        fragmentManager.beginTransaction()
                .replace(R.id.home_page,fragmentR)
                .addToBackStack(null)
                .commit();
    }
    public void btn_frown_4(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentS = new Exercise_4();
        fragmentManager.beginTransaction()
                .replace(R.id.home_page,fragmentS)
                .addToBackStack(null)
                .commit();
    }
    public void btn_nmbr_five(View v){
     FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentT = new Smile_4();
        fragmentManager.beginTransaction()
                .replace(R.id.home_page,fragmentT)
                .addToBackStack(null)
                .commit();
    }
    public void btn_smile_4(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
       Fragment fragmentU = new Exercise_5();
        fragmentManager.beginTransaction()
                .replace(R.id.home_page,fragmentU)
                .addToBackStack(null)
                .commit();
    }
    /*
    * Exercise 5
    * */
    public void btn_one_ex(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentW = new Frown_5();
        fragmentManager.beginTransaction()
                .replace(R.id.home_page,fragmentW)
                .addToBackStack(null)
                .commit();
    }
    public void btn_seven(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentX = new Smile_5();
        fragmentManager.beginTransaction()
                .replace(R.id.home_page,fragmentX)
                .addToBackStack(null)
                .commit();
    }
    public void btn_frown_5(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentY = new Exercise_5();
        fragmentManager.beginTransaction()
                .replace(R.id.home_page,fragmentY)
                .addToBackStack(null)
                .commit();
    }
public void btn_smile_5(View v){
    FragmentManager fragmentManager = getSupportFragmentManager();
    Fragment fragmentV = new Main_Celebration();
    fragmentManager.beginTransaction()
            .replace(R.id.home_page,fragmentV)
            .addToBackStack(null)
            .commit();
}

}






