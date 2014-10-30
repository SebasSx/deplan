package com.appAndroid.deplan;



import com.appAndroid.deplan.R;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Este fragmento representa el detalle de la entrada seleccionada en la lista.
 * @author Google, modificado por Ramon Invarato Menéndez
 * @see {@link www.jarroba.es}
 */
public class Fragment_Detalle extends Fragment {
	/**
	 * El argumento que representa el ID del elemento selecionado en la lista y que a este fragmento le llega para cargar el contenido apropiado
	 */
	public static final String ARG_ID_ENTRADA_SELECIONADA = "item_id";

	/**
	 * El contenido que cargaremos en este fragmento
	 */
	private Lista_contenido.Lista_entrada mItem;
	
	
	/**
	 * Es obligatorio un contructor vacío para instanciar el fragmento
	 */
	public Fragment_Detalle() {
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		if (getArguments().containsKey(ARG_ID_ENTRADA_SELECIONADA)) {
			//Cargamos el contenido de la entrada con cierto ID seleccionado en la lista. Se recomiendo usar un Loader para cargar el contenido
			mItem = Lista_contenido.ENTRADAS_LISTA_HASHMAP.get(getArguments().getString(ARG_ID_ENTRADA_SELECIONADA));
		}
		
		
		
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.layout_fragment_detalle, container, false);
		
		//Mostramos el contenido al usuario
		if (mItem != null) {
			((TextView) rootView.findViewById(R.id.TituloEvento)).setText(mItem.titulo);
			((ImageView) rootView.findViewById(R.id.imagenEvento)).setImageResource(mItem.image);
			((TextView) rootView.findViewById(R.id.FechaHora)).setText(mItem.fechaHora);
			((TextView) rootView.findViewById(R.id.Lugar)).setText(mItem.lugar);
			((TextView) rootView.findViewById(R.id.precio)).setText(mItem.precio);
			
		}
		ImageButton fb =(ImageButton)rootView.findViewById(R.id.facebook);
		fb.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("https://www.facebook.com/pages/De-Plan/663627670388805?ref=profile"));
				startActivity(intent);
			}
		});
		
		ImageButton tw = (ImageButton) rootView.findViewById(R.id.twitter);
		tw.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("https://twitter.com/deplann"));
				startActivity(intent);
			}
		});
		
		ImageButton share = (ImageButton) rootView.findViewById(R.id.compartir);
		share.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent sharingIntent = new Intent(Intent.ACTION_SEND);
//				for (int i = 0; i < Lista_contenido.ENTRADAS_LISTA.size(); i++) {
//					Uri screenshotUri = Uri.parse("android.resource://"+"com.appAndroid.deplan"+"/"
//				+Lista_contenido.ENTRADAS_LISTA.get(i).image);
//					sharingIntent.setType("image/png");
//					sharingIntent.putExtra(Intent.EXTRA_STREAM, screenshotUri);
//				}
					sharingIntent.setType("text/plain");
				sharingIntent.putExtra(Intent.EXTRA_TEXT, mItem.titulo+", "+mItem.fechaHora+", "+
					mItem.lugar+", "+mItem.precio+" "+"#DePlan");
				
				startActivity(Intent.createChooser(sharingIntent, "Share using"));
				
			}
		});

		return rootView;
	}
	
	
	
}
