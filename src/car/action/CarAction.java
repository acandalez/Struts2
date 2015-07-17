package car.action;

import car.model.Car;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.conversion.annotations.TypeConversion;

public class CarAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Car car;

	public String execute() {
	
		return SUCCESS;
	}

	/**
	 * @return the car
	 */
	public Car getCar() {
		return car;
	}
	/**
	 * @param car the car to set
	 */
	@TypeConversion(converter="car.convers.model.ConverterCar")
	public void setCar(Car car) {
		this.car = car;
	}
}
