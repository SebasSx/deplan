package com.appAndroid.deplan;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Window;

public  class BarraTitulo extends FragmentActivity{
	
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);

	        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);

	        setContentView(R.layout.barratitulo);

	        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.barratitulo);
	    }
	 
	 

}
