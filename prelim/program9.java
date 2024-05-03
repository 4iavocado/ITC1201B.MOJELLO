package prelim;

public class program9 {
    public static void main(String[] args) {
		
        int birthYear = 1999;
        int year = 2024;
        int age = year - birthYear;
        int months = age * 12;
        int days =  age * 365;
        int hours = days * 24;
        int minutes = hours * 60;
        int seconds = minutes * 60;

        System.out.println("Current year is " + year);
        System.out.println("My age is " + age);
        System.out.println("My age in months is " + months);
        System.out.println("My age in days is " + days);
        System.out.println("My age in hours is " + hours);
        System.out.println("My age in minutes is " + minutes);
        System.out.println("My age in seconds is " + seconds);
    }
}
