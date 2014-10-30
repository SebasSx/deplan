package com.appAndroid.deplan;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.net.Uri;
import android.widget.ImageButton;

import com.appAndroid.deplan.R;



/**
 * Clase auxiliar con el contenido del listado
 * @author Google, modificado por Ramon Invarato Menéndez
 * @see {@link www.jarroba.es}
 */
public class Lista_contenido {

	/** 
	 * Donde se guardan las entradas de la lista.
	 */
	public static ArrayList<Lista_entrada> ENTRADAS_LISTA = new ArrayList<Lista_entrada>();
	
	/** 
	 * Donde se asigna el identificador a cada entrada de la lista
	 */
	public static Map<String, Lista_entrada> ENTRADAS_LISTA_HASHMAP = new HashMap<String, Lista_entrada>();
	
	/** 
	 * Creamos estáticamente las entradas
	 */
	static {
		aniadirEntrada(new Lista_entrada("0","DESFILE INAGURAL", R.drawable.afiche_opt, "31 de octubre de 2014, 10:00 AM", "Plaza de Bolívar de Tunja", "Entrada Libre"));
		aniadirEntrada(new Lista_entrada("1","JUANES EN CONCIERTO", R.drawable.juanes_opt, "8 de noviembre de 2014, 7:00 PM", "Estadio la Independencia Tunja", "$33.000 General, $55.000 VIP"));
		aniadirEntrada(new Lista_entrada("2","JOVENES Y PENSAMIENTO", R.drawable.jovenes_opt, "1 de noviembre de 2014, 7:00 PM", "Coliseo cubierto de Tunja", "$11.000 - General"));
		aniadirEntrada(new Lista_entrada("3","TABLADO, FLAMENCO, TANGO Y CHACARERA", R.drawable.tablado_opt, "3 de noviembre de 2014, 7:00 PM", "Coliseo cubierto de Tunja", "$11.000 General, $66.000-$88.000 VIP"));
		aniadirEntrada(new Lista_entrada("4","MUJERES LATINOAMERICANAS EN CONCIERTO", R.drawable.mujeres_opt, "4 de noviembre de 2014, 7:00 PM", "Coliseo cubierto de Tunja", "$16.500 General, $88.000-$110.000 VIP"));
		aniadirEntrada(new Lista_entrada("5","AÑOS DORADOS DE LA MUSICA ROMANTICA", R.drawable.nochesestelares_opt, "5 de noviembre de 2014, 7:00 PM", "Coliseo cubierto de Tunja", "$16.500 General, $88.000-$110.000 VIP"));
		aniadirEntrada(new Lista_entrada("6","FOLCLOR MEXICANO", R.drawable.mariachi_opt, "6 de noviembre de 2014, 7:00 PM", "Coliseo cubierto de Tunja", "$11.000 General, $66.000-$88.000 VIP"));
		aniadirEntrada(new Lista_entrada("7", "DANZA FOLCLORICA", R.drawable.danza, "29 y 30 de octubre, 10:00 AM", "Casa Cultural Enrique Medina Flores", "Entrada Libre"));
		aniadirEntrada(new Lista_entrada("8","FORO - TALLER Danza Folclórica", 
				R.drawable.danza, "29 y 30 de octubre de 2014, 2:00 PM", 
				"Auditorio Eduardo Caballero Calderón ", "Entrada Libre"));

			aniadirEntrada(new Lista_entrada("9","JORNADA EN HOMENAJE A LA NIÑEZ", 
				R.drawable.literatura, "31 de octubre de 2014, 3:00 PM", 
				"Plaza de Bolívar Tunja", "Entrada Libre"));

			aniadirEntrada(new Lista_entrada("10","PELÍCULA DE ESPAÑA: LAS 13 ROSAS", 
				R.drawable.cine, "31 de octubre de 2014, 3:00 PM", 
				"Teatro Suarez", "Entrada Libre"));
			
			aniadirEntrada(new Lista_entrada("11","BALLET FOLCLÓRICO DE ORIZABA–MÉXICO", 
				R.drawable.danza, "31 de octubre de 2014, 7:00 PM", 
				"Teatro Maldonado", "Entrada Libre"));

			aniadirEntrada(new Lista_entrada("12","TEATRO LA GRUTA, Obra: Retrato de un Santo", 
				R.drawable.teatro, "31 de octubre de 2014, 7:00 PM", 
				"Teatro Cultural", "Entrada Libre"));

			aniadirEntrada(new Lista_entrada("13","PELÍCULA DE RUSIA, ANNA KARENINA", 
				R.drawable.cine, "31 de octubre de 2014, 7:00 PM", 
				"Teatro Suarez", "Entrada Libre"));

			aniadirEntrada(new Lista_entrada("14","ORQUESTA SINFÓNICA DE CAFAM-BOGOTÁ", 
				R.drawable.musica, "31 de octubre de 2014, 7:00 PM", 
				"Templo de San Ignacio", "Entrada Libre"));

			aniadirEntrada(new Lista_entrada("15","TEATRO CUENTAN LOS QUE CUENTAN – Gatostado de Colombia", 
				R.drawable.teatro, "31 de octubre de 2014, 7:00 PM", 
				"Auditorio Eduardo Caballero Calderón", "Entrada Libre"));

			aniadirEntrada(new Lista_entrada("16","PENCHY CASTRO - Salsa", 
				R.drawable.musica, "31 de octubre de 2014, 7:00 PM", 
				"Plaza de Bolívar Tunja", "Entrada Libre"));

			aniadirEntrada(new Lista_entrada("17","NUESTRAS HISTORIAS DEBEN SER CONTADAS CORTOMETRAJES BOYACENSES", 
				R.drawable.cine, "1 de noviembre de 2014, 10:00 AM", 
				"Teatro Suarez", "Entrada Libre"));

			aniadirEntrada(new Lista_entrada("18","TEATRO ACADEMIA TALLER, INSTITUCIÓN EDUCATIVA JULIUS SIEBER", 
				R.drawable.teatro, "1 de noviembre de 2014, 10:00 AM", 
				"Teatro Cultural", "Entrada Libre"));
			
			aniadirEntrada(new Lista_entrada("19","CONVERSATORIO OLEG ZHEGL. AGREGADO CULTURAL DE RUSIA", 
					R.drawable.literatura, "1 de noviembre de 2014, 10:00 AM", 
					"Auditorio Eduardo Caballero Calderón", "Entrada Libre"));

				aniadirEntrada(new Lista_entrada("20","TALLER BALLET FOLCLÓRICO DE ORIZABA–MÉXICO", 
					R.drawable.danza, "1 de noviembre de 2014, 10:00 AM", 
					"Casa Cultural Enrique Medina Flórez", "Entrada Libre"));

				aniadirEntrada(new Lista_entrada("21","GRUPO DE TEATRO FUNDATRÓN Obra: La Tetralogía", 
					R.drawable.teatro, "1 de noviembre de 2014, 10:00 AM", 
					"Teatro Cultural", "Entrada Libre"));

				aniadirEntrada(new Lista_entrada("22","PELÍCULA DE ESPAÑA, CINE INFANTIL LAS AVENTURAS DE TADEO JONES", 
					R.drawable.cine, "1 de noviembre de 2014, 3:00 PM", 
					"Teatro Suarez", "Entrada Libre"));

				aniadirEntrada(new Lista_entrada("23","BALLET FOLCLÓRICO INFANTIL,  IMÁGENES DE PERÚ – PERÚ", 
					R.drawable.danza, "1 de noviembre de 2014, 3:00 PM", 
					"Teatro Maldonado", "Entrada Libre"));

				aniadirEntrada(new Lista_entrada("24","IV ENCUENTRO NACIONAL INFANTIL DE DANZA EN PAREJA – COLOMBIA", 
					R.drawable.danza, "1 de noviembre de 2014, 3:00 PM", 
					"Teatro Maldonado", "Entrada Libre"));

				aniadirEntrada(new Lista_entrada("25","TANNIA ALMEIDA – PARAGUAY, Obra: Paraguay Poesía y Esperanza", 
					R.drawable.literatura, "1 de noviembre de 2014, 3:00 PM", 
					"Salón de la Constitución, Gobernacion de Boyaca", "Entrada Libre"));

				aniadirEntrada(new Lista_entrada("26","MYRIAM VANEGAS. EVOCATIVO CANTO A LA MUJER", 
					R.drawable.literatura, "1 de noviembre de 2014, 3:00 PM", 
					"Auditorio Eduardo Caballero Calderón", "Entrada Libre"));

				aniadirEntrada(new Lista_entrada("27","MÚSICA TARDE JÓVEN, OSCAR ILLERA. MAURICIO MORRIS, VIANKO, SAMUEL", 
					R.drawable.musica, "1 de noviembre de 2014, 3:00 PM", 
					"Plaza de Bolívar", "Entrada Libre"));

				aniadirEntrada(new Lista_entrada("28","REPRESENTACIÓN DEL FESTIVAL DE LOS MUERTOS – JAPÓN", 
					R.drawable.teatro, "1 de noviembre de 2014, 6:00 PM", 
					"Pozo Donato", "Entrada Libre"));

				aniadirEntrada(new Lista_entrada("29","PELÍCULA DE LA REPÚBLICA RUSA – Stil Yagi", 
					R.drawable.cine, "1 de noviembre de 2014, 6:00 PM", 
					"Plazoleta Muisca", "Entrada Libre"));

				aniadirEntrada(new Lista_entrada("30","BANDA DE BOCA – BRASIL", 
					R.drawable.musica, "1 de noviembre de 2014, 7:00 PM", 
					"Auditorio José Mosser", "Entrada Libre"));

				aniadirEntrada(new Lista_entrada("31","PELÍCULA DE ARGENTINA, HISTORIAS MINIMAS", 
					R.drawable.cine, "1 de noviembre de 2014, 7:00 PM", 
					"Teatro Suarez", "Entrada Libre"));

				aniadirEntrada(new Lista_entrada("32","FUNCIÓN ESTELAR DE DANZAS: GRUPO YUTABASO – BOLIVIA, COLECTIVO ARTÍSTICO DE NARIÑO", 
					R.drawable.danza, "1 de noviembre de 2014, 7:00 PM", 
					"Teatro Suarez", "$11.000 - General"));

				aniadirEntrada(new Lista_entrada("33","TEATRO CUENTAN LOS QUE CUENTAN", 
					R.drawable.teatro, "1 de noviembre de 2014, 7:00 PM", 
					"Auditorio Eduardo Caballero Calderón", "Entrada Libre"));

				aniadirEntrada(new Lista_entrada("34","PELÍCULA DE BRASIL – Malu de Dicicleta", 
					R.drawable.cine, "1 de noviembre de 2014, 7:00 PM", 
					"Plazoleta Multiparque Cooservicios", "Entrada Libre"));
				
				aniadirEntrada(new Lista_entrada("35","GRUPO DE TEATRO  PLÉYADE – Teatro Clow, Obra: Joker y/o comodín", 
						R.drawable.teatro, "2 de noviembre de 2014, 10:00 AM", 
						"Teatro Cultural", "Entrada Libre"));

					aniadirEntrada(new Lista_entrada("36","GRABACIÓN PRIMER TRAILER ANIMADO EN BOYACÁ ALIENT BOYACENSE", 
						R.drawable.cine, "2 de noviembre de 2014, 10:00 AM", 
						"Plaza de Bolívar", "Entrada Libre"));

					aniadirEntrada(new Lista_entrada("37","LITERATURA Y ACADEMIA CONFERENCIA URY RODRIGUEZ – CUBA", 
						R.drawable.literatura, "2 de noviembre de 2014, 10:00 AM", 
						"Auditorio Eduardo Caballero Calderón, Sec de Cultura y Turismo de Boyacá Tunja", "Entrada Libre"));

					aniadirEntrada(new Lista_entrada("38","TARDE DE ROCK Y BOYACÁ ROCK", 
						R.drawable.rock_opt, "2 de noviembre de 2014, 10:00 AM", 
						"Coliseo Cubierto", "Entrada Libre")); 
					
					aniadirEntrada(new Lista_entrada("39","CONVERSATORIO ANDRÉ MATTOS. BRASIL. TEATRO CON NIÑOS", 
							R.drawable.literatura, "2 de noviembre de 2014, 3:00 PM", 
							"Salón de la Constitución, Gobernacion de Boyacá", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("40","ASOCIACIÓN DE LITERATURA: ANTOLOGÍA BOSA", 
							R.drawable.literatura, "2 de noviembre de 2014, 3:00 PM", 
							"Auditorio Eduardo Caballero Calderón, Sec de Cultura y Turismo de Boyacá Tunja", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("41","CONCIERTO BLANCO: NATHAN IRONSIDE–AUSTRALIA, GIOVANNI HERNÁNDEZ, DANIEL MENDOZA", 
							R.drawable.musica, "2 de noviembre de 2014, 3:00 PM", 
							"Plaza de Bolívar", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("42","CONCIERTO CUERDA Y VOZ: MARTÍN TRIO–VENEZUELA", 
							R.drawable.musica, "2 de noviembre de 2014, 3:00 PM", 
							"Auditorio José Mosser", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("43","FUNCIÓN ESTELAR DE TEATRO Obra:PHARMAKON, Protagonista ALEJANDRA BORRERO", 
							R.drawable.teatro, "2 de noviembre de 2014, 7:00 PM", 
							"Teatro Maldonado", "$16.500 - General"));

						aniadirEntrada(new Lista_entrada("44","TEATRO CUENTAN LOS QUE CUENTAN, LUIS GABRIEL MORENO MURCIA", 
							R.drawable.teatro, "2 de noviembre de 2014, 7:00 PM", 
							"Auditorio Eduardo Caballero Calderón, Sec de Cultura y Turismo de Boyacá, Tunja", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("45","ESTELAR DE DANZA: CRÒNICA DE UNA OBRA DANZADA: L´EXPLOSE", 
							R.drawable.danza, "2 de noviembre de 2014, 7:00 PM", 
							"Teatro Suarez", "$11.000 - General"));

						aniadirEntrada(new Lista_entrada("46","TALLER DE FOTOGRAFÍA Y VIDEO: POR LOS SENDEROS DE LA FOTOGRAFÍA", 
							R.drawable.cine, "3 de noviembre de 2014, 10:00 AM", 
							"Plaza de Bolívar", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("47","GRUPO DE TEATRO MAGIA ROJA, Obra: La Madriguera", 
							R.drawable.teatro, "3 de noviembre de 2014, 10:00 AM", 
							"Teatro Cultural", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("48","DANZAS – ACADEMIA TALLER: GRUPO DE DANZAS BARRANQUILLA", 
							R.drawable.danza, "3 de noviembre de 2014, 10:00 AM", 
							"Casa Cultural Enrique Medina Flórez, Calle 19 No, 12-54", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("49","TARDE DE JÓVENES CAMPESINOS Y EXPRESIONES AUTÓCTONAS", 
							R.drawable.musica, "3 de noviembre de 2014, 3:00 PM", 
							"Plaza de Bolívar", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("50","CLÁSICOS DE LA MÚSICA Y LA DANZA", 
							R.drawable.musica, "3 de noviembre de 2014, 3:00 PM", 
							"Auditorio José Mosser", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("51","DANZAS COLOMBIA BALLET FOLCLÓRICO DE CUNDINAMARCA", 
							R.drawable.danza, "3 de noviembre de 2014, 3:00 PM", 
							"Teatro Maldonado", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("52","VOCES LÍRICAS DEL MUNDO", 
							R.drawable.musica, "3 de noviembre de 2014, 7:00 PM", 
							"Templo de San Ignacio", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("53","GABOCO–GRUPO DE DANZAS GARAGOA", 
							R.drawable.danza, "3 de noviembre de 2014, 7:00 PM", 
							"Teatro Suarez", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("54","FUNCIÓN ESTELAR DE DANZAS: DANZA INTERNACIONAL–BRASIL", 
							R.drawable.danza, "3 de noviembre de 2014, 7:00 PM", 
							"Teatro Maldonado", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("55","FUNCIÓN ESTELAR DE DANZAS: GRUPO DE DANZAS UNIVERSIDAD DEL ATLÁNTICO", 
							R.drawable.danza, "3 de noviembre de 2014, 7:00 PM", 
							"Teatro Maldonado", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("56","TEATRO CUENTAN LOS QUE CUENTAN: NELSON LÓPEZ", 
							R.drawable.teatro, "3 de noviembre de 2014, 7:00 PM", 
							"Auditorio Eduardo Caballero Calderón, Sec de Cultura y Turismo de Boyacá Tunja", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("57","LA TRAMOYA–TEATRO NACIONAL Obra: El Hombre Reina y la Mujer Gobierna", 
							R.drawable.teatro, "3 de noviembre de 2014, 7:00 PM", 
							"Teatro Cultural", "$11.000 General"));
						aniadirEntrada(new Lista_entrada("58","PREMIACIÓN TERCER ENCUENTRO DEPARTAMENTAL DEL CUENTO INFANTIL", 
								R.drawable.literatura, "4 de noviembre de 2014, 10:00 AM", 
								"Salón de la Constitución, Gobernacion de Boyacá", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("59","TALLER DE MONTAJE. EDICIÒN SISTEMA ADOBE AFTER EFFECTS", 
								R.drawable.cine, "4 de noviembre de 2014, 10:00 AM", 
								"Teatro Suárez", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("60","LANZAMIENTO DE OBRA: EUTIMIO REYES: ESCRITOR BOYACENSE", 
								R.drawable.literatura, "4 de noviembre de 2014, 10:00 AM", 
								"Auditorio Eduardo Caballero Calderón, Sec de Cultura y Turismo de Boyacá Tunja", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("61","TALLER DE SAMBA Y DANZA DEL FOLCLOR DEL  BRASIL", 
								R.drawable.danza, "4 de noviembre de 2014, 10:00 AM", 
								"Casa Cultural Enrique Medina Flórez. Calle 19 No. 12-54", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("62","GRUPO DE TEATRO ALMEIDA, Obra: Colcha de Risas", 
								R.drawable.teatro, "4 de noviembre de 2014, 10:00 AM", 
								"Teatro Cultural", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("63","PRIMER FESTIVAL BOYACENSE  DE POESÍA COSTUMBRISTA", 
								R.drawable.literatura, "4 de noviembre de 2014, 2:00 PM", 
								"Auditorio José Mosser", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("64","TALLER DE MONTAJE: MUSICALIZACIÓN Y EFECTOS DE SONIDO", 
								R.drawable.cine, "4 de noviembre de 2014, 2:00 PM", 
								"Teatro  Suarez", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("65","RECITAL POÉTICO", 
								R.drawable.literatura, "4 de noviembre de 2014, 3:00 PM", 
								"Auditorio Eduardo Caballero Calderón, Sec de Cultura y Turismo de Boyacá Tunja", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("66","CONFERENCIA: DESARROLLO DE LA MÚSICA GREGORIANA EN VENEZUELA", 
								R.drawable.literatura, "4 de noviembre de 2014, 3:00 PM", 
								"Salón de la Constitución, Gobernacion de Boyacá", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("67","TARDE DE TRIOS Y CUERDAS", 
								R.drawable.musica, "4 de noviembre de 2014, 3:00 PM", 
								"Plaza de Bolívar", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("68","PELÍCULA SARA Y PELÍCULA PUNTO CRÍTICO", 
								R.drawable.cine, "4 de noviembre de 2014, 6:00 PM", 
								"Teatro Suarez", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("69","CONCIERTO VIENTOS Y SUR", 
								R.drawable.musica, "4 de noviembre de 2014, 7:00 PM", 
								"Templo de San Ignacio", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("70","BALLET ANDINO DE ECUADOR", 
								R.drawable.danza, "4 de noviembre de 2014, 7:00 PM", 
								"Teatro Maldonado", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("71","CORPOESFERA DANZA EXPERIMENTAL CONTEMPORÁNEA–BUCARAMANGA", 
								R.drawable.danza, "4 de noviembre de 2014, 7:00 PM", 
								"Teatro Maldonado", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("72","TEATRO CUENTAN LOS QUE CUENTAN, RAMSÉS MOCTEZUMA", 
								R.drawable.teatro, "4 de noviembre de 2014, 7:00 PM", 
								"Auditorio Eduardo Caballero Calderón, Sec de Cultura y Turismo de Boyacá Tunja", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("73","GRUPO CULTURAL LA CASA DE TESPIS. PERÚ", 
								R.drawable.teatro, "4 de noviembre de 2014, 7:00 PM", 
								"Teatro Cultural", "Entrada Libre"));
			
	}

	
	/** Añade una entrada a la lista
	 * @param entrada Elemento que añadimos a la lista
	 */
	private static void aniadirEntrada(Lista_entrada entrada) {
		ENTRADAS_LISTA.add(entrada);
		ENTRADAS_LISTA_HASHMAP.put(entrada.id, entrada);
	}

	/**
	 * Representa una entrada del contenido de la lista
	 */
	public static class Lista_entrada {
		public String id;
		public String titulo;
		public int image;
		public String fechaHora;
		public String lugar;
		public String precio;
		
		  
		public Lista_entrada (String id, String titulo, int image, String fecha, String lugar, String precio) { 
			this.id = id;
			this.titulo = titulo;
			this.image = image;
			this.fechaHora = fecha;
			this.lugar = lugar;
			this.precio = precio;
			
		}
	}
	
}
