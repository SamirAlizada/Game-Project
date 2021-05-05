import java.time.LocalDate;

import Abstract.Verification;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.SaleManager;
import Concrete.UserManager;
import Concrete.VerificationManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Sale;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		
		User user = new User(1, "Samir Alizada", "123456789", "2003");
		UserManager userManager = new UserManager(new VerificationManager());
		userManager.register(user);
		userManager.updateData(user);
		userManager.deleteData(user);
		
		System.out.println("======================================");
		
		Campaign campaign = new Campaign(1, "Winter season discounts", LocalDate.now(), 30);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addData(campaign);
		campaignManager.updateData(campaign);
		campaignManager.deleteData(campaign);
		
		System.out.println("======================================");
		
		Game game1 = new Game(1, "FIFA 21", 100, 1000);
		Game game2 = new Game(2, "PES 21", 90, 2000);
		Game[] games = {game1,game2};
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.update(game1);
		gameManager.getAll(games);
		gameManager.delete(game2);
		
		System.out.println("======================================");
		
		Sale sale = new Sale(1, "Card", LocalDate.now());
		SaleManager saleManager = new SaleManager();
		saleManager.sale(user, game1, campaign, sale);

	}

}
