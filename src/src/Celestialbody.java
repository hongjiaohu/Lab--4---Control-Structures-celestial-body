/**
 * 
 */
package src;

import java.util.Scanner;

/**
 * @author h.hu
 *
 */
public class Celestialbody {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**

		 *

		 * Name: Hongjiao Hu

		 * Teacher: Mr. Hardman 

		 * Assignment 4, Program 1

		 * Date Last Modified: 2016/11/17

		 *

		 */
		
		Scanner userInput = new Scanner(System.in);
		int userweight;
	    String userchoose;
	    
		System.out.println("Hello user!"+"What is your weight?");
		userweight = userInput.nextInt();
		
		System.out.print("What celestial body you want to travel");
		userchoose = userInput.next();
		
		if(userchoose.equalsIgnoreCase("Mercury")){
			System.out.println("Your  weight on Mercury:"+userweight* 0.38);
		}
		else if(userchoose.equalsIgnoreCase("Venus")){
			System.out.println("Your  weight on Venus:"+userweight* 0.91);
		}
		else if(userchoose.equalsIgnoreCase("Earth")){
			System.out.println("Your  weight on Earth:"+userweight* 1);
		}
		else if(userchoose.equalsIgnoreCase("Moon")){
			System.out.println("Your  weight on Moon:"+userweight* 0.165);
		}
		else if(userchoose.equalsIgnoreCase("Mars")){
			System.out.println("Your  weight on Mars:"+userweight* 0.38);
		}
		else if(userchoose.equalsIgnoreCase("Jupiter")){
			System.out.println("Your  weight on Jupiter:"+userweight* 2.34);
		}
		else if(userchoose.equalsIgnoreCase("Saturn")){
			System.out.println("Your  weight on Saturn:"+userweight* 1.06);
		}
		else if(userchoose.equalsIgnoreCase("Uranus")){
			System.out.println("Your  weight on Uranus:"+userweight* 0.92);
		}
		else if(userchoose.equalsIgnoreCase("Neptune")){
			System.out.println("Your  weight on Neptune:"+userweight* 1.19);
		}
		else if(userchoose.equalsIgnoreCase("Pluto")){
			System.out.println("Your  weight on Pluto:"+userweight* 0.06);
		}
		
		userInput.close();
	}

}
