package car.convers.model;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import car.model.Car;

public class ConverterCar extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {

		return new Car(arg1[0], arg1[1], arg1[2], arg1[3]);
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		
		Car car = (Car)arg1;
		return car.toString();
	}
	
	
}
