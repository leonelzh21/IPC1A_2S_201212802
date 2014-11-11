import java.util.Scanner;
import java.util.Random;
public class LoveLetter {
	public static boolean ganador;
	static String jugador1;
	static String jugador2;
	public static void main (String[]args){
		
		Menu();
	}
	public static void Menu (){
		Scanner entrada = new Scanner(System.in);
		int opcion;
		
		System.out.println("-=BIENVENIDO A LOVE LETTER-=");
		System.out.println("1. Jugar Partida");
		System.out.println("2. Seleccionar el Numero de Tokens a Jugar");
		System.out.println("3. Reglas del Juego");
		System.out.println("4. Salir");
		
		opcion = entrada.nextInt();
		Scanner j1 = new Scanner(System.in);
		Scanner j2 = new Scanner(System.in);
		switch(opcion){
			
		case 1:
			System.out.println("Ingrese el Nombre del jugador 1");
			jugador1 = j1.nextLine();
			System.out.println("Ingrese el Nombre del jugador 2");
			jugador2 = j2.nextLine();
			jugarPartida();
			break;
		case 2:
			tokens ();
			break;
		case 3:
			reglas();
			break;
		case 4:
			break;
		default:
			break;
		}
		
	}
	
	public static void jugarPartida () {
		
		if(Turno()==false ){
			menuRonda();
		}else
			jugador2();
	
		
		
					
			
	
	}
	

	
	
	public static int barajar (){
		Random aleatorio = new Random();
		int cartas[] = new int []{1,1,1,1,1,2,2,3,3,4,4,5,5,6,7,8};
		int cartas1 = cartas.length;
			
				
				int c = aleatorio.nextInt(cartas1-1);
				int caleatorio = cartas[c];
				return caleatorio;
				
				
					
	}
	
	public static int j1carta1(){// aqui se guarda la carta 1 del jugador 1
		int carta1 = barajar();
		return carta1;
	}
	
	public static int j1carta2(){//aqui se guarta la carta 2 del jugador 1
		int carta2 = barajar();
		return carta2;
	}
	
	public static void reconocerCarta (int b){
		
		if(b == 1  ){
			guard();
		}else if(b==2){
			priest();
		}else if(b==3){
			baron();
		}else if(b==4){
			handmaid();
		}else if(b==5){
			prince();
		}else if(b==6){
			king();
		}else if(b==7){
			countess();
		}else if(b==8){
			princess();
		}	
	}
	
	public static void nombreCarta1(){
		int carta1 = j1carta1();
			if(carta1 == 1){
				System.out.println("Guard");
			}else if(carta1 == 2){
				System.out.println("priest");
			}else if(carta1 == 3 ){
				System.out.println("Baron");
			}else if(carta1 == 4 ){
				System.out.println("Handmaid");
			}else if(carta1 == 5){
				System.out.println("Prince");
			}else if(carta1 == 6){
				System.out.println("King");
			}else if(carta1 == 7 ){
				System.out.println("Countess");
			}else 
				System.out.println("Princess");
		
	}
	
	public static void nombreCarta2(){
		int carta2 = j1carta2();
		if(carta2 == 1){
			System.out.println("Guard");
		}else if(carta2 == 2){
			System.out.println("priest");
		}else if(carta2 == 3 ){
			System.out.println("Baron");
		}else if(carta2 == 4 ){
			System.out.println("Handmaid");
		}else if(carta2 == 5){
			System.out.println("Prince");
		}else if(carta2 == 6){
			System.out.println("King");
		}else if(carta2 == 7 ){
			System.out.println("Countess");
		}else 
			System.out.println("Princess");
	}
	
	public static boolean Turno(){
		boolean turno=false;
		return turno;
	}
	//public static void cambiarTurno(){
		//if(Turno(false)==false){
			//menuRonda();
		//}else
			//System.out.println("Ahora es el turno del jugador2");
			//jugador2();
	//}
	
	public static void menuRonda( ){
		Scanner opcartas = new Scanner(System.in);
		int opc;
		System.out.println("Jugador1: "+jugador1 + sumaTokens() +  "                   Jugador2:  "+        jugador2   + sumaTokens());
		System.out.println("Tienes en tu mano");
		
		nombreCarta1();
		nombreCarta2();
		
		System.out.println("(1) usar carta #1");
		System.out.println("(2) usar carta #2");
		System.out.println("(3) terminar juego");
		opc = opcartas.nextInt();
		
		switch(opc){
			case 1:
				
				reconocerCarta(j1carta1());
				break;
			case 2:
				reconocerCarta(j1carta2());
				break;
			case 3:
				break;
				
		}
		
		
	}
	

	

	
	public static void tokens(){
		Scanner t = new Scanner(System.in);
		
		int opt;
		System.out.println("Elija a Cuantos Tokens Desea Jugar");
		
		System.out.println("1 Tokens");
		System.out.println("3 Tokens");
		opt = t.nextInt(); 
	
		switch(opt){
		
			case 1:
				break;
			case 2:
				sumaTokens();
				break;
			default:
				break;
		}
	
	
	}
	
	public static int sumaTokens(){
		int cont=0;
		
		for(int i = 0; i<=3;i++ ){
			cont++;
		
		}return cont;
		
	}
	
	public static void reglas(){
		System.out.println("REGLAS DE LOVE LETTER\n");
		System.out.println("COMPONENTES\n\n"+"° 16 Cartas de juego\n "+"°4 ayudas de juego\n"+"° fichas de afecto\n\n" );
		System.out.println("CARTAS DEL JUEGO\n\n"+"El juego tiene 16 cartas.Cada carta\ndiferente representa a alguien de la residencia real\n\n");
		System.out.println("Cada carta tiene un valor en la esquina\nsuperio izquierda - cuanto mal alto es\nel numero, mas cercana es la persona\na la princesa. En la parte inferior de cada\ncarta un texto describe su efecto cuando es descartada\n\n");
		System.out.println("AYUDAS DE JUEGO\n\n"+"El juego icluye también fichas rojas usadas para llevar la cuenta del creciente afecto de\nla princesa por aquellos pretendientes que\nconsiguen entregar sus cartas.\n\n");
		System.out.println("PREPARACION DE LA PARTIDA\n\n"+"Baraja los 16 cartas colocalas cara abajo y\nforma un mazo de robo. Elimina la primera\ncarta del mazo del juego sin mriarla.\n\n");
		System.out.println("Si estas jugando una partida de dos\njugadores, elimina tres cartas mas del mazo\ny dejalas aparte cara arriba. Estas cartas\nno se usaran en esata ronda.\n\n");
		System.out.println("Cada jugador roba una carta del mazo.\nEsta carta es la mano inicial y debe\nmantenerse en secreto\n\n");
		System.out.println("El jugadro que haya tenido la cita mas\nreciente empieza (en caso de empete el mas\njoven de ellos comienza)\n\n");
		System.out.println("COMO JUGAR\n\n"+"Love Letter se juega en diferentes rondas.\nCada ronda representa un dia. Al final de\ncada ronda, la carta de un jugador llega a\na la Princesa Annete, quier la leera.\n\n");
		System.out.println("Cuando haya leido las suficientes cartas\nde uno de los pretendientes, caera\nperdidamente enamorada, concediendo a\nese pretendiente el premiso para cortejarla.\nEse jugador ganara el corazon de la\nprincesa y la partida.\n\n");
		System.out.println("DESARROLLO DEL JUEGO\n\n"+"Durante tu turno, roba la carta superior\ndel mazo y añadela a tu mano. Entonces\nelige una de la dos cartas y decartla\ncara arriba delaten tuya. Deberas aplicar el\nafecto de la carta descartada, incluso si es\npejudicial para ti.\n\n");
		System.out.println("Las cartas descartadas permanecen delante\ndel juagador que las descarta. Colocalas\nsuperpuestas de manera visible para que\nquede claro el orden en que la sido\ndescartadas. Esto ayudara a los jugadores\na averiguar que cartas pueden tener en la\nmano los demas\n\n");
		System.out.println("Una vez es aplicado el efecto de la carta el\nturno pasa al jugador a tu izquierda\n\n");
		System.out.println("ELIMINADO DE LA RONDA\n\n"+"Si un jugador es eliminda de la ronda,\nese jugador descarta la carta en su mano\nboca arriba,(sin aplicar su efecto) u deja de\njugar hasta la siguiente ronda\n\n");
		System.out.println("HORADEZ\n\n"+"un jugadro podria mentir al ser elegido\npor el efecto de la Guardia, o no descartar\na la Condesa teniendo al rey o el principe\nen la mano.Sugerimos por tanto que\nno juegues con rufianes que se diviertan\nhaciendo trampa.\n\n");
		System.out.println("FINAL DE LA RONDA\n\n"+"Una ronda termina cuando el mazo de\ntobo es agotado al final de un turno,\nla residencia rela cierra al atardecer,la\npersona mas cercana a la princesa entrega\nla carta de amor, y la princesa Annete se\nretira a sus aposentos para leerla\n\n");
		System.out.println("Auqellos jugadores que permacezcan en la\nronda revelan sus manos. El jugador con la\ncarta con el valor mars alto gana la ronda.\nEn caso de empate el jugador que descarto cartas por mayor valor gana\n\n");
		System.out.println("La ronda temina también si todos los\njugadores menos uno son eliminado de la\nronda, en ese caso, el jugador que siga en\njuego gana.\n\n");
		System.out.println("El ganador recibe una ficha de afecto.\nBaraja las 16 cartas y comienza una nueva rona\nsiguiendo las normas de prepacacion.\n\n");
		System.out.println("El ganador de la utimal ronda comienza\npues la princesa habalar muy bien de el\ndurate el desayuno.\n\n");
		System.out.println("GANANDO EL JUEGO\n\n"+"Un jugador es declarado ganador tras\nconseguir un numero deteminado de fichas\nde efecto, segun el numero de jugadores.\n\n");
		System.out.println("° 2 jugadores		7 fichas\n"+"° 3 jugadores		5 fichas\n"+"° 4 jugadores		4 fichas\n");
		
		
		}
	
	public static void guard(){
		
		int optguard;
		Scanner c = new Scanner(System.in);
		
		System.out.println("seleccion la carta que tiene su rival");
		
		System.out.println("(2)Priest	(3)Baron	(4)Handmaid 	(5)Prince	 (6)King	 (7)Countess	 (8)Princess  ");
		optguard = c.nextInt();
		int carta1J2 = c1J2();
		int carta2J2 = c2J2();
		boolean t= Turno();;
		if(optguard == 2 ){
			if(carta1J2 == 2){
				System.out.println("\0/ GANASTE \0/");
				
			}else if (carta2J2 == 2){
				System.out.println("\0/ GANASTE \0/ ");
				
			}else 
				System.out.println("no adivinaste la carta");
			t = true;
			jugarPartida ();	
				
		}else if(optguard== 3 ){
			if(carta1J2 == 3 ){
				System.out.println("\0/ GANASTE \0/");
				
			}else if(carta2J2==3){
				System.out.println("\0/ GANASTE \0/");
				
			}else
				System.out.println("no adivinaste la carta");
			t = true;
			jugarPartida ();			
			
		}else if(optguard == 4){
			if(carta1J2 ==4 ){
				System.out.println("\0/ GANASTE \0/");
				
			}else if(carta2J2== 4 ){
				System.out.println("\0/ GANASTE \0/");
				
			}else 
				System.out.println("no adivinaste la carta");
				t = true;
				jugarPartida ();
			}else if(optguard == 5){
			if(carta1J2 == 5){
				System.out.println("\0/ GANASTE \0/");
				
			}else if (carta2J2 == 5){
				System.out.println("\0/ GANASTE \0/");
				
			}else 
				System.out.println("no adivinaste la carta");
				t = true;
				jugarPartida ();
			}else if(optguard == 6){
				if(carta1J2 == 6){
				System.out.println("\0/ GANASTE \0/");
				
			}else if(carta2J2 == 6){
				System.out.println("\0/ GANASTE \0/");
				
			}else 
				System.out.println("no adivinaste la carta");
				t = true;
				jugarPartida ();
		}else if(optguard == 7){
			if(carta1J2 == 7){
				System.out.println("\0/ GANASTE \0/");
				
			}else if (carta2J2 == 7){
				
			}else 
				System.out.println("no adivinaste la carta");
			t = true;
			jugarPartida ();
		}else if (optguard == 8){
			if(carta1J2 == 8){
				System.out.println("\0/ GANASTE \0/");
			
			}else if(carta2J2 == 8);
				System.out.println("\0/ GANASTE \0/");
				
		}else 
			System.out.println("no adivinaste la carta");
		t = true;
		jugarPartida ();
	}
	//metodo de la carta priest 
	public static void priest(){
		int j2carta1 = c1J2();
		int j2carta2 = c2J2();
		
		if(j2carta1 == 1){
			System.out.println("Guard");
		}else if(j2carta2 == 1){
			System.out.println("Guard");
		}else if(j2carta1 == 2){
			System.out.println("priest");
		} else if(j2carta2 == 2){
			System.out.println("priest");
		}else if(j2carta1 == 3){
			System.out.println("Baron");
		}else if(j2carta2 == 3){
			System.out.println("Baron");
		}else if(j2carta1 == 4){
			System.out.println("Handmaid");
		}else if(j2carta2 == 4){
			System.out.println("Handmaid");
		}else if(j2carta1 == 5){
			System.out.println("prince");
		}else if(j2carta2 == 5){
			System.out.println("prince");
		}else if(j2carta1 == 6){
			System.out.println("King");
		}else if(j2carta2 == 6){
			System.out.println("King");
		}else if(j2carta1 == 7){
			System.out.println("Countess");
		}else if(j2carta2 == 7){
			System.out.println("Countess");
		}else if(j2carta1 == 8){
			System.out.println("Princess");
		}else 
			System.out.println("Princess");
	
		jugarPartida ();
	}
	
	public static void baron(){
		int j1carta1 = j1carta1();
		int j1carta2 = j1carta2();
		int j2carta1 = c1J2();
		int j2carta2 = c2J2();
		
		if(j1carta1 > j2carta1 && j1carta2 > j2carta2){
			
			System.out.println("\0/ GANASTE \0/");
		}else if(j1carta1 > j2carta2 && j1carta2 > j2carta1){
			System.out.println("\0/ GANASTE \0/");
		}else if(j2carta1 >j1carta1 && j2carta2 > j1carta2 ){
			System.out.println("Perdiste");
			
		}else 
			System.out.println("Perdiste");
		
	}
	public static void handmaid(){
		int chandmaid = 4;
		System.out.println("seleccion la carta que tiene su rival");
	}
	public static void prince(){
		Scanner s = new Scanner(System.in);
		System.out.println("Seleccione la mano que desea botar");
		System.out.println("1) botar mi mano");
		System.out.println("2) botar mano del rival");
		int op = s.nextInt();
		int j1carta1 = j1carta1();
		int j1carta2 = j1carta2();
		int j2carta1 = c1J2();
		int j2carta2 = c2J2();
		
		switch(op){
			case 1:
				j1carta1 = 0;
				j1carta2 = 0;
				
				break;
			case 2:
				j2carta1 = 0;
				j2carta2 = 0;
				c1J2();
				c2J2();
				break;
		}
	}
	public static void king(){
		int j1carta1 = j1carta1();
		int j1carta2 = j1carta2();
		int j2carta1 = c1J2();
		int j2carta2 = c2J2();
		
		j1carta1 = j2carta1 ;
		j1carta2 = j2carta2;
	}
	public static void countess(){
		
	}
	public static void princess(){
		System.out.println("PERDISTE");
		Menu();
	}
	public static void jugador2( ){ // empieza metodo del oponente
		 int c1 = c1J2();		 
		 int c2 = c2J2();
		 
		 while (c1 == 8 || c2 == 8){
			 if(c2 == 1 || c1 == 1 ){
					guard2();
				}else if(c2==2 || c1 == 2){
					priest();
				}else if(c2==3 || c1 == 3){
					baron();
				}else if(c2==4 || c1 == 4){
					handmaid();
				}else if(c2==5 || c1 == 5){
					prince();
				}else if(c2==6 || c1 == 6){
					king();
				}else if(c2==7 || c1 == 7){
					countess();
				}
				}
			 if(c1 ==7 && c2 ==6) {
				 king();
				 
			 }else if(c1==7&& c2 ==5){
				 prince();
			 }else if(c2==7 && c1==6){
				 king();
			 }else if(c2==7 && c1==5){
				 prince();
			 }else if(c1 == 6 && c2==5){
				 prince();
			 }else if(c1 == 6 && c2 < 8 ){
				 king();
			 }else if (c1 == 6 && c2 !=5 && c2 !=7 && c2!=8){
				 reconocerCarta(c2);
			 }else if(c2 == 6 && c1==5){
				 prince();
			 }else if(c2 == 6 && c1 < 8 ){
				 king();
			 }else if (c2 == 6 && c1 !=5 && c1 !=7 && c1!=8){
				 reconocerCarta(c1);
			 }else if(c1==5 && c2==4){
				 handmaid();
			 }else if(c1==5 && c2 ==1){
				 guard2();
			 }else if(c1 ==5 &&(c2 ==3 || c2==2||c2==1)){
				 prince();
			 }else if(c2==5 && c1==4){
				 handmaid();
			 }else if(c2==5 && c1 ==1){
				 guard2();
			 }else if(c2 ==5 &&(c1 ==3 || c1==2||c1==1)){
				 prince();
			 }else if(c1==4 && c2 == 4){
				 handmaid();
			 }else if(c1 ==4 && c2 < 4){
				 reconocerCarta(c2);
			 }else if(c2==4 && c1 == 4){
				 handmaid();
			 }else if(c2 ==4 && c1 < 4){
				 reconocerCarta(c1);
			 }else if(c1==3 && c2==3 ){
				 baron();
			 }else if(c1==3 && c2 <3){
				 reconocerCarta(c2);
			 }else if(c2==3 && c1==3 ){
				 baron();
			 }else if(c2==3 && c1 <3){
				 reconocerCarta(c1);
			 }else if(c1==2 && c2==2){
				 priest();
			 }else if(c1 ==2 && c2 < 2){
				 reconocerCarta(c2);
			 }else if(c2 ==2 && c1 < 2){
				 reconocerCarta(c1);
			 }else if(c1 ==1 && c2==1){
				 guard2();
			 }				
				 
			
			 
		 	
		 }// termina metodo del oponente
	public static int c1J2(  ){//aqui se guarda la primera carta del jugador 2
		int carta1 = barajar();
		return carta1;
		
		
	}
	public static int c2J2(  ){//aqui se guarda la segunda carta del jugador 2
		int carta2 = barajar();
		return carta2;
		
		
	}
	
	public static void guard2(){
		Random aleatorio = new Random();
		Random aleatorio2 = new Random();
		int op =aleatorio.nextInt(8);
		int op2=aleatorio2.nextInt(8);;
		int j1 = j1carta1();
		int j2 = j1carta2();
		
		if(op == j1 && op2 == j2){
			System.out.println("PERDISTE");
		}else 
			
		jugarPartida ();
				
	}

	
	}
		
		
	
	
	

