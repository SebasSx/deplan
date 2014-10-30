package com.appAndroid.deplan;

import com.appAndroid.deplan.R;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity{
	
	// Duración en milisegundos que se mostrará el splash
    private final int DURACION_SPLASH = 3000; // 3 segundos
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        new Handler().postDelayed(new Runnable(){
            public void run(){
		// Cuando pasen los 3 segundos, pasamos a la actividad principal de la aplicación
        	Intent intent = new Intent(SplashActivity.this, Activity_Principal.class);
        	startActivity(intent);
        	finish();
            };
        }, DURACION_SPLASH);
    }

}
