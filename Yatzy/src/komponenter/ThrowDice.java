package komponenter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import gamesADT.ThrowDiceADT;

public class ThrowDice implements ThrowDiceADT {

	private List<Dice> dices = new ArrayList<Dice>();
	private int nrDices;
	
	public ThrowDice() {
	}
	
	@Override
	public int throwDice(Dice dice) {
		int value = ThreadLocalRandom.current().nextInt(1, 6+1);
		dice.setEye(value);
		dices.add(dice);
		return value;
	}

	@Override
	public ArrayList<Dice> throwDices(int n, Dice dice) {
		int i = 0;
		while (i < n) {
			int value = ThreadLocalRandom.current().nextInt(1, 6+1);
			dice.setEye(value);
			dices.add(i,dice);
			i++;
		}
		return (ArrayList<Dice>) dices;
	}
	
	
}
