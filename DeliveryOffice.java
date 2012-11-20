import java.lang.Math;
import java.util.Random;

public class DeliveryOffice{
	/*Class which will represent the different delivery offices*/

	private String nameOfOffice;
	private int xValue,yValue;
	private Random random = new Random();

	public DeliveryOffice(String nameOfOffice,int xValue,int yValue){
		this.nameOfOffice = nameOfOffice;
		this.xValue = xValue;
		this.yValue = yValue;
	}

	public double calculateDistance(Client client){
		return Math.sqrt((float)(Math.pow((this.xValue - client.getXValue()),2) + Math.pow((this.yValue - client.getYValue()),2)));
	}

	public int getDaysForDelivery(int distanceKm){
		return (int)random.nextInt(distanceKm) % 15;
	}

	public float getPriceForDelivery(){
		return random.nextInt(20)*10;
	}

	public String getName(){
		return this.nameOfOffice;
	}
}