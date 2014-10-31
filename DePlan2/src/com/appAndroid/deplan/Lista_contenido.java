package com.appAndroid.deplan;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.net.Uri;
import android.widget.ImageButton;

import com.appAndroid.deplan.R;



/**
 * Clase auxiliar con el contenido del listado
 * @author Google, modificado por Ramon Invarato Men�ndez
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
	 * Creamos est�ticamente las entradas
	 */
	static {
		aniadirEntrada(new Lista_entrada("0","DESFILE INAGURAL", R.drawable.afiche_opt, "31 de octubre de 2014, 10:00 AM", "Plaza de Bol�var de Tunja", "Entrada Libre"));
		aniadirEntrada(new Lista_entrada("1","JUANES EN CONCIERTO", R.drawable.juanes_opt, "8 de noviembre de 2014, 7:00 PM", "Estadio la Independencia Tunja", "$33.000 General, $55.000 VIP"));
		aniadirEntrada(new Lista_entrada("2","JOVENES Y PENSAMIENTO", R.drawable.jovenes_opt, "1 de noviembre de 2014, 7:00 PM", "Coliseo cubierto de Tunja", "$11.000 - General"));
		aniadirEntrada(new Lista_entrada("3","TABLADO, FLAMENCO, TANGO Y CHACARERA", R.drawable.tablado_opt, "3 de noviembre de 2014, 7:00 PM", "Coliseo cubierto de Tunja", "$11.000 General, $66.000-$88.000 VIP"));
		aniadirEntrada(new Lista_entrada("4","MUJERES LATINOAMERICANAS EN CONCIERTO", R.drawable.mujeres_opt, "4 de noviembre de 2014, 7:00 PM", "Coliseo cubierto de Tunja", "$16.500 General, $88.000-$110.000 VIP"));
		aniadirEntrada(new Lista_entrada("5","A�OS DORADOS DE LA MUSICA ROMANTICA", R.drawable.nochesestelares_opt, "5 de noviembre de 2014, 7:00 PM", "Coliseo cubierto de Tunja", "$16.500 General, $88.000-$110.000 VIP"));
		aniadirEntrada(new Lista_entrada("6","FOLCLOR MEXICANO", R.drawable.mariachi_opt, "6 de noviembre de 2014, 7:00 PM", "Coliseo cubierto de Tunja", "$11.000 General, $66.000-$88.000 VIP"));
		aniadirEntrada(new Lista_entrada("7", "DANZA FOLCLORICA", R.drawable.danza, "29 y 30 de octubre, 10:00 AM", "Casa Cultural Enrique Medina Flores", "Entrada Libre"));
		aniadirEntrada(new Lista_entrada("8","FORO - TALLER Danza Folcl�rica", 
				R.drawable.danza, "29 y 30 de octubre de 2014, 2:00 PM", 
				"Auditorio Eduardo Caballero Calder�n ", "Entrada Libre"));

			aniadirEntrada(new Lista_entrada("9","JORNADA EN HOMENAJE A LA NI�EZ", 
				R.drawable.literatura, "31 de octubre de 2014, 3:00 PM", 
				"Plaza de Bol�var Tunja", "Entrada Libre"));

			aniadirEntrada(new Lista_entrada("10","PEL�CULA DE ESPA�A: LAS 13 ROSAS", 
				R.drawable.cine, "31 de octubre de 2014, 3:00 PM", 
				"Teatro Suarez", "Entrada Libre"));
			
			aniadirEntrada(new Lista_entrada("11","BALLET FOLCL�RICO DE ORIZABA�M�XICO", 
				R.drawable.danza, "31 de octubre de 2014, 7:00 PM", 
				"Teatro Maldonado", "Entrada Libre"));

			aniadirEntrada(new Lista_entrada("12","TEATRO LA GRUTA, Obra: Retrato de un Santo", 
				R.drawable.teatro, "31 de octubre de 2014, 7:00 PM", 
				"Teatro Cultural", "Entrada Libre"));

			aniadirEntrada(new Lista_entrada("13","PEL�CULA DE RUSIA, ANNA KARENINA", 
				R.drawable.cine, "31 de octubre de 2014, 7:00 PM", 
				"Teatro Suarez", "Entrada Libre"));

			aniadirEntrada(new Lista_entrada("14","ORQUESTA SINF�NICA DE CAFAM-BOGOT�", 
				R.drawable.musica, "31 de octubre de 2014, 7:00 PM", 
				"Templo de San Ignacio", "Entrada Libre"));

			aniadirEntrada(new Lista_entrada("15","TEATRO CUENTAN LOS QUE CUENTAN � Gatostado de Colombia", 
				R.drawable.teatro, "31 de octubre de 2014, 7:00 PM", 
				"Auditorio Eduardo Caballero Calder�n", "Entrada Libre"));

			aniadirEntrada(new Lista_entrada("16","PENCHY CASTRO - Salsa", 
				R.drawable.musica, "31 de octubre de 2014, 7:00 PM", 
				"Plaza de Bol�var Tunja", "Entrada Libre"));

			aniadirEntrada(new Lista_entrada("17","NUESTRAS HISTORIAS DEBEN SER CONTADAS CORTOMETRAJES BOYACENSES", 
				R.drawable.cine, "1 de noviembre de 2014, 10:00 AM", 
				"Teatro Suarez", "Entrada Libre"));

			aniadirEntrada(new Lista_entrada("18","TEATRO ACADEMIA TALLER, INSTITUCI�N EDUCATIVA JULIUS SIEBER", 
				R.drawable.teatro, "1 de noviembre de 2014, 10:00 AM", 
				"Teatro Cultural", "Entrada Libre"));
			
			aniadirEntrada(new Lista_entrada("19","CONVERSATORIO OLEG ZHEGL. AGREGADO CULTURAL DE RUSIA", 
					R.drawable.literatura, "1 de noviembre de 2014, 10:00 AM", 
					"Auditorio Eduardo Caballero Calder�n", "Entrada Libre"));

				aniadirEntrada(new Lista_entrada("20","TALLER BALLET FOLCL�RICO DE ORIZABA�M�XICO", 
					R.drawable.danza, "1 de noviembre de 2014, 10:00 AM", 
					"Casa Cultural Enrique Medina Fl�rez", "Entrada Libre"));

				aniadirEntrada(new Lista_entrada("21","GRUPO DE TEATRO FUNDATR�N Obra: La Tetralog�a", 
					R.drawable.teatro, "1 de noviembre de 2014, 10:00 AM", 
					"Teatro Cultural", "Entrada Libre"));

				aniadirEntrada(new Lista_entrada("22","PEL�CULA DE ESPA�A, CINE INFANTIL LAS AVENTURAS DE TADEO JONES", 
					R.drawable.cine, "1 de noviembre de 2014, 3:00 PM", 
					"Teatro Suarez", "Entrada Libre"));

				aniadirEntrada(new Lista_entrada("23","BALLET FOLCL�RICO INFANTIL,  IM�GENES DE PER� � PER�", 
					R.drawable.danza, "1 de noviembre de 2014, 3:00 PM", 
					"Teatro Maldonado", "Entrada Libre"));

				aniadirEntrada(new Lista_entrada("24","IV ENCUENTRO NACIONAL INFANTIL DE DANZA EN PAREJA � COLOMBIA", 
					R.drawable.danza, "1 de noviembre de 2014, 3:00 PM", 
					"Teatro Maldonado", "Entrada Libre"));

				aniadirEntrada(new Lista_entrada("25","TANNIA ALMEIDA � PARAGUAY, Obra: Paraguay Poes�a y Esperanza", 
					R.drawable.literatura, "1 de noviembre de 2014, 3:00 PM", 
					"Sal�n de la Constituci�n, Gobernacion de Boyaca", "Entrada Libre"));

				aniadirEntrada(new Lista_entrada("26","MYRIAM VANEGAS. EVOCATIVO CANTO A LA MUJER", 
					R.drawable.literatura, "1 de noviembre de 2014, 3:00 PM", 
					"Auditorio Eduardo Caballero Calder�n", "Entrada Libre"));

				aniadirEntrada(new Lista_entrada("27","M�SICA TARDE J�VEN, OSCAR ILLERA. MAURICIO MORRIS, VIANKO, SAMUEL", 
					R.drawable.musica, "1 de noviembre de 2014, 3:00 PM", 
					"Plaza de Bol�var", "Entrada Libre"));

				aniadirEntrada(new Lista_entrada("28","REPRESENTACI�N DEL FESTIVAL DE LOS MUERTOS � JAP�N", 
					R.drawable.teatro, "1 de noviembre de 2014, 6:00 PM", 
					"Pozo Donato", "Entrada Libre"));

				aniadirEntrada(new Lista_entrada("29","PEL�CULA DE LA REP�BLICA RUSA � Stil Yagi", 
					R.drawable.cine, "1 de noviembre de 2014, 6:00 PM", 
					"Plazoleta Muisca", "Entrada Libre"));

				aniadirEntrada(new Lista_entrada("30","BANDA DE BOCA � BRASIL", 
					R.drawable.musica, "1 de noviembre de 2014, 7:00 PM", 
					"Auditorio Jos� Mosser", "Entrada Libre"));

				aniadirEntrada(new Lista_entrada("31","PEL�CULA DE ARGENTINA, HISTORIAS MINIMAS", 
					R.drawable.cine, "1 de noviembre de 2014, 7:00 PM", 
					"Teatro Suarez", "Entrada Libre"));

				aniadirEntrada(new Lista_entrada("32","FUNCI�N ESTELAR DE DANZAS: GRUPO YUTABASO � BOLIVIA, COLECTIVO ART�STICO DE NARI�O", 
					R.drawable.danza, "1 de noviembre de 2014, 7:00 PM", 
					"Teatro Suarez", "$11.000 - General"));

				aniadirEntrada(new Lista_entrada("33","TEATRO CUENTAN LOS QUE CUENTAN", 
					R.drawable.teatro, "1 de noviembre de 2014, 7:00 PM", 
					"Auditorio Eduardo Caballero Calder�n", "Entrada Libre"));

				aniadirEntrada(new Lista_entrada("34","PEL�CULA DE BRASIL � Malu de Dicicleta", 
					R.drawable.cine, "1 de noviembre de 2014, 7:00 PM", 
					"Plazoleta Multiparque Cooservicios", "Entrada Libre"));
				
				aniadirEntrada(new Lista_entrada("35","GRUPO DE TEATRO  PL�YADE � Teatro Clow, Obra: Joker y/o comod�n", 
						R.drawable.teatro, "2 de noviembre de 2014, 10:00 AM", 
						"Teatro Cultural", "Entrada Libre"));

					aniadirEntrada(new Lista_entrada("36","GRABACI�N PRIMER TRAILER ANIMADO EN BOYAC� ALIENT BOYACENSE", 
						R.drawable.cine, "2 de noviembre de 2014, 10:00 AM", 
						"Plaza de Bol�var", "Entrada Libre"));

					aniadirEntrada(new Lista_entrada("37","LITERATURA Y ACADEMIA CONFERENCIA URY RODRIGUEZ � CUBA", 
						R.drawable.literatura, "2 de noviembre de 2014, 10:00 AM", 
						"Auditorio Eduardo Caballero Calder�n, Sec de Cultura y Turismo de Boyac� Tunja", "Entrada Libre"));

					aniadirEntrada(new Lista_entrada("38","TARDE DE ROCK Y BOYAC� ROCK", 
						R.drawable.rock_opt, "2 de noviembre de 2014, 10:00 AM", 
						"Coliseo Cubierto", "Entrada Libre")); 
					
					aniadirEntrada(new Lista_entrada("39","CONVERSATORIO ANDR� MATTOS. BRASIL. TEATRO CON NI�OS", 
							R.drawable.literatura, "2 de noviembre de 2014, 3:00 PM", 
							"Sal�n de la Constituci�n, Gobernacion de Boyac�", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("40","ASOCIACI�N DE LITERATURA: ANTOLOG�A BOSA", 
							R.drawable.literatura, "2 de noviembre de 2014, 3:00 PM", 
							"Auditorio Eduardo Caballero Calder�n, Sec de Cultura y Turismo de Boyac� Tunja", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("41","CONCIERTO BLANCO: NATHAN IRONSIDE�AUSTRALIA, GIOVANNI HERN�NDEZ, DANIEL MENDOZA", 
							R.drawable.musica, "2 de noviembre de 2014, 3:00 PM", 
							"Plaza de Bol�var", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("42","CONCIERTO CUERDA Y VOZ: MART�N TRIO�VENEZUELA", 
							R.drawable.musica, "2 de noviembre de 2014, 3:00 PM", 
							"Auditorio Jos� Mosser", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("43","FUNCI�N ESTELAR DE TEATRO Obra:PHARMAKON, Protagonista ALEJANDRA BORRERO", 
							R.drawable.teatro, "2 de noviembre de 2014, 7:00 PM", 
							"Teatro Maldonado", "$16.500 - General"));

						aniadirEntrada(new Lista_entrada("44","TEATRO CUENTAN LOS QUE CUENTAN, LUIS GABRIEL MORENO MURCIA", 
							R.drawable.teatro, "2 de noviembre de 2014, 7:00 PM", 
							"Auditorio Eduardo Caballero Calder�n, Sec de Cultura y Turismo de Boyac�, Tunja", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("45","ESTELAR DE DANZA: CR�NICA DE UNA OBRA DANZADA: L�EXPLOSE", 
							R.drawable.danza, "2 de noviembre de 2014, 7:00 PM", 
							"Teatro Suarez", "$11.000 - General"));

						aniadirEntrada(new Lista_entrada("46","TALLER DE FOTOGRAF�A Y VIDEO: POR LOS SENDEROS DE LA FOTOGRAF�A", 
							R.drawable.cine, "3 de noviembre de 2014, 10:00 AM", 
							"Plaza de Bol�var", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("47","GRUPO DE TEATRO MAGIA ROJA, Obra: La Madriguera", 
							R.drawable.teatro, "3 de noviembre de 2014, 10:00 AM", 
							"Teatro Cultural", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("48","DANZAS � ACADEMIA TALLER: GRUPO DE DANZAS BARRANQUILLA", 
							R.drawable.danza, "3 de noviembre de 2014, 10:00 AM", 
							"Casa Cultural Enrique Medina Fl�rez, Calle 19 No, 12-54", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("49","TARDE DE J�VENES CAMPESINOS Y EXPRESIONES AUT�CTONAS", 
							R.drawable.musica, "3 de noviembre de 2014, 3:00 PM", 
							"Plaza de Bol�var", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("50","CL�SICOS DE LA M�SICA Y LA DANZA", 
							R.drawable.musica, "3 de noviembre de 2014, 3:00 PM", 
							"Auditorio Jos� Mosser", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("51","DANZAS COLOMBIA BALLET FOLCL�RICO DE CUNDINAMARCA", 
							R.drawable.danza, "3 de noviembre de 2014, 3:00 PM", 
							"Teatro Maldonado", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("52","VOCES L�RICAS DEL MUNDO", 
							R.drawable.musica, "3 de noviembre de 2014, 7:00 PM", 
							"Templo de San Ignacio", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("53","GABOCO�GRUPO DE DANZAS GARAGOA", 
							R.drawable.danza, "3 de noviembre de 2014, 7:00 PM", 
							"Teatro Suarez", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("54","FUNCI�N ESTELAR DE DANZAS: DANZA INTERNACIONAL�BRASIL", 
							R.drawable.danza, "3 de noviembre de 2014, 7:00 PM", 
							"Teatro Maldonado", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("55","FUNCI�N ESTELAR DE DANZAS: GRUPO DE DANZAS UNIVERSIDAD DEL ATL�NTICO", 
							R.drawable.danza, "3 de noviembre de 2014, 7:00 PM", 
							"Teatro Maldonado", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("56","TEATRO CUENTAN LOS QUE CUENTAN: NELSON L�PEZ", 
							R.drawable.teatro, "3 de noviembre de 2014, 7:00 PM", 
							"Auditorio Eduardo Caballero Calder�n, Sec de Cultura y Turismo de Boyac� Tunja", "Entrada Libre"));

						aniadirEntrada(new Lista_entrada("57","LA TRAMOYA�TEATRO NACIONAL Obra: El Hombre Reina y la Mujer Gobierna", 
							R.drawable.teatro, "3 de noviembre de 2014, 7:00 PM", 
							"Teatro Cultural", "$11.000 General"));
						aniadirEntrada(new Lista_entrada("58","PREMIACI�N TERCER ENCUENTRO DEPARTAMENTAL DEL CUENTO INFANTIL", 
								R.drawable.literatura, "4 de noviembre de 2014, 10:00 AM", 
								"Sal�n de la Constituci�n, Gobernacion de Boyac�", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("59","TALLER DE MONTAJE. EDICI�N SISTEMA ADOBE AFTER EFFECTS", 
								R.drawable.cine, "4 de noviembre de 2014, 10:00 AM", 
								"Teatro Su�rez", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("60","LANZAMIENTO DE OBRA: EUTIMIO REYES: ESCRITOR BOYACENSE", 
								R.drawable.literatura, "4 de noviembre de 2014, 10:00 AM", 
								"Auditorio Eduardo Caballero Calder�n, Sec de Cultura y Turismo de Boyac� Tunja", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("61","TALLER DE SAMBA Y DANZA DEL FOLCLOR DEL  BRASIL", 
								R.drawable.danza, "4 de noviembre de 2014, 10:00 AM", 
								"Casa Cultural Enrique Medina Fl�rez. Calle 19 No. 12-54", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("62","GRUPO DE TEATRO ALMEIDA, Obra: Colcha de Risas", 
								R.drawable.teatro, "4 de noviembre de 2014, 10:00 AM", 
								"Teatro Cultural", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("63","PRIMER FESTIVAL BOYACENSE  DE POES�A COSTUMBRISTA", 
								R.drawable.literatura, "4 de noviembre de 2014, 2:00 PM", 
								"Auditorio Jos� Mosser", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("64","TALLER DE MONTAJE: MUSICALIZACI�N Y EFECTOS DE SONIDO", 
								R.drawable.cine, "4 de noviembre de 2014, 2:00 PM", 
								"Teatro  Suarez", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("65","RECITAL PO�TICO", 
								R.drawable.literatura, "4 de noviembre de 2014, 3:00 PM", 
								"Auditorio Eduardo Caballero Calder�n, Sec de Cultura y Turismo de Boyac� Tunja", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("66","CONFERENCIA: DESARROLLO DE LA M�SICA GREGORIANA EN VENEZUELA", 
								R.drawable.literatura, "4 de noviembre de 2014, 3:00 PM", 
								"Sal�n de la Constituci�n, Gobernacion de Boyac�", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("67","TARDE DE TRIOS Y CUERDAS", 
								R.drawable.musica, "4 de noviembre de 2014, 3:00 PM", 
								"Plaza de Bol�var", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("68","PEL�CULA SARA Y PEL�CULA PUNTO CR�TICO", 
								R.drawable.cine, "4 de noviembre de 2014, 6:00 PM", 
								"Teatro Suarez", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("69","CONCIERTO VIENTOS Y SUR", 
								R.drawable.musica, "4 de noviembre de 2014, 7:00 PM", 
								"Templo de San Ignacio", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("70","BALLET ANDINO DE ECUADOR", 
								R.drawable.danza, "4 de noviembre de 2014, 7:00 PM", 
								"Teatro Maldonado", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("71","CORPOESFERA DANZA EXPERIMENTAL CONTEMPOR�NEA�BUCARAMANGA", 
								R.drawable.danza, "4 de noviembre de 2014, 7:00 PM", 
								"Teatro Maldonado", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("72","TEATRO CUENTAN LOS QUE CUENTAN, RAMS�S MOCTEZUMA", 
								R.drawable.teatro, "4 de noviembre de 2014, 7:00 PM", 
								"Auditorio Eduardo Caballero Calder�n, Sec de Cultura y Turismo de Boyac� Tunja", "Entrada Libre"));

							aniadirEntrada(new Lista_entrada("73","GRUPO CULTURAL LA CASA DE TESPIS. PER�", 
								R.drawable.teatro, "4 de noviembre de 2014, 7:00 PM", 
								"Teatro Cultural", "Entrada Libre"));
							
							aniadirEntrada(new Lista_entrada("74","CONFERENCIA FRANK LIZ � PUERTO RICO", 
									R.drawable.literatura, "5 de noviembre de 2014, 10:00 AM", 
									"Sal�n de la Constituci�n, Gobernacion de Boyac�", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("75","CORTOMETRAJE - ALIENT HUNTER", 
									R.drawable.cine, "5 de noviembre de 2014, 10:00 AM", 
									"Teatro Su�rez", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("76","TALLER LITERARIO: MARTA G�MEZ - CANTAUTORA", 
									R.drawable.literatura, "5 de noviembre de 2014, 10:00 AM", 
									"Auditorio Eduardo Caballero Calder�n, Sec de Cultura y Turismo de Boyac� Tunja", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("77","GRUPO DE TEATRO SOMBRAS, Obra: Androide", 
									R.drawable.teatro, "5 de noviembre de 2014, 10:00 AM", 
									"Teatro Cultural", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("78","TALLER: BALLET ANDINO DE ECUADOR", 
									R.drawable.danza, "5 de noviembre de 2014, 10:00 AM", 
									"Casa Cultural Enrique Medina Fl�rez. Calle 19 No. 12-54", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("79","PEL�CULA VENEZOLANA � DIARIO DE BUCARAMANGA", 
									R.drawable.cine, "5 de noviembre de 2014, 3:00 PM", 
									"Teatro Sogamoso", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("80","FUNDACI�N DANZAS CARUPANO -VENEZUELA", 
									R.drawable.danza, "5 de noviembre de 2014, 3:00 PM", 
									"Teatro Maldonado", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("81","GRUPO DE DANZAS DARLE VIDA A LOS A�OS - ADULTO MAYOR NOBSA", 
									R.drawable.danza, "5 de noviembre de 2014, 3:00 PM", 
									"Teatro Maldonado", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("82","T�TERES: GRUPO DE TEATRO EL CARRIEL, Obra:El que nada sabe, como que no ve", 
									R.drawable.teatro, "5 de noviembre de 2014, 3:00 PM", 
									"Auditorio Jos� Mosser", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("83","CONVERSATORIO, LIBROS REFERENTES DE HONDURAS SIGLO XX", 
									R.drawable.literatura, "5 de noviembre de 2014, 3:00 PM", 
									"Auditorio Eduardo Caballero Calder�n, Sec de Cultura y Turismo de Boyac� Tunja", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("84","PRESENTACI�N DEL LIBRO 'M�SICA POR COLORES' DICCIONARIO DE ESCALAS", 
									R.drawable.literatura, "5 de noviembre de 2014, 3:00 PM", 
									"Auditorio DIAN", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("85","TARDE DE CONCIERTO LATINOAMERICANO", 
									R.drawable.musica, "5 de noviembre de 2014, 3:00 PM", 
									"Plaza de Bol�var", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("86","REPRESENTACI�N ART�STICA DE LA TRADICI�N JAPONESA", 
									R.drawable.teatro, "5 de noviembre de 2014, 6:00 PM", 
									"Pozo Donato", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("87","PEL�CULA VENEZOLANA � BOLIVAR EL HOMBRE DE LAS DIFICULTADES", 
									R.drawable.cine, "5 de noviembre de 2014, 7:00 PM", 
									"Teatro Su�rez", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("88","MANUEL ROJAS - Y SU TRIO INSTRUMENTAL VENEZOLANO", 
									R.drawable.musica, "5 de noviembre de 2014, 7:00 PM", 
									"Templo de San Ignacio", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("89","TEATRO CUENTAN LOS QUE CUENTAN: SERGIO MONARES", 
									R.drawable.teatro, "5 de noviembre de 2014, 7:00 PM", 
									"Auditorio Eduardo Caballero Calder�n, Sec de Cultura y Turismo de Boyac� Tunja", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("90","FUNCI�N ESTELAR DE DANZAS: GRUPO INDICHURIS � ECUADOR", 
									R.drawable.danza, "5 de noviembre de 2014, 7:00 PM", 
									"Teatro Maldonado", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("91","BALLET FOLCL�RICO  DE PAIPA", 
									R.drawable.danza, "5 de noviembre de 2014, 7:00 PM", 
									"Teatro Maldonado", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("92","RUEDA DE PRENSA: LOS TRI-O ANUNCIAN OFICIALMENTE AL MUNDO SU REGRESO", 
									R.drawable.musica, "6 de noviembre de 2014, 10:00 AM", 
									"Sal�n de la Constituci�n, Gobernacion de Boyac�", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("93","TALLER DE MAQUILLAJE FX", 
									R.drawable.cine, "6 de noviembre de 2014, 10:00 AM", 
									"Teatro Suarez", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("94","LIZ DEL MAR: CANTA AL POETA JULIO FL�REZ", 
									R.drawable.literatura, "6 de noviembre de 2014, 10:00 AM", 
									"Auditorio Eduardo Caballero Calder�n, Sec de Cultura y Turismo de Boyac� Tunja", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("95","GRUPO DE TEATRO SOMBRITAS Obra: Infantil � Solo vine a hablar por tel�fono", 
									R.drawable.teatro, "6 de noviembre de 2014, 10:00 AM", 
									"Teatro Cultural", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("96","GRUPO DE TEATRO SOMBRITAS Obra: Juvenil:  Los doce cuentos peregrinos, historias de mi abuelo", 
									R.drawable.teatro, "6 de noviembre de 2014, 10:00 AM", 
									"Teatro Cultural", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("97","TALLER DE DIBUJO, COLECTIVO CULTURAL UPTC", 
									R.drawable.literatura, "6 de noviembre de 2014, 10:00 AM", 
									"Sal�n Presidentes, Casa del Fundador ", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("98","TALLER: GRUPO DE DANZAS KATUETE PARAGUAY", 
									R.drawable.danza, "6 de noviembre de 2014, 10:00 AM", 
									"Casa Cultural Enrique Medina Fl�rez. Calle 19 No. 12-54", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("99","TARDE DE POES�A L�RICA", 
									R.drawable.literatura, "6 de noviembre de 2014, 3:00 PM", 
									"Auditorio Eduardo Caballero Calder�n, Sec de Cultura y Turismo de Boyac� Tunja", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("100","CONVERSATORIO: M�sica Popular e Identidad Cultural en Brasil", 
									R.drawable.literatura, "6 de noviembre de 2014, 3:00 PM", 
									"Auditorio Sena", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("101","CONFERENCIA. MAGDALENA CORRADINE MORA", 
									R.drawable.literatura, "6 de noviembre de 2014, 3:00 PM", 
									"Auditorio DIAN", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("102","TEATRO COMEDIA Y CUENTER�A, LUIS FERRO GARAY � El Guachim�n", 
									R.drawable.teatro, "6 de noviembre de 2014, 3:00 PM", 
									"Auditorio Jos� Mosser", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("103","TEATRO COMEDIA Y CUENTER�A, JUAN SEBASTI�N ALEJANDRO ESTUPI��N ", 
									R.drawable.teatro, "6 de noviembre de 2014, 3:00 PM", 
									"Auditorio Jos� Mosser", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("104","ESCUELA DE DANZAS DE FUNZA CUNDINAMARCA", 
									R.drawable.danza, "6 de noviembre de 2014, 3:00 PM", 
									"Plaza de Bol�var", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("105","LANZAMIENTO TRAILER ANIMADO EN BOYAC� �ALIENT BOYACENSE�", 
									R.drawable.cine, "6 de noviembre de 2014, 3:00 y 4:00 PM", 
									"Teatro Su�rez", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("106","GUITARRAS EN CONCIERTO: JULIAN RODR�GUEZ BLANCO", 
									R.drawable.musica, "6 de noviembre de 2014, 5:00 PM", 
									"Auditorio Sena", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("107","VOCES A CAPELA", 
									R.drawable.musica, "6 de noviembre de 2014, 7:00 PM", 
									"Templo de San Ignacio", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("108","CUARTETO AC�STICO BRASILERO � BRASIL", 
									R.drawable.musica, "6 de noviembre de 2014, 7:00 PM", 
									"Auditorio Jos� Mosser", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("109","ORQUESTA SINF�NICA DE TUNJA", 
									R.drawable.musica, "6 de noviembre de 2014, 7:00 PM", 
									"Auditorio Jos� Mosser", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("110","MARIA EUGENIA PENAGOS Y EL C�RCULO NACIONAL DE ARTISTAS Obra: Noviazgo en 1920", 
									R.drawable.teatro, "6 de noviembre de 2014, 7:00 PM", 
									"Teatro Cultural", "$11.000 General"));

								aniadirEntrada(new Lista_entrada("111","FUNCI�N ESTELAR DE DANZAS: GRUPO KATUETE - PARAGUAY", 
									R.drawable.danza, "6 de noviembre de 2014, 7:00 PM", 
									"Teatro Maldonado", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("112","FUNCI�N ESTELAR DE DANZAS: GRUPO PIES ANDINOS DE PAIPA", 
									R.drawable.danza, "6 de noviembre de 2014, 7:00 PM", 
									"Teatro Maldonado", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("113","TEATRO CUENTAN LOS QUE CUENTAN: CRISTIAN RUEDA CHAPARRO", 
									R.drawable.teatro, "6 de noviembre de 2014, 7:00 PM", 
									"Auditorio Eduardo Caballero Calder�n, Sec de Cultura y Turismo de Boyac� Tunja", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("114","CINEMATOGRAF�A ESTRELLA QUIERO SER", 
									R.drawable.cine, "6 de noviembre de 2014, 7:00 PM", 
									"Teatro Su�rez", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("115","PANEL DE DIRECTORES: EL HACER CINE EN COLOMBIA", 
									R.drawable.literatura, "7 de noviembre de 2014, 10:00 AM", 
									"Auditorio Eduardo Caballero Calder�n, Sec de Cultura y Turismo de Boyac� Tunja", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("116","PRESENTACI�N Y ENTREGA DE OBRAS ACADEMIA BOYACENSE DE HISTORIA", 
									R.drawable.literatura, "7 de noviembre de 2014, 10:00 AM", 
									"Sal�n de la Constituci�n, Gobernacion de Boyac�", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("117","GRUPO DE TEATRO ANDR�GORA, Obra: El jard�n de la discordia", 
									R.drawable.teatro, "7 de noviembre de 2014, 10:00 AM", 
									"Teatro Cultural", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("118","GRUPO DE DANZAS ROSADELA DE VENEZUELA", 
									R.drawable.danza, "7 de noviembre de 2014, 10:00 AM", 
									"Casa Cultural Enrique Medina Fl�rez. Calle 19 No. 12-54", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("119","CONFERENCIA: OPORTUNIDADES DE ESTUDIOS, INVESTIGACI�N Y BECAS EN ALEMANIA", 
									R.drawable.literatura, "7 de noviembre de 2014, 11:00 AM", 
									"Auditorio Sena", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("120","CINEMATOGRAF�A TIERRA EN LA LENGUA", 
									R.drawable.cine, "7 de noviembre de 2014, 3:00 PM", 
									"Teatro Su�rez", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("121","CONVERSATORIO: VIDA Y OBRA CON EL MAESTRO PEPE S�NCHEZ", 
									R.drawable.literatura, "7 de noviembre de 2014, 3:00 PM", 
									"Auditorio Eduardo Caballero Calder�n, Sec de Cultura y Turismo de Boyac� Tunja", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("122","Pol�tica Exterior de la Rep�blica Federal de Alemania en el a�o 2014", 
									R.drawable.literatura, "7 de noviembre de 2014, 3:00 PM", 
									"Sal�n de la Constituci�n, Gobernacion de Boyac�", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("123","M�SICA: TALENTO INFANTIL EN ESCENA", 
									R.drawable.musica, "7 de noviembre de 2014, 3:00 PM", 
									"Plaza de Bol�var", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("124","TEATRO POEMA, CANTO Y RETAH�LA", 
									R.drawable.teatro, "7 de noviembre de 2014, 3:00 PM", 
									"Auditorio Jos� Mosser", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("125","DHARMA TEATRO, Obra: Circo Ambiente", 
									R.drawable.teatro, "7 de noviembre de 2014, 6:00 PM", 
									"Auditorio Jos� Mosser", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("126","FUNCI�N ESTELAR DE DANZAS LOS HIDALGOS DE VERONA", 
									R.drawable.danza, "7 de noviembre de 2014, 7:00 PM", 
									"Teatro Cultural", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("127","DANZAS ROSADELA � VENEZUELA", 
									R.drawable.danza, "7 de noviembre de 2014, 7:00 PM", 
									"Teatro Maldonado", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("128","OTRORA INTEGRACI�N FOLCL�RICA COLOMBIANA", 
									R.drawable.danza, "7 de noviembre de 2014, 7:00 PM", 
									"Teatro Maldonado", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("129","DANZAS ADULTO MAYOR DE DUITAMA", 
									R.drawable.danza, "7 de noviembre de 2014, 7:00 PM", 
									"Teatro Maldonado", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("130","TEATRO CUENTAN LOS QUE CUENTAN:JAVIER ANDR�S GONZ�LEZ MORENO", 
									R.drawable.teatro, "7 de noviembre de 2014, 7:00 PM", 
									"Auditorio Eduardo Caballero Calder�n, Sec de Cultura y Turismo de Boyac� Tunja", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("131","GRAN CONCIERTO CON Los Tri-O", 
									R.drawable.trio_opt, "7 de noviembre de 2014, 7:00 PM", 
									"Coliseo Cubierto", "Por Definir"));

								aniadirEntrada(new Lista_entrada("132","GRUPO DE TEATRO LA MUEKA Obra: L�dica para el Equilibrio", 
									R.drawable.teatro, "8 de noviembre de 2014, 10:00 AM", 
									"Teatro Cultural", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("133","CINEMATOGRAF�A FORO TALLER MANEJO DE C�MARAS", 
									R.drawable.cine, "8 de noviembre de 2014, 10:00 AM", 
									"Teatro Cultural", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("134","GRAN ESPECT�CULO DE LA CULTURA CIRCENSE EL SHOW LE PETIT CIRQUE", 
									R.drawable.teatro, "8 de noviembre de 2014, 10:00 AM", 
									"Teatro Cultural", "$11.000 General"));

								aniadirEntrada(new Lista_entrada("135","GRAN ESPECT�CULO DE LA CULTURA CIRCENSE EL SHOW LE PETIT CIRQUE", 
									R.drawable.teatro, "8 de noviembre de 2014, 3:00 PM", 
									"Coliseo Cubierto", "$11.000 General"));

								aniadirEntrada(new Lista_entrada("136","TARDE DE ORQUESTAS Y G�NEROS POPULARES", 
									R.drawable.musica, "8 de noviembre de 2014, 3:00 PM", 
									"Plaza de Bol�var", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("137","TEATRO ITINERANTE DEL SOL Obra: Voces de la Tierra", 
									R.drawable.teatro, "8 de noviembre de 2014, 7:00 PM", 
									"Teatro Cultural", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("138","FUNCI�N ESTELAR DE DANZAS: FUNDACI�N ART�STICA DEL TUNDAMA", 
									R.drawable.danza, "8 de noviembre de 2014, 7:00 PM", 
									"Teatro Maldonado", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("139","FUNCI�N ESTELAR DE DANZAS: FUNDACI�N NUBAL� DE COLOMBIA", 
									R.drawable.danza, "8 de noviembre de 2014, 7:00 PM", 
									"Teatro Maldonado", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("140","FUNCI�N ESTELAR DE DANZAS: GRUPO SUADANCE", 
									R.drawable.danza, "8 de noviembre de 2014, 7:00 PM", 
									"Teatro Maldonado", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("141","TEATRO CUENTAN LOS QUE CUENTAN: JORGE ANDR�S TORRES � EL DIABLO", 
									R.drawable.teatro, "8 de noviembre de 2014, 7:00 PM", 
									"Auditorio Eduardo Caballero Calder�n, Sec de Cultura y Turismo de Boyac� Tunja", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("142","EXPOSICION: PUEBLOS � Fotograf�a", 
									R.drawable.artes, "Evento Permanente", 
									"Sala Rafael Tavera � Secretar�a de Cultura y Turismo de Boyac�", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("143","EXPOSICION: MONASTERIOS E �CONOS DE LA RUSIA ANTIGUA � Fotograf�a", 
									R.drawable.artes, "Evento Permanente", 
									"Sala Julio Abril � Secretar�a de Cultura y Turismo de Boyac�", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("144","EXPOSICION: ARTISTAS PLASTICOS Y VISUALES DE BOYAC� FIC 2014", 
									R.drawable.artes, "Evento Permanente", 
									"Sala Francisco Cristancho - Secretar�a de Cultura y Turismo de Boyac�", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("145","EXPOSICION: ANTES Y DESPU�S DEL TSUNAMI � Fotograf�a", 
									R.drawable.artes, "Evento Permanente", 
									"Secretar�a de Cultura y Turismo de Boyac� � Planta 1 y 2", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("146","EXPOSICION: DICTADURA Y DEMOCRACIA EN LA ERA DE LOS EXTREMOS", 
									R.drawable.artes, "Evento Permanente", 
									"Casa del Fundador - Primera Planta", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("147","EXPOSICION: ARTE ABSTRACTO � Pintura", 
									R.drawable.artes, "Evento Permanente", 
									"Casa del Fundador - Segunda Planta", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("148","EXPOSICION: CHINA HERMOSA � Fotograf�a", 
									R.drawable.artes, "Evento Permanente", 
									"Sala de Exposici�n - Casa Juan de Vargas", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("149","EXPOSICION: REP�BLICA DE LA PALABRA � Fotograf�a e Ilustraci�n", 
									R.drawable.artes, "Evento Permanente", 
									"Palacio de la Torre Gobernaci�n de Boyac� � Segunda Planta", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("150","EXPOSICION: RETROSPECTIVA � Pintura, Dibujo y Escultura", 
									R.drawable.artes, "Evento Permanente", 
									": Casa Museo Gustavo Rojas Pinilla � Sala 2", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("151","EXPOSICION: NATURA PROSPERA � Proyecto Art�stico - Joyer�a", 
									R.drawable.artes, "Evento Permanente", 
									"Casa Museo Gustavo Rojas Pinilla � Sala 1", "Entrada Libre"));

								aniadirEntrada(new Lista_entrada("152","EXPOSICION: FOTOGRAF�A ARTE � INDUSTRIA", 
									R.drawable.artes, "Evento Permanente", 
									"UNICENTRO", "Entrada Libre"));
								
						
								aniadirEntrada(new Lista_entrada("154","DHARMA TEATRO OBRA: Circo Ambiente", 
										R.drawable.teatro, "1 de noviembre, 2:00 PM, AQUITANIA", 
										"Parque Principal - AQUITANIA", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("155","PEL�CULA COSTA RICA: El Regreso", 
										R.drawable.cine, "2 de noviembre, 7:00 PM", 
										"Parque Rock - PAIPA", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("156","PEL�CULA COSTA RICA: Gestaci�n", 
										R.drawable.cine, "2 de noviembre, 7:00 PM", 
										"Parque Rock - PAIPA", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("157","DHARMA TEATRO, OBRA: Circo Ambiente", 
										R.drawable.teatro, "2 de noviembre, 11:00 AM, SAMACA", 
										"Parque Principal - SAMACA", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("158","PEL�CULA ARGENTINA � La Mala Verdad", 
										R.drawable.cine, "3 de noviembre, 6:00 PM", 
										"Plazoleta Tundama � Pueblito Boyacense - DUITAMA", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("159","PEL�CULA ARGENTINA � Industria Argentina", 
										R.drawable.cine, "3 de noviembre, 8:00 PM", 
										"Parque El Carmen - DUITAMA", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("160","DHARMA TEATRO OBRA: Circo Ambiente", 
										R.drawable.teatro, "3 de noviembre, 11:00 AM, PAZ DEL RIO", 
										"Parque Principal - PAZ DEL RIO", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("161","DHARMA TEATRO OBRA: Circo Ambiente", 
										R.drawable.teatro, "4 de noviembre, 2:00 PM, SOCHA", 
										"Parque Principal - SOCHA", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("162","PEL�CULA CUBANA � HABANASTATION", 
										R.drawable.cine, "5 de noviembre, 6:00 PM", 
										"Parque Jaime Rook - PAIPA", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("163","PEL�CULA CUBANA � HELLO HEMINWAY", 
										R.drawable.cine, "5 de noviembre, 8:00 PM", 
										"Parque Jaime Rook - PAIPA", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("164","DHARMA TEATRO OBRA: Circo Ambiente", 
										R.drawable.teatro, "5 de noviembre, 2:00 PM, SAN JOS� DE PARE", 
										"Parque Principal - SAN JOS� DE PARE", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("165","CORTOMETRAJE � EL MURMULLO DE LA TIERRA", 
										R.drawable.cine, "6 de noviembre, 7:00 PM", 
										"Plaza 6 de Septiembre - SOGAMOSO", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("166","DHARMA TEATRO OBRA: Circo Ambiente", 
										R.drawable.teatro, "6 de noviembre, 11:00 AM, TOGUI", 
										"Parque Principal - TOGUI", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("167","DHARMA TEATRO OBRA: Circo Ambiente", 
										R.drawable.teatro, "6 de noviembre, 11:00 AM, TUTA", 
										"Parque Principal - TUTA", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("168","CITY MONKEY. PEL�CULA CHINA", 
										R.drawable.cine, "8 de noviembre, 11:00 AM", 
										"Teatro Sogamoso - SOGAMOSO", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("169","PEL�CULA VENEZOLANA � BOLIVAR EL HOMBRE DE LAS DIFICULTADES", 
										R.drawable.cine, "8 de noviembre, 1:00 PM", 
										"Teatro Sogamoso - SOGAMOSO", "Entrada Libre"));

									aniadirEntrada(new Lista_entrada("170","DHARMA TEATRO OBRA: Circo Ambiente", 
										R.drawable.teatro, "8 de noviembre, 11:00 AM, NOBSA", 
										"Parque Principal - NOBSA", "Entrada Libre"));		
			
	}

	
	/** A�ade una entrada a la lista
	 * @param entrada Elemento que a�adimos a la lista
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
