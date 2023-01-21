package ejercicio2;

import java.util.ArrayList;

public class DeckCards {//Este codigo genera la baraja francesa, luego la "baraja" y muestra las 
						//cinco primeras cartas

	public static void main(String[] args) {

		//Estos String definen los palos y los valores que pueden tomar las cartas
		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		ArrayList<Card> deck = new ArrayList<Card>();//Se crea el objeto baraja

		for (int i = 0; i < suits.length; i++) {//Este bucle añade las cartas a la baraja de manera ordenada
			for (int j = 0; j < values.length; j++) {
				Card card = new Card(suits[i], values[j]);//Aqui se crea el objeto carta
				deck.add(card);//Aqui se añade a la baraja
			}
		}

		for (int i = 0; i < deck.size(); i++) {//Este bucle baraja las cartas
			int j = (int) Math.floor(Math.random() * i);//Aqui se genera un numero aleatorio y se almacena en la variable j
			Card tmp = deck.get(i);//Aqui se cogen uno a uno los numeros ordenados de la baraja y se van almacenando en card tmp
			deck.set(i, deck.get(j));//Se sustituye la carta que toca por orden por la que esta en la posicion del numero generado aleatoriamente
			deck.set(j, tmp);//Se sustituye el "hueco" de la carta de posicion aleatoria por la que tocaba
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));//Se muestran las cinco primeras cartas de la baraja ya barajada
		}

	}

}
