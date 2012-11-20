public class Client{
/*Class which will represent the client who wants to send a package*/

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