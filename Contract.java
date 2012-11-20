public class Contract{

	private DeliveryOffice[] offices = new DeliveryOffice[4];
	private Client client;

	public void setContract(DeliveryOffice sendIt, DeliveryOffice fastDelivery, DeliveryOffice cheapSending,DeliveryOffice easySend,Client client){
		this.offices[0] = sendIt;
		this.offices[1] = fastDelivery;
		this.offices[2] = cheapSending;
		this.offices[3] = easySend;
		this.client = client;
	}

	public void findBestOptionDistance(){
		double[] distance = new double[4];
		distance[0] = this.offices[0].calculateDistance(client);
		distance[1] = this.offices[1].calculateDistance(client);
		distance[2] = this.offices[2].calculateDistance(client);
		distance[3] = this.offices[3].calculateDistance(client);
		double farest = distance[0];
		int farestInd = 0;
		for(int i = 1;i < 4;i++){
			if(farest < distance[i]){
				farest = distance[i];
				farestInd = i;
			}
		}
		this.offices[farestInd] = null;
		System.out.println("--Distances--");
		System.out.println("Send it: "+distance[0]);
		System.out.println("Fast Delivery: "+distance[1]);
		System.out.println("Cheap Sending: "+distance[2]);
		System.out.println("Easy Send: "+distance[3]);
		System.out.println("--Farest Dissapeared! :O--");
		System.out.println("Send it: "+this.offices[0]);
		System.out.println("Fast Delivery: "+this.offices[1]);
		System.out.println("Cheap Sending: "+this.offices[2]);
		System.out.println("Easy Send: "+this.offices[3]);
	}

	public void findBestOptionTime(int distanceKm){
		int[] days = new int[4];
		for(int i = 0;i < 4;i++){
			if(this.offices[i] != null){
				days[i] = this.offices[i].getDaysForDelivery(distanceKm);
			}
		}
		int moreDays = days[0];
		int moreInd = 0;
		for(int i = 1;i < 4;i++){
			if(moreDays < days[i]){
				moreDays = days[i];
				moreInd = i;
			}
		}
		this.offices[moreInd] = null;
		System.out.println("--Time(days)--");
		System.out.println("Send it: "+days[0]);
		System.out.println("Fast Delivery: "+days[1]);
		System.out.println("Cheap Sending: "+days[2]);
		System.out.println("Easy Send: "+days[3]);
		System.out.println("--Slowest gone! :O--");
		System.out.println("Send it: "+this.offices[0]);
		System.out.println("Fast Delivery: "+this.offices[1]);
		System.out.println("Cheap Sending: "+this.offices[2]);
		System.out.println("Easy Send: "+this.offices[3]);
	}

	public void findBestOptionBudget(float budget){
		float[] price = new float[4];
		for(int i = 0;i < 4;i++){
			if(this.offices[i] != null){
				price[i] = this.offices[i].getPriceForDelivery();
			}
		}
		float moreExp = price[0];
		int moreExpInd = 0;
		for(int i = 1;i < 4;i++){
			if(moreExp < price[i]){
				moreExp = price[i];
				moreExpInd  = i;
			}
		}
		this.offices[moreExpInd] = null;
		System.out.println("--Prices--");
		System.out.println("Send it: "+price[0]);
		System.out.println("Fast Delivery: "+price[1]);
		System.out.println("Cheap Sending: "+price[2]);
		System.out.println("Easy Send: "+price[3]);
		System.out.println("--Most expensive gone! :O--");
		System.out.println("Send it: "+this.offices[0]);
		System.out.println("Fast Delivery: "+this.offices[1]);
		System.out.println("Cheap Sending: "+this.offices[2]);
		System.out.println("Easy Send: "+this.offices[3]);
	}

	public String bestOffice(){
		for(int i = 0;i < 4;i++){
			if(this.offices[i] != null){
				return this.offices[i].getName();
			}
		}
		return "";
	}
}