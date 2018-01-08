package com.bridgelabz.utility;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Utility<T> 
{
	Scanner scanner=new Scanner(System.in);
	BufferedReader br;
	public Utility()
	{
		br=new BufferedReader(new InputStreamReader(System.in));	
	}
	public String inputString() 
	{
		try {
			System.out.println(br.readLine());
			return br.readLine();
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return "";
	}
	public double inputDouble()
	{
		try{
			try {
				return Double.parseDouble(br.readLine());
			} 
			catch (NumberFormatException nfe) 
			{
				System.out.println(nfe.getMessage());
			}
		}
		catch (IOException ioe) 
		{
			System.out.println(ioe.getMessage());
		}
		return 0;
	}

	public int inputInteger()
	{
		try{
			try {
				return Integer.parseInt(br.readLine());
			} 
			catch (NumberFormatException nfe) 
			{
				System.out.println(nfe.getMessage());
			}
		}
		catch (IOException ioe) 
		{
			System.out.println(ioe.getMessage());
		}
		return 0;
	}

	public boolean inputBoolean()
	{
		try{
			try {
				return Boolean.parseBoolean(br.readLine());
			} 
			catch (NumberFormatException nfe) 
			{
				System.out.println(nfe.getMessage());
			}
		}
		catch (IOException ioe) 
		{
			System.out.println(ioe.getMessage());
		}
		return true;
	}
	
	/*Anagram Program*/
	/**Anagrammethod
	 * @param first
	 * @param second
	 */
	public void isAnagram(String first,String second)
	{ 
		boolean result=true;
		String s1=first.replaceAll(" ","");
		String s2=second.replaceAll(" ","");

		if(s1.length()!= s2.length())
		{
			result=false;
		}

		else
		{
			String news1= s1.toLowerCase();
			String news2= s2.toLowerCase();

			for(int i=0;i<s1.length();i++)
			{
				if(news2.indexOf(news1.charAt(i))==-1)
				{
					result=false;
				}
			}
		}

		if(result)
		{
			System.out.println(s1+" and "+s2+ " are anagrams");
		}
		else
		{
			System.out.println(s1+" and "+s2+ "are not anagrams");
		}
	}
	
	//display array
	/**
	 * displayArray
	 */
	public void displayArray()
	{
		int i;
		System.out.println("Enter the Range of Integer Array:");
		int arr_size = scanner.nextInt();
		int arr[]=new int[arr_size];

		System.out.println("Enter the Integer Array:");
		for( i=0;i<arr_size;i++)
		{
			arr[i] =  scanner.nextInt();	
		}

		System.out.println("Dsispaly the Integer Array befor sorting:");
		for(i=0;i<arr_size;i++)
		{
			System.out.print(arr[i]+"");
		}
		System.out.println();    

	}

	/**insertion sort
	 * @param array
	 */
	@SuppressWarnings("hiding")
	public <T extends Comparable<T>> void insertionSorting(T[] array)
	{
		for (int i = 1; i < array.length; i++)
			for (int j = i; j > 0; j--)
				if (array[j].compareTo(array[j - 1]) < 0) 
				{
					T temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}

	}
	/*Binary Search Program*/
	/**Binary Search 
	 * @param names
	 * @param key
	 * @return
	 */
	@SuppressWarnings("hiding")
	public <T extends Comparable<T>> int binarySearch(T[] names, T key) {
		int first = 0;
		int last  = names.length;

		while (first < last) {
			int mid = (first + last) / 2;
			if (key.equals(names[mid])) {
				return mid+1;
			} else if (key.compareTo( names[mid]) < 0) {
				last = mid;
			} else {
				first =  mid;
			}
		}
		return 0;
	}

	/**bubble sort
	 * @param array
	 */
	@SuppressWarnings("hiding")
	public <T extends Comparable<T>> void bubbleSort(T[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array.length; j++) 
			{
				if(array[i].compareTo(array[j])<0)
				{
					T temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	/*Dspaly array
	 * 
	 */
	@SuppressWarnings("hiding")
	public  <T> void display(T[] elements){
		for(int i=0;i<elements.length;i++)
			System.out.println(elements[i]+" ");
	}

	public   void start() {
		long starttime = System.currentTimeMillis();
		System.out.println(starttime);
	}


	/**calculate stop time
	 * 
	 */
	public  void stop() 
	{    
		long stoptime = System.currentTimeMillis();
		System.out.println(stoptime);

	}
	
	/*DyaOFWeek*/
	/**
	 * @param m
	 */
	public  void monthCal(int m)
	{

		switch (m)
		{
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("Invalid month.");
			break;
		}
	}

	/** day calulate
	 * @param month
	 * @param year
	 * @param dayNumber
	 */
	@SuppressWarnings("unused")
	public void dayCal( int month,int year,int dayNumber)
	{
		String weekDay;
		int y0 = year - (14 - month) / 12;
		int m0 = month + 12 * ((14 - month) / 12) - 2;
		int	x = y0 + y0/4 - y0/100 + y0/400;
		String error = " \n \n Please Check Your Dates And Try Again " ;
		int day1 =  (dayNumber + x + 31*m0 / 12) % 7;


		switch(day1) 
		{  

		case 0:
			weekDay = " Sunday ";
			System.out.print(weekDay);

		case 1:  
			weekDay = " Monday ";
			System.out.print(weekDay);
			break;

		case 2:  
			weekDay = " Tuesday ";
			System.out.print(weekDay);
			break;
		case 3:  
			weekDay = " Wednesday ";
			System.out.print(weekDay);
			break;
		case 4:  
			weekDay = " Thursday ";
			System.out.print(weekDay);
			break;
		case 5:  
			weekDay = " Friday ";
			System.out.print(weekDay);
			break;

		case 6:  
			weekDay = " Saturday "; 
			System.out.print(weekDay);

			break;
		default:
			System.out.println("Day.");
			break;

		}
	}
	/*Temparature convertion*/

	/**calculateCelsius
	 * @param Fahrenheit
	 * @param Celsius
	 */
	public void calculateCelsius(double Fahrenheit,double Celsius)
	{
		Celsius  =    ( Fahrenheit - 32) * 5/9;
		System.out.println("Temperatue in Celsius = " + Celsius);


	}
	/**calculateFahrenheit
	 * @param Celsius
	 * @param Fahrenheit
	 */
	public void calculateFahrenheit(double Celsius,double Fahrenheit)
	{
		Fahrenheit= (Celsius * 9/5) + 32;
		System.out.println("Temperatue in Fahrenheit = " + Fahrenheit);
	}

	/*Sqrt newton Program*/

	/**sqrtNewton
	 * @param t
	 * @param epsilon
	 * @param c
	 */
	public void sqrtNewton(double t,double epsilon,double c)
	{
		while (Math.abs(t - c/t) > epsilon*t)
		{
			t = (c/t + t) / 2.0;
		}
		System.out.println("square root of a nonnegative number " +c+  " using Newton's method:"+t);
	}

	/*calculate monthly payment*/

	/**calculate monthly paymen
	 * @param year
	 * @param principal
	 * @param retpercent
	 */
	public void calMonthlyPayment(int year,double principal,double retpercent)
	{
		double n = 12*year;
		double r = retpercent/12*100;
		double payment = (principal*r) /1-Math.pow((1+r),(-n));
		System.out.println("Monthly payment is:"+payment);
	}

	/*DecimalToBinary*/

	/**calculate Decimal To Binary
	 * @param number
	 */
	public void printBinaryFormat(int number)
	{
		int binary[] = new int[25];
		int index = 0;
		while(number > 0){
			binary[index++] = number%2;
			number = number/2;
		}
		System.out.println("Binary Of Number is.....");
		for(int i = index-1;i >= 0;i--){
			System.out.print(binary[i]);
		}
	}

	//Prime Number
	//Scanner scanner = new Scanner(System.in);
	/**calculate PrimeNumber
	 * 
	 */
	public void calPrimeNumber()
	{
		int num1, num2, i, j, flag;
		System.out.println("Enter the value of num1 and num2 \n");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		if (num2 < 2)
		{
			System.out.println("There are no primes upto" +num2);
		}

		System.out.println("Prime numbers are ");
		if ( num1 % 2 == 0)
		{
			num1++;
		}
		for (i = num1; i <= num2; i = i + 2)
		{
			flag = 0;
			for (j = 2; j <= i / 2; j++)
			{
				if ((i % j) == 0)
				{
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
				System.out.print(i+" ");
			}
		}
		scanner.close();
	}

	/**generic bubble sort
	 * @param array
	 */
	@SuppressWarnings({ "hiding", "unchecked" })
	public <T extends Comparable<T>> void bubbleSort1(Integer[] array) {

		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array.length; j++) 
			{
				if(array[i].compareTo(array[j])<0)
				{
					T temp = (T) array[i];
					array[i] = array[j];
					array[j] = (Integer) temp;
				}
			}
		}
	}

	/**merge Sort
	 * 
	 */
	public void mergeSort1()
	{
		System.out.println("Enter the range of String array");
		int range=scanner.nextInt();
		String[] array = new String[range];
		System.out.println("Enter the String array:");
		for(int i=0;i<range;i++)
		{
			array[i]=scanner.next();
		}
		
		String[] sortedArray = mergeSort(array);
		System.out.println("After Sorting Element Using Mearge Sort....");
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i] + " ");
		}

	}

	public static String[] mergeSort(String[] list) {
		String [] sorted = new String[list.length];
		if (list.length == 1) {
			sorted = list;
		} else {
			int mid = list.length/2;
			String[] left = null; 
			String[] right = null;
			if ((list.length % 2) == 0) {
				left = new String[list.length/2];
				right = new String[list.length/2];
			} else { 
				left = new String[list.length/2];
				right = new String[(list.length/2)+1];
			}
			int x=0;
			int y=0;
			for ( ; x < mid; x++) {
				left[x] = list[x];
			}
			for ( ; x < list.length; x++) {
				right[y++] = list[x];
			}
			left = mergeSort(left);
			right = mergeSort(right);
			sorted = mergeArray(left,right);
		}

		return sorted;
	}

	private static String[] mergeArray(String[] left, String[] right) {
		String[] merged = new String[left.length+right.length];
		int lIndex = 0;
		int rIndex = 0;
		int mIndex = 0;
		int comp = 0;
		while (lIndex < left.length || rIndex < right.length) {
			if (lIndex == left.length) {
				merged[mIndex++] = right[rIndex++];
			} else if (rIndex == right.length) {
				merged[mIndex++] = left[lIndex++];
			} else {  
				comp = left[lIndex].compareTo(right[rIndex]);
				if (comp > 0) {
					merged[mIndex++] = right[rIndex++];
				} else if (comp < 0) {
					merged[mIndex++] = left[lIndex++];
				} else { 
					merged[mIndex++] = left[lIndex++];
				}
			}   
		}
		return merged;
	}

	/**binary to decimal
	 * @param decimal
	 */
	public void binaryDecimal(int decimal)
	{
		String binaryNum=Integer.toBinaryString(decimal);
		System.out.println(decimal + " in binary representation is........: " + binaryNum);
		while(binaryNum.length()!=8)
		{
			binaryNum = "0"+binaryNum;
		}
		int j=4;
		char array1 [] = binaryNum.toCharArray();
		for (int i=0;i<array1.length/2;i++)
		{
			char temp1 = array1[i];
			array1[i] = array1[j];
			array1[j] = temp1;
			j++;
		}
		System.out.print("After Swapping nibble................ : ");
		System.out.println(array1);
		double res = 0.0;
		res = toDecimal(array1,res);
		System.out.println("Decimal form after swapping nibbles.................... : "+(int)(res));
		scanner.close();

	}

	/**binary to decimal
	 * @param arr
	 * @param sum
	 * @return
	 */
	private static double toDecimal(char[] arr, double sum)
	{
		int k=0;
		for (int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]=='1')
			{
				sum=sum+(Math.pow(2, k));

			}
			k++;
		}
		return sum;

	}

	/**calculate FindYourNumber
	 * 
	 */
	@SuppressWarnings("resource")
	public void calFindYourNumber()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number :");
		int range = scanner.nextInt();

		System.out.println("Imagine any number between 0 to " + (range - 1));

		int first = 0;
		int last = range - 1;
		int mid = (first + last) / 2;
		System.out.println("Do you imagine any number ? (yes/no)");
		String ans1 = scanner.next();
		scanner.nextLine();
		if (ans1.equalsIgnoreCase("yes")) {
			while (first <= last) {
				System.out.println("is your number is " + (mid) + " then press ok  \n if smaller than " + mid
						+ " then press yes \n if greater than " + mid + " press no ");
				String ans = scanner.next();

				if (ans.equalsIgnoreCase("ok")) {
					System.out.println("Your number is :" + mid);
					break;
				}
				else if (ans.equalsIgnoreCase("yes")) {
					last = mid - 1;
				} else {
					first = mid + 1;
				}
				mid = (first + last) / 2;
			}
		}
		if (first > last)
			System.out.println("sorry u did not imagine any number ");
	}
	//Day of week Program
	/**day Of Week
	 * @param date
	 * @param month
	 * @param year
	 */
	public static void dayOfWeek(int date, int month, int year) {
		int y = (year - ((14 - month) / 12));
		int x = (y + (y / 4) - (y / 100) + (y / 400));
		int m = (month + 12 * ((14 - month) / 12) - 2);
		int d = ((date + x + (31 * m) / 12) % 7);
		// print day
		System.out.println("day is =" + d);
		// d is used as choice in switch
		switch (d) {
		case 0:
			// case 0 true print sunday
			System.out.println("Sunday");
			break; // break and go out of switch
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		}
}

}









