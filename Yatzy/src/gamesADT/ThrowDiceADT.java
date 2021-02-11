package gamesADT;

import java.util.ArrayList;

import komponenter.Dice;

public interface ThrowDiceADT {

	int throwDice(Dice dice);
	
	ArrayList<Dice> throwDices(int n, Dice dice);

}
