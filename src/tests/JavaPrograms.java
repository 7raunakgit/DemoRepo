package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class JavaPrograms {
	
	private int a;
	private float b;
	
	
	public JavaPrograms test1(int a) {
		this.a=a;
		return this;
	}
	
	public JavaPrograms test2(float a) {
		this.b=a;
		return this;
	}
	
	void display()
    {
        System.out.println("Display=" + a + " " + b);
    }

	static public void main(String[] args) {
		
		new JavaPrograms().test1(10).test2(20).display();

		int sum = 0, number = 1082, n = number;
		while (n > 0 || sum > 9) {
			if (n == 0) {
				n = sum;
				sum = 0;
			}
			sum += n % 10;
			n /= 10;
		}
		if (sum == 1) {
			System.out.println(number + " is a Magic Number");
		} else {
			System.out.println(number + " is not a Magic Number");
		}

	}

}
