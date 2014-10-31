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
							
							aniadirEntrada(new Lista_entrada("74","CONFERENCIA FRANK LIZ – PUERTO RICO", 
									R.drawable.literatura, "5 de noviembre de 2014, 10:00 AM", 
									"Salón de la Constitución, Gobernacion de Boyacá", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("75","CORTOMETRAJE - ALIENT HUNTER", 
									R.drawable.cine, "5 de noviembre de 2014, 10:00 AM", 
									"Teatro Suárez", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("76","TALLER LITERARIO: MARTA GÓMEZ - CANTAUTORA", 
									R.drawable.literatura, "5 de noviembre de 2014, 10:00 AM", 
									"Auditorio Eduardo Caballero Calderón, Sec de Cultura y Turismo de Boyacá Tunja", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("77","GRUPO DE TEATRO SOMBRAS, Obra: Androide", 
									R.drawable.teatro, "5 de noviembre de 2014, 10:00 AM", 
									"Teatro Cultural", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("78","TALLER: BALLET ANDINO DE ECUADOR", 
									R.drawable.danza, "5 de noviembre de 2014, 10:00 AM", 
									"Casa Cultural Enrique Medina Flórez. Calle 19 No. 12-54", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("79","PELÍCULA VENEZOLANA – DIARIO DE BUCARAMANGA", 
									R.drawable.cine, "5 de noviembre de 2014, 3:00 PM", 
									"Teatro Sogamoso", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("80","FUNDACIÓN DANZAS CARUPANO -VENEZUELA", 
									R.drawable.danza, "5 de noviembre de 2014, 3:00 PM", 
									"Teatro Maldonado", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("81","GRUPO DE DANZAS DARLE VIDA A LOS AÑOS - ADULTO MAYOR NOBSA", 
									R.drawable.danza, "5 de noviembre de 2014, 3:00 PM", 
									"Teatro Maldonado", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("82","TÍTERES: GRUPO DE TEATRO EL CARRIEL, Obra:El que nada sabe, como que no ve", 
									R.drawable.teatro, "5 de noviembre de 2014, 3:00 PM", 
									"Auditorio José Mosser", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("83","CONVERSATORIO, LIBROS REFERENTES DE HONDURAS SIGLO XX", 
									R.drawable.literatura, "5 de noviembre de 2014, 3:00 PM", 
									"Auditorio Eduardo Caballero Calderón, Sec de Cultura y Turismo de Boyacá Tunja", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("84","PRESENTACIÓN DEL LIBRO 'MÚSICA POR COLORES' DICCIONARIO DE ESCALAS", 
									R.drawable.literatura, "5 de noviembre de 2014, 3:00 PM", 
									"Auditorio DIAN", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("85","TARDE DE CONCIERTO LATINOAMERICANO", 
									R.drawable.musica, "5 de noviembre de 2014, 3:00 PM", 
									"Plaza de Bolívar", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("86","REPRESENTACIÓN ARTÍSTICA DE LA TRADICIÓN JAPONESA", 
									R.drawable.teatro, "5 de noviembre de 2014, 6:00 PM", 
									"Pozo Donato", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("87","PELÍCULA VENEZOLANA – BOLIVAR EL HOMBRE DE LAS DIFICULTADES", 
									R.drawable.cine, "5 de noviembre de 2014, 7:00 PM", 
									"Teatro Suárez", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("88","MANUEL ROJAS - Y SU TRIO INSTRUMENTAL VENEZOLANO", 
									R.drawable.musica, "5 de noviembre de 2014, 7:00 PM", 
									"Templo de San Ignacio", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("89","TEATRO CUENTAN LOS QUE CUENTAN: SERGIO MONARES", 
									R.drawable.teatro, "5 de noviembre de 2014, 7:00 PM", 
									"Auditorio Eduardo Caballero Calderón, Sec de Cultura y Turismo de Boyacá Tunja", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("90","FUNCIÓN ESTELAR DE DANZAS: GRUPO INDICHURIS – ECUADOR", 
									R.drawable.danza, "5 de noviembre de 2014, 7:00 PM", 
									"Teatro Maldonado", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("91","BALLET FOLCLÓRICO  DE PAIPA", 
									R.drawable.danza, "5 de noviembre de 2014, 7:00 PM", 
									"Teatro Maldonado", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("92","RUEDA DE PRENSA: LOS TRI-O ANUNCIAN OFICIALMENTE AL MUNDO SU REGRESO", 
									R.drawable.musica, "6 de noviembre de 2014, 10:00 AM", 
									"Salón de la Constitución, Gobernacion de Boyacá", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("93","TALLER DE MAQUILLAJE FX", 
									R.drawable.cine, "6 de noviembre de 2014, 10:00 AM", 
									"Teatro Suarez", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("94","LIZ DEL MAR: CANTA AL POETA JULIO FLÓREZ", 
									R.drawable.literatura, "6 de noviembre de 2014, 10:00 AM", 
									"Auditorio Eduardo Caballero Calderón, Sec de Cultura y Turismo de Boyacá Tunja", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("95","GRUPO DE TEATRO SOMBRITAS Obra: Infantil – Solo vine a hablar por teléfono", 
									R.drawable.teatro, "6 de noviembre de 2014, 10:00 AM", 
									"Teatro Cultural", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("96","GRUPO DE TEATRO SOMBRITAS Obra: Juvenil:  Los doce cuentos peregrinos, historias de mi abuelo", 
									R.drawable.teatro, "6 de noviembre de 2014, 10:00 AM", 
									"Teatro Cultural", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("97","TALLER DE DIBUJO, COLECTIVO CULTURAL UPTC", 
									R.drawable.literatura, "6 de noviembre de 2014, 10:00 AM", 
									"Salón Presidentes, Casa del Fundador ", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("98","TALLER: GRUPO DE DANZAS KATUETE PARAGUAY", 
									R.drawable.danza, "6 de noviembre de 2014, 10:00 AM", 
									"Casa Cultural Enrique Medina Flórez. Calle 19 No. 12-54", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("99","TARDE DE POESÍA LÍRICA", 
									R.drawable.literatura, "6 de noviembre de 2014, 3:00 PM", 
									"Auditorio Eduardo Caballero Calderón, Sec de Cultura y Turismo de Boyacá Tunja", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("100","CONVERSATORIO: Música Popular e Identidad Cultural en Brasil", 
									R.drawable.literatura, "6 de noviembre de 2014, 3:00 PM", 
									"Auditorio Sena", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("101","CONFERENCIA. MAGDALENA CORRADINE MORA", 
									R.drawable.literatura, "6 de noviembre de 2014, 3:00 PM", 
									"Auditorio DIAN", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("102","TEATRO COMEDIA Y CUENTERÍA, LUIS FERRO GARAY – El Guachimán", 
									R.drawable.teatro, "6 de noviembre de 2014, 3:00 PM", 
									"Auditorio José Mosser", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("103","TEATRO COMEDIA Y CUENTERÍA, JUAN SEBASTIÁN ALEJANDRO ESTUPIÑÁN ", 
									R.drawable.teatro, "6 de noviembre de 2014, 3:00 PM", 
									"Auditorio José Mosser", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("104","ESCUELA DE DANZAS DE FUNZA CUNDINAMARCA", 
									R.drawable.danza, "6 de noviembre de 2014, 3:00 PM", 
									"Plaza de Bolívar", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("105","LANZAMIENTO TRAILER ANIMADO EN BOYACÁ “ALIENT BOYACENSE”", 
									R.drawable.cine, "6 de noviembre de 2014, 3:00 y 4:00 PM", 
									"Teatro Suárez", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("106","GUITARRAS EN CONCIERTO: JULIAN RODRÍGUEZ BLANCO", 
									R.drawable.musica, "6 de noviembre de 2014, 5:00 PM", 
									"Auditorio Sena", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("107","VOCES A CAPELA", 
									R.drawable.musica, "6 de noviembre de 2014, 7:00 PM", 
									"Templo de San Ignacio", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("108","CUARTETO ACÚSTICO BRASILERO – BRASIL", 
									R.drawable.musica, "6 de noviembre de 2014, 7:00 PM", 
									"Auditorio José Mosser", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("109","ORQUESTA SINFÓNICA DE TUNJA", 
									R.drawable.musica, "6 de noviembre de 2014, 7:00 PM", 
									"Auditorio José Mosser", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("110","MARIA EUGENIA PENAGOS Y EL CÍRCULO NACIONAL DE ARTISTAS Obra: Noviazgo en 1920", 
									R.drawable.teatro, "6 de noviembre de 2014, 7:00 PM", 
									"Teatro Cultural", "$11.000 General"));

								aniadirEntrada(new Lista_entrada("111","FUNCIÓN ESTELAR DE DANZAS: GRUPO KATUETE - PARAGUAY", 
									R.drawable.danza, "6 de noviembre de 2014, 7:00 PM", 
									"Teatro Maldonado", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("112","FUNCIÓN ESTELAR DE DANZAS: GRUPO PIES ANDINOS DE PAIPA", 
									R.drawable.danza, "6 de noviembre de 2014, 7:00 PM", 
									"Teatro Maldonado", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("113","TEATRO CUENTAN LOS QUE CUENTAN: CRISTIAN RUEDA CHAPARRO", 
									R.drawable.teatro, "6 de noviembre de 2014, 7:00 PM", 
									"Auditorio Eduardo Caballero Calderón, Sec de Cultura y Turismo de Boyacá Tunja", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("114","CINEMATOGRAFÍA ESTRELLA QUIERO SER", 
									R.drawable.cine, "6 de noviembre de 2014, 7:00 PM", 
									"Teatro Suárez", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("115","PANEL DE DIRECTORES: EL HACER CINE EN COLOMBIA", 
									R.drawable.literatura, "7 de noviembre de 2014, 10:00 AM", 
									"Auditorio Eduardo Caballero Calderón, Sec de Cultura y Turismo de Boyacá Tunja", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("116","PRESENTACIÓN Y ENTREGA DE OBRAS ACADEMIA BOYACENSE DE HISTORIA", 
									R.drawable.literatura, "7 de noviembre de 2014, 10:00 AM", 
									"Salón de la Constitución, Gobernacion de Boyacá", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("117","GRUPO DE TEATRO ANDRÁGORA, Obra: El jardín de la discordia", 
									R.drawable.teatro, "7 de noviembre de 2014, 10:00 AM", 
									"Teatro Cultural", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("118","GRUPO DE DANZAS ROSADELA DE VENEZUELA", 
									R.drawable.danza, "7 de noviembre de 2014, 10:00 AM", 
									"Casa Cultural Enrique Medina Flórez. Calle 19 No. 12-54", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("119","CONFERENCIA: OPORTUNIDADES DE ESTUDIOS, INVESTIGACIÓN Y BECAS EN ALEMANIA", 
									R.drawable.literatura, "7 de noviembre de 2014, 11:00 AM", 
									"Auditorio Sena", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("120","CINEMATOGRAFÍA TIERRA EN LA LENGUA", 
									R.drawable.cine, "7 de noviembre de 2014, 3:00 PM", 
									"Teatro Suárez", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("121","CONVERSATORIO: VIDA Y OBRA CON EL MAESTRO PEPE SÁNCHEZ", 
									R.drawable.literatura, "7 de noviembre de 2014, 3:00 PM", 
									"Auditorio Eduardo Caballero Calderón, Sec de Cultura y Turismo de Boyacá Tunja", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("122","Política Exterior de la República Federal de Alemania en el año 2014", 
									R.drawable.literatura, "7 de noviembre de 2014, 3:00 PM", 
									"Salón de la Constitución, Gobernacion de Boyacá", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("123","MÚSICA: TALENTO INFANTIL EN ESCENA", 
									R.drawable.musica, "7 de noviembre de 2014, 3:00 PM", 
									"Plaza de Bolívar", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("124","TEATRO POEMA, CANTO Y RETAHÍLA", 
									R.drawable.teatro, "7 de noviembre de 2014, 3:00 PM", 
									"Auditorio José Mosser", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("125","DHARMA TEATRO, Obra: Circo Ambiente", 
									R.drawable.teatro, "7 de noviembre de 2014, 6:00 PM", 
									"Auditorio José Mosser", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("126","FUNCIÓN ESTELAR DE DANZAS LOS HIDALGOS DE VERONA", 
									R.drawable.danza, "7 de noviembre de 2014, 7:00 PM", 
									"Teatro Cultural", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("127","DANZAS ROSADELA – VENEZUELA", 
									R.drawable.danza, "7 de noviembre de 2014, 7:00 PM", 
									"Teatro Maldonado", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("128","OTRORA INTEGRACIÓN FOLCLÓRICA COLOMBIANA", 
									R.drawable.danza, "7 de noviembre de 2014, 7:00 PM", 
									"Teatro Maldonado", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("129","DANZAS ADULTO MAYOR DE DUITAMA", 
									R.drawable.danza, "7 de noviembre de 2014, 7:00 PM", 
									"Teatro Maldonado", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("130","TEATRO CUENTAN LOS QUE CUENTAN:JAVIER ANDRÉS GONZÁLEZ MORENO", 
									R.drawable.teatro, "7 de noviembre de 2014, 7:00 PM", 
									"Auditorio Eduardo Caballero Calderón, Sec de Cultura y Turismo de Boyacá Tunja", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("131","GRAN CONCIERTO CON Los Tri-O", 
									R.drawable.trio_opt, "7 de noviembre de 2014, 7:00 PM", 
									"Coliseo Cubierto", "Por Definir"));

								aniadirEntrada(new Lista_entrada("132","GRUPO DE TEATRO LA MUEKA Obra: Lúdica para el Equilibrio", 
									R.drawable.teatro, "8 de noviembre de 2014, 10:00 AM", 
									"Teatro Cultural", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("133","CINEMATOGRAFÍA FORO TALLER MANEJO DE CÁMARAS", 
									R.drawable.cine, "8 de noviembre de 2014, 10:00 AM", 
									"Teatro Cultural", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("134","GRAN ESPECTÁCULO DE LA CULTURA CIRCENSE EL SHOW LE PETIT CIRQUE", 
									R.drawable.teatro, "8 de noviembre de 2014, 10:00 AM", 
									"Teatro Cultural", "$11.000 General"));

								aniadirEntrada(new Lista_entrada("135","GRAN ESPECTÁCULO DE LA CULTURA CIRCENSE EL SHOW LE PETIT CIRQUE", 
									R.drawable.teatro, "8 de noviembre de 2014, 3:00 PM", 
									"Coliseo Cubierto", "$11.000 General"));

								aniadirEntrada(new Lista_entrada("136","TARDE DE ORQUESTAS Y GÉNEROS POPULARES", 
									R.drawable.musica, "8 de noviembre de 2014, 3:00 PM", 
									"Plaza de Bolívar", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("137","TEATRO ITINERANTE DEL SOL Obra: Voces de la Tierra", 
									R.drawable.teatro, "8 de noviembre de 2014, 7:00 PM", 
									"Teatro Cultural", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("138","FUNCIÓN ESTELAR DE DANZAS: FUNDACIÓN ARTÍSTICA DEL TUNDAMA", 
									R.drawable.danza, "8 de noviembre de 2014, 7:00 PM", 
									"Teatro Maldonado", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("139","FUNCIÓN ESTELAR DE DANZAS: FUNDACIÓN NUBALÉ DE COLOMBIA", 
									R.drawable.danza, "8 de noviembre de 2014, 7:00 PM", 
									"Teatro Maldonado", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("140","FUNCIÓN ESTELAR DE DANZAS: GRUPO SUADANCE", 
									R.drawable.danza, "8 de noviembre de 2014, 7:00 PM", 
									"Teatro Maldonado", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("141","TEATRO CUENTAN LOS QUE CUENTAN: JORGE ANDRÉS TORRES – EL DIABLO", 
									R.drawable.teatro, "8 de noviembre de 2014, 7:00 PM", 
									"Auditorio Eduardo Caballero Calderón, Sec de Cultura y Turismo de Boyacá Tunja", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("142","EXPOSICION: PUEBLOS – Fotografía", 
									R.drawable.artes, "Evento Permanente", 
									"Sala Rafael Tavera – Secretaría de Cultura y Turismo de Boyacá", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("143","EXPOSICION: MONASTERIOS E ÍCONOS DE LA RUSIA ANTIGUA – Fotografía", 
									R.drawable.artes, "Evento Permanente", 
									"Sala Julio Abril – Secretaría de Cultura y Turismo de Boyacá", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("144","EXPOSICION: ARTISTAS PLASTICOS Y VISUALES DE BOYACÁ FIC 2014", 
									R.drawable.artes, "Evento Permanente", 
									"Sala Francisco Cristancho - Secretaría de Cultura y Turismo de Boyacá", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("145","EXPOSICION: ANTES Y DESPUÉS DEL TSUNAMI – Fotografía", 
									R.drawable.artes, "Evento Permanente", 
									"Secretaría de Cultura y Turismo de Boyacá – Planta 1 y 2", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("146","EXPOSICION: DICTADURA Y DEMOCRACIA EN LA ERA DE LOS EXTREMOS", 
									R.drawable.artes, "Evento Permanente", 
									"Casa del Fundador - Primera Planta", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("147","EXPOSICION: ARTE ABSTRACTO – Pintura", 
									R.drawable.artes, "Evento Permanente", 
									"Casa del Fundador - Segunda Planta", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("148","EXPOSICION: CHINA HERMOSA – Fotografía", 
									R.drawable.artes, "Evento Permanente", 
									"Sala de Exposición - Casa Juan de Vargas", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("149","EXPOSICION: REPÚBLICA DE LA PALABRA – Fotografía e Ilustración", 
									R.drawable.artes, "Evento Permanente", 
									"Palacio de la Torre Gobernación de Boyacá – Segunda Planta", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("150","EXPOSICION: RETROSPECTIVA – Pintura, Dibujo y Escultura", 
									R.drawable.artes, "Evento Permanente", 
									": Casa Museo Gustavo Rojas Pinilla – Sala 2", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("151","EXPOSICION: NATURA PROSPERA – Proyecto Artístico - Joyería", 
									R.drawable.artes, "Evento Permanente", 
									"Casa Museo Gustavo Rojas Pinilla – Sala 1", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("152","EXPOSICION: FOTOGRAFÍA ARTE – INDUSTRIA", 
									R.drawable.artes, "Evento Permanente", 
									"UNICENTRO", "Entrada Libre"));
								
						
								aniadirEntrada(new Lista_entrada("154","DHARMA TEATRO OBRA: Circo Ambiente", 
										R.drawable.teatro, "1 de noviembre, 2:00 PM, AQUITANIA", 
										"Parque Principal - AQUITANIA", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("155","PELÍCULA COSTA RICA: El Regreso", 
										R.drawable.cine, "2 de noviembre, 7:00 PM", 
										"Parque Rock - PAIPA", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("156","PELÍCULA COSTA RICA: Gestación", 
										R.drawable.cine, "2 de noviembre, 7:00 PM", 
										"Parque Rock - PAIPA", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("157","DHARMA TEATRO, OBRA: Circo Ambiente", 
										R.drawable.teatro, "2 de noviembre, 11:00 AM, SAMACA", 
										"Parque Principal - SAMACA", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("158","PELÍCULA ARGENTINA – La Mala Verdad", 
										R.drawable.cine, "3 de noviembre, 6:00 PM", 
										"Plazoleta Tundama – Pueblito Boyacense - DUITAMA", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("159","PELÍCULA ARGENTINA – Industria Argentina", 
										R.drawable.cine, "3 de noviembre, 8:00 PM", 
										"Parque El Carmen - DUITAMA", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("160","DHARMA TEATRO OBRA: Circo Ambiente", 
										R.drawable.teatro, "3 de noviembre, 11:00 AM, PAZ DEL RIO", 
										"Parque Principal - PAZ DEL RIO", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("161","DHARMA TEATRO OBRA: Circo Ambiente", 
										R.drawable.teatro, "4 de noviembre, 2:00 PM, SOCHA", 
										"Parque Principal - SOCHA", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("162","PELÍCULA CUBANA – HABANASTATION", 
										R.drawable.cine, "5 de noviembre, 6:00 PM", 
										"Parque Jaime Rook - PAIPA", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("163","PELÍCULA CUBANA – HELLO HEMINWAY", 
										R.drawable.cine, "5 de noviembre, 8:00 PM", 
										"Parque Jaime Rook - PAIPA", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("164","DHARMA TEATRO OBRA: Circo Ambiente", 
										R.drawable.teatro, "5 de noviembre, 2:00 PM, SAN JOSÉ DE PARE", 
										"Parque Principal - SAN JOSÉ DE PARE", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("165","CORTOMETRAJE – EL MURMULLO DE LA TIERRA", 
										R.drawable.cine, "6 de noviembre, 7:00 PM", 
										"Plaza 6 de Septiembre - SOGAMOSO", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("166","DHARMA TEATRO OBRA: Circo Ambiente", 
										R.drawable.teatro, "6 de noviembre, 11:00 AM, TOGUI", 
										"Parque Principal - TOGUI", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("167","DHARMA TEATRO OBRA: Circo Ambiente", 
										R.drawable.teatro, "6 de noviembre, 11:00 AM, TUTA", 
										"Parque Principal - TUTA", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("168","CITY MONKEY. PELÍCULA CHINA", 
										R.drawable.cine, "8 de noviembre, 11:00 AM", 
										"Teatro Sogamoso - SOGAMOSO", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("169","PELÍCULA VENEZOLANA – BOLIVAR EL HOMBRE DE LAS DIFICULTADES", 
										R.drawable.cine, "8 de noviembre, 1:00 PM", 
										"Teatro Sogamoso - SOGAMOSO", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("170","DHARMA TEATRO OBRA: Circo Ambiente", 
										R.drawable.teatro, "8 de noviembre, 11:00 AM, NOBSA", 
										"Parque Principal - NOBSA", "Entrada Libre"));		
			
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
