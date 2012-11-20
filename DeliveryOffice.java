import java.lang.Math;
import java.util.Random;

public class DeliveryOffice{
	/*Class which will represent the different delivery offices*/

	/*Variable which will hold the name of the office
	public String nameOfOffice;
	/*Variable used for the price for the delivery
	private float priceForDelivery;
	/*Variable to hold the days it will take the package to arrive
	private int daysForDelivery;
	/*Variables to position the office somewhere in a "plane"
	private int xValue,yValue;

	public DeliveryOffice(String nameOfOffice,int xValue,int yValue){
		this.nameOfOffice = nameOfOffice;
		this.xValue = xValue;
		this.yValue = yValue;
	}

	public double calculateDistance(Client client){
		//return Math.sqrt((Math.pow(((float)this.xValue - (float)client.getXValue()),2) + Math.pow(((float)this.yValue - (float)client.getYValue()),2)));
		return Math.sqrt((float)Math.pow((this.xValue - client.getXValue()),2));
	}

	public String getNameOfOffice(){
		return this.nameOfOffice;
	}
	*/

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