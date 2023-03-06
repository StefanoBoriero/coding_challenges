package com.stefano.boriero.threesum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
	List <Integer> sortedNumsList = new ArrayList<>();
	for (int num: nums) {
	    sortedNumsList.add(num);
	}
	Collections.sort(sortedNumsList);
	
	List<List<Integer>> outcome = new ArrayList<>();
	for (int i=0; i < sortedNumsList.size() - 2; i++) {
	    Integer firstElement = sortedNumsList.get(i);
	    int previousIndex = i-1;
	    if (previousIndex >= 0) {
		Integer previousElement = sortedNumsList.get(previousIndex);
		if (firstElement == previousElement) {
		    continue;
		}
	    }
	    int j = i+1;
	    int k = sortedNumsList.size() - 1;
	    while(!isCompleted(j,k)) {
		Integer secondElement = sortedNumsList.get(j);
		Integer thirdElement = sortedNumsList.get(k);

		Integer sum = firstElement + secondElement + thirdElement;
		
		if (sum == 0) {
		    outcome.add(List.of(firstElement, secondElement, thirdElement));
		    j++;
		    k--;
		} else if (sum > 0) {
		    k--;
		    while(sortedNumsList.get(k) == sortedNumsList.get(k+1) && k > j) {
			k--;
		    }
		} else {
		    j++;
		    while(sortedNumsList.get(j-1) == sortedNumsList.get(j) && j < k) {
			j++;
		    }
		}
	    }
	}
	return outcome;	
    }


    private boolean isCompleted(int j, int k) {
	return k-j < 1;
    }
}
