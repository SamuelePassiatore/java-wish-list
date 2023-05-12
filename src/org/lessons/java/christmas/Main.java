package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		List<String> wishList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		boolean addNewWish = true;
		
		while(addNewWish) {
			System.out.println("Inserisci un desiderio: ");
			String wish = sc.nextLine();
			wishList.add(wish);
			
			System.out.println("Elementi nella lista dei desideri: " + wishList.size());
			System.out.println("Vuoi inserire un altro desiderio? (s/n) : ");
			String response = sc.nextLine();
			
			if(response.equals("n")) {
				addNewWish = false;
			}
		}
		
		System.out.println("Ecco la lista dei tuoi desideri:");
		
		for (String wish : wishList) {
			
			System.out.println("- " + wish);
		}
		sc.close();
	}
}
