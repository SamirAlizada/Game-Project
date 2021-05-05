package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " the game named was added to the system. No discount price of the game " + game.getPrice() + " It was determined as Dollar. Number of the game in stock : " + game.getStockAmount());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Games on the system have been deleted.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println("The games have been updated.");
		
	}

	@Override
	public void getAll(Game[] games) {
		for(Game game : games) {
			System.out.println("Games on the system : " + game.getGameName());
		}
		
	}

}
