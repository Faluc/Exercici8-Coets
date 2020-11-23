package domain;


import java.util.ArrayList;
import java.util.List;

public class Rocket {
	private String rocket_code;
	private int num_propellers;
	protected List<Propeller> propellers_list = new ArrayList<Propeller>();

	public Rocket (String rocket_code, List<Propeller> propellers_list) {
		super();
		this.rocket_code = rocket_code;
		this.propellers_list = propellers_list;
		
	}	

	public String getRocket_code() {
		return rocket_code;
	}


	public void setRocket_code(String rocket_code) {
		this.rocket_code = rocket_code;
	}


	public int getNum_propellers() {
		return num_propellers;
	}


	public void setNum_propellers(int num_propellers) {
		this.num_propellers = num_propellers;
	}


	public List<Propeller> getPropellers_list() {
		return propellers_list;
	}


	public void setPropellers_list(List<Propeller> propellers_list) {
		this.propellers_list = propellers_list;
	}
	public void setTarget_Power (int target_power) {
		for (Propeller propeller : propellers_list) {
			propeller.setTarget_power(target_power);;
			Thread t = new Thread (propeller);
			t.start();
		}
	}
	
	public void brake(int target_power) {
		for (Propeller propeller : propellers_list) {
			propeller.setTarget_power(target_power);
			Thread t = new Thread (propeller);
			t.start();
		}
	}
	

	
}
