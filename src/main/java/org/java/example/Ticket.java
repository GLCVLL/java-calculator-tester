package org.java.example;

public class Ticket {
	
	private static final double BASE_PRICE_PER_KM = 0.21;
    private static final double DISCOUNT_RATE_MINOR = 0.8;
    private static final double DISCOUNT_RATE_SENIOR = 0.6;

    private double distance;
    private int age;

    public Ticket(double distance, int age) throws Exception {
        if (distance <= 0 || age <= 0) {
            throw new Exception("Distance and age must be positive numbers");
        }
        this.distance = distance;
        this.age = age;
    }

    public double calculatePrice() {
        double basePrice = distance * BASE_PRICE_PER_KM;

        if (age < 18) {
            return basePrice * DISCOUNT_RATE_MINOR;
        } else if (age >= 65) {
            return basePrice * DISCOUNT_RATE_SENIOR;
        } else {
            return basePrice;
        }
    }

}
