package com.appAndroid.deplan;

import com.appAndroid.deplan.R;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Window;



public class Activity_Principal extends FragmentActivity implements Fragment_Lista.Callbacks {
	
	//Guardar� TRUE si es una pantalla grande y caben dos fragmentos; o FALSE si es una pantalla peque�a y cabe solo un fragmento
	private boolean dosFragmentos;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//requestWindowFeature(Window.FEATURE_NO_TITLE);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.layout_activity_principal_listado);
		
		//Se comprueba que exista el framelayout framelayout_contenedor_entrada. Si existe estaremos usando activity_dospaneles.xml, sino estaremos usando activity_listado.xml 
		if (findViewById(R.id.framelayout_contenedor_detalle) != null) {
			// Entra aqu� solo en dise�os para pantallas grandes (es decir, si usamos res/values-large o res/values-sw600dp). Estaremos usando activity_dospaneles.xml
			dosFragmentos = true;
		}
	}

	
	/**
	 * M�todo Callback que escucha cuando un elemento de la lista ha sido pulsado, entonces entra aqu�. Devuelve el ID del elemento de la lista que fue seleccionado
	 */
	@Override
	public void onEntradaSelecionada(String id) {
		if (dosFragmentos) {
			// Si estamos en pantallas grandes, se mostrar� el detalle seleccionado en esta misma actividad remplazando el fragmento del detalle por el nuevo
			Bundle arguments = new Bundle();
			arguments.putString(Fragment_Detalle.ARG_ID_ENTRADA_SELECIONADA, id);
			Fragment_Detalle fragment = new Fragment_Detalle();
			fragment.setArguments(arguments);
			getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_contenedor_detalle, fragment).commit();

		} else {
			// En pantallas peque�as, iniciaremos una nueva actividad con el contenido del elemento seleccionado de la lista
			Intent detailIntent = new Intent(this, Activity_Detalle.class);
			detailIntent.putExtra(Fragment_Detalle.ARG_ID_ENTRADA_SELECIONADA, id);
			startActivity(detailIntent);
		}
	}
}
