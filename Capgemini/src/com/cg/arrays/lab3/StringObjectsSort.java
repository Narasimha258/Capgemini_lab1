package com.cg.arrays.lab3;
import java.util.Scanner;
public class StringObjectsSort {
	public static void main(String[] args) {
		int count;
		String temp;
		System.out.println("Enter the Array Size:");
		Scanner scan = new Scanner(System.in);

		count = scan.nextInt();

		String str[] = new String[count];
		String str1[] = new String[count];

		Scanner scan2 = new Scanner(System.in);
		for (int i = 0; i < count; i++) {
			str[i] = scan2.nextLine();
		}
		

		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
			//System.out.println(str[i].length());
			if (str[i].length() % 2 != 0) {
				str1[i] = str[i].substring(0, str[i].length() / 2 + 1).toUpperCase()
						+ str[i].substring(str[i].length() / 2 + 1, str[i].length()).toLowerCase();
			} else {
				str1[i] = str[i].substring(0, str[i].length() / 2).toUpperCase()
						+ str[i].substring(str[i].length() / 2, str[i].length()).toLowerCase();
			}
		}

		for (int i = 0; i <= count - 1; i++)
			System.out.print(str1[i] + ", ");
	}
}

