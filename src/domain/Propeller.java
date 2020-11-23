package domain;


public class Propeller implements Runnable {
	protected int max_power;
	private int current_power;
	private int target_power;
	public String description;
	
	
	public Propeller (int max_power, String description) {
		this.max_power = max_power;
		this.current_power = 0;
		this.target_power = 0;
		this.description=description;
	}


	public int getMax_power() {
		return max_power;
	}


	public void setMax_power(int max_power) {
		this.max_power = max_power;
	}


	public int getCurrent_power() {
		return current_power;
	}


	public void setCurrent_power(int current_power) {
		this.current_power = current_power;
	}


	public int getTarget_power() {
		return target_power;
	}


	public void setTarget_power(int target_power) {
		this.target_power = target_power;
	}


	
	public void run() {
		try {
			if (target_power>max_power) {
				System.out.println("WARNING!!! - Power exceeded. " + description + " will not start.");
			}
			else if(current_power<target_power) {
				do {
					current_power++;
					System.out.println(description +" current Power: "+current_power+ " - Target Power: "+target_power);
					Thread.sleep(300);
				}while(current_power!=target_power);
				System.out.println("******** "+description +" reached the Target Power: "+target_power+" ********");
			}
			else if(current_power>target_power) {
				do {
					current_power--;
					System.out.println(description +" current Power: "+current_power+ " - Target Power: "+target_power);
					Thread.sleep(300);
				}while(current_power!=target_power);
				System.out.println("******** "+description + " reached the Target Power:"+target_power+" ********");
				
			}
			Thread.sleep(500);
		}catch(InterruptedException e) {
			System.out.println("Something went wrong!");
		}
		
	}

	
}
