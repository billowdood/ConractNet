public class Client{
/*Class which will represent the client who wants to send a package*/

	/*The client will have three options as priority:
	1.-The cost for sending the package
	2.-The distance between the client and the delivery office
	3.-The time it will take to make the delivery
	*/
	/*
	private int priority;
	/*decision variable will hold the selected delivery office
	private int decision;
	/*distance will hold the distance between the client and the delivery office(euclidean distance)
	private float distance;
	private int xValue,yValue;

	public void setPriority(int priority){
		this.priority = priority;
	}

	public void setPosition(int xValue,int yValue){
		this.xValue = xValue;
		this.yValue = yValue;
	}

	public int getXValue(){
		return this.xValue;
	}

	public int getYValue(){
		return this.yValue;
	}*/
	private float budget;
	private int xValue,yValue;

	public void setClient(float budget,int xValue,int yValue){
		this.budget =  budget;
		this.xValue = xValue;
		this.yValue = yValue;
	}

	public int getXValue(){
		return this.xValue;
	}

	public int getYValue(){
		return this.yValue;
	}
}