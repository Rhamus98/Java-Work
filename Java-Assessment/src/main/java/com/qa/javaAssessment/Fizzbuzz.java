package com.qa.javaAssessment;

class Fizzbuzz {
	public String fizzBuzz(int arg1) {
		int a=15;
		
		if(a%3==0 && a%5==0) {
			return "Fizzbuzz";
		}		
		
		else if(a%5==0 && a%3!=0) {
			return "Buzz";
				}
		else if(a%3==0 && a%5!=0) {
			return "Fizz";
					}
		else {
		return null;
			}
	}
}
