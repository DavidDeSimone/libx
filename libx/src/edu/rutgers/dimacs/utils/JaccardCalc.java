package edu.rutgers.dimacs.utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JaccardCalc<T> {

	private List<T> listOne;
	private List<T> listTwo;
	private int iterations;
	
	public JaccardCalc(List<T> listOne, List<T> listTwo, int iterations) {
		this.listOne = listOne;
		this.listTwo = listTwo;
		
		if(iterations < 0) {
			iterations = 0;
		}  else {
			this.iterations = iterations;
		}
	}
	
	public double getJaccard() {
		if(listOne.size() == 0 || listTwo.size() == 0) {
			return 0.0;
		}
		
		Set<T> union = new HashSet<T>(listOne);
		union.addAll(listTwo);
		
		Set<T> intersection = new HashSet<T>(listOne);
		intersection.retainAll(listTwo);
		
		return (double) intersection.size() / (double) union.size();
	}
	
	public double getJaccardApprox() {
		if(iterations <= 0) {
			return 0.0;
		}
		
		double numMatched = 0;
		
		for(int k = 0; k < iterations; k++) {
			int valueOne = getMinHash(listOne);
			int valueTwo = getMinHash(listTwo);
		
			if(valueOne == valueTwo) {
				numMatched++;
			}
		}
		
		return numMatched / iterations;
	}
	
	private int getMinHash(List<T> list) {
		int min = Integer.MAX_VALUE;
		
		for(T t: list) {
			int hash = t.hashCode();
			if(hash < min) {
				min = hash;
			}
		}
		
		return min;
	}
	
	public void setListOne(List<T> listOne) {
		this.listOne = listOne;
	}
	
	public void setListTwo(List<T> listTwo) {
		this.listTwo = listTwo;
	}
	
	public void setIterations(int k) {
		this.iterations = k;
	}

	
}
