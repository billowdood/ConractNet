import java.util.Scanner;
import java.util.Random;

public class MainClass{
	
	public static void main(String[] args){
	
		DeliveryOffice sendIt = new DeliveryOffice("Send It!",2,15);
		DeliveryOffice fastDelivery = new DeliveryOffice("Fast Delivery",25,30);
		DeliveryOffice cheapSending = new DeliveryOffice("Cheap Sending",27,10);
		DeliveryOffice easySend = new DeliveryOffice("Easy Send",15,20);
		
		Client client = new Client();
		Contract contract = new Contract();

		Random random = new Random();
		Scanner scanf = new Scanner(System.in);
		float budget;
			
		while(true){
			System.out.print("Welcome to our site,please enter your budget: ");
			budget = scanf.nextFloat();
			int distanceKm = 2500;
			client.setClient(budget,random.nextInt(2500)%30+1,random.nextInt(2500)%30+1);
			System.out.println("--You are in x = "+client.getXValue()+" and in y = "+client.getYValue());
			contract.setContract(sendIt,fastDelivery,cheapSending,easySend,client);
			contract.findBestOptionDistance();
			contract.findBestOptionTime(distanceKm);
			contract.findBestOptionBudget(budget);
			System.out.println("--Your best option--");
			System.out.println(contract.bestOffice());
			break;
		}
	}

}