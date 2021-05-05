package Concrete;

import Abstract.CompaignService;
import Entities.Campaign;;

public class CampaignManager implements CompaignService{

	@Override
	public void addData(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " The campaign named was added to the system. \n" + "Campaign start date : " + campaign.getCampaignDate() + "\n" + "Campaign discount rate : %" + campaign.getDiscount() +"\n");
		
	}

	@Override
	public void updateData(Campaign campaign) {
		System.out.println("Campaign information updated : " + campaign.getCampaignName());
		
	}

	@Override
	public void deleteData(Campaign campaign) {
		System.out.println("Campaign registered in the system has been deleted : " + campaign.getCampaignName() + " " + campaign.getCampaignDate() + " " + campaign.getDiscount());
		
	}

}
