package com.bridgelabz;

public class Calculation {
    public static void main(String[] args) {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        cabInvoiceGenerator.calculateFare(20,60, Rides.RideType.NORMAL);
        cabInvoiceGenerator.calculateFare(20,60, Rides.RideType.PREMIUM);
    }
}
