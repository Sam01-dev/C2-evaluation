package question3;

public class OLA {
	
	public Car bookCar(int numberOfPassenger, int numberOfKMs)
	{
		if(numberOfPassenger<=3)
		{
			HatchBack h = new HatchBack();
			return h;
		}
		else
		{
			Sedan s = new Sedan();
			return s;
		}
		
	}
	
	public int calculateBill(Car car) {
		int numberOfKms = car.getNumberOfKms();
		//int farePerKm = car.farePerKm;
		
		if(car== new Sedan())
		{
			Sedan sedan = (Sedan) car;
			int Totalfare = numberOfKms*sedan.farePerKm;
			return Totalfare;
		}
		else
		{
			HatchBack hatch = (HatchBack) car;
			int Totalfare = numberOfKms*hatch.farePerKm;
			return Totalfare;
		}
		 
		
		//return Totalfare;
		
	}

}
