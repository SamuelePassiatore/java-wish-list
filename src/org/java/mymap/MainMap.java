package org.java.mymap;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
	public static void main(String[] args) {

		Map<String, Integer> wordMap = new HashMap<>();
		String str = "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam - repudiandae est, alias in ullam excepturi ipsam modi odio Lorem ipsum dolor asperiores voluptatum, # quam distinctio ! Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam repudiandae Totam repudiandae est ; accusantium voluptatum, quam distinctio aut magnam quod veniam esse nesciunt debitis.";
		String[] words = str.split(" ");

		for (String word : words) {
			
			word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

			if (word.isBlank()) {
				continue;
			}
			
			if (!wordMap.containsKey(word)) {
				wordMap.put(word, 1);
			} else {
				wordMap.put(word, wordMap.get(word) + 1);
			}
		}

		System.out.println(wordMap);
	}
}
