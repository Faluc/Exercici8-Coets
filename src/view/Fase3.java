package view;
import domain.Propeller;
import domain.Rocket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fase3 {

	public static void main(String[] args) {
	
		ArrayList <Propeller> Rocket1_propellers = new ArrayList <Propeller>();
		Rocket1_propellers.add(new Propeller(10,"Rocket 1 - Propeller 1"));
		Rocket1_propellers.add(new Propeller(30,"Rocket 1 - Propeller 2"));
		Rocket1_propellers.add(new Propeller(80,"Rocket 1 - Propeller 3"));
		
		ArrayList <Propeller> Rocket2_propellers = new ArrayList <Propeller>();
		Rocket2_propellers.add(new Propeller(30,"Rocket 2 - Propeller 1"));
		Rocket2_propellers.add(new Propeller(40,"Rocket 2 - Propeller 2"));
		Rocket2_propellers.add(new Propeller(50,"Rocket 2 - Propeller 3"));
		Rocket2_propellers.add(new Propeller(50,"Rocket 2 - Propeller 4"));
		Rocket2_propellers.add(new Propeller(30,"Rocket 2 - Propeller 5"));
		Rocket2_propellers.add(new Propeller(10,"Rocket 2 - Propeller 6"));
		
		Rocket rocket1 = new Rocket ("32WESSDS", Rocket1_propellers);
		Rocket rocket2 = new Rocket ("LDSFJA32", Rocket2_propellers);
		System.out.println("Rocket 1 - Code: " + rocket1.getRocket_code() + " - Nº of Propellers: " +Rocket1_propellers.size());
		for (int i = 0; i<Rocket1_propellers.size();i++) {
		System.out.println("Propeller "+(i+1)+" - Max Power: "+Rocket1_propellers.get(i).getMax_power());
		}
		System.out.println("----------------------------");
		System.out.println("Rocket 2 - Code: " + rocket2.getRocket_code() + " - Nº of Propellers: " +Rocket2_propellers.size());
		for (int i = 0; i<Rocket2_propellers.size();i++) {
		System.out.println("Propeller "+(i+1)+" - Max Power: "+Rocket2_propellers.get(i).getMax_power());
		}
		
		boolean quit = false;
		System.out.println("----------------------------------");
		System.out.println("Please, select one of the options:");
		System.out.println("1 - Set Target Power // 2 - Exit");
		do {
			Scanner exit = new Scanner(System.in);
			int input1 = exit.nextInt();
			switch (input1) {
			case 1:
				System.out.println("Introduce target power to rocket 1?");
				Scanner sc = new Scanner(System.in);
				int input2 = sc.nextInt();
				System.out.println("Introduce target power to rocket 2?");
				int input3 = sc.nextInt();
				rocket1.setTarget_Power(input2);
				rocket2.setTarget_Power(input3);
				break;
			case 2:
				quit = true;
				break;
		}} while (quit!=true);	
		

	}	
}

