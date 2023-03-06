package com.stefano.boriero.destinationcity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public String destCity(List<List<String>> paths) {
	Set<String> departures = new HashSet<>();
	Set<String> arrivals = new HashSet<>();

	for (List<String> path: paths) {
	    departures.add(path.get(0));
	    arrivals.add(path.get(1));
	}

	arrivals.removeAll(departures);
	return arrivals.stream().findFirst().get();
    }
}
