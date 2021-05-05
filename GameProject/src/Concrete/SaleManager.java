package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Sale;
import Entities.User;

public class SaleManager implements SaleService {

	@Override
	public void sale(User user, Game game, Campaign campaign, Sale sale) {
		double priceWithDiscount = campaign.getDiscount() * (game.getPrice() / 100);
		System.out.println("User information   : " + user.getFullName());
		System.out.println("Purchased product   : " + game.getGameName());
		System.out.println("Benefiting campaign   : " + campaign.getCampaignName());
		System.out.println("Payment method   : " + sale.getSaleType());
		System.out.println("Purchase date   : " + sale.getSaleDate());
		System.out.println("Product price   : " + game.getPrice() + " $");
		System.out.println("Discount rate   : %" + campaign.getDiscount());
		System.out.println("Discounted product price   : " + priceWithDiscount+" $");
	}

}
