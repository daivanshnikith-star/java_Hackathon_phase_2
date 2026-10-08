import java.util.Scanner;
class Theatre {
    
    public static void main(String[] args) {

        // ---- Variable declarations ----
        String customerName = "Daivansh";
        String showName = "Spirit";
        int numberOfTickets =18;
        double ticketPrice = 2000.0;
        double totalAmount;
        double discount =  500.0;
        double finalAmount;
        boolean seatAvailable = true;

        // ---- Calculate total ticket amount (multiplication operator *) ----
        totalAmount = numberOfTickets * ticketPrice;

        // ---- Check discount eligibility (relational operator >=) ----
        boolean isEligibleForDiscount = totalAmount >= 3000;

        // ---- Apply discount if eligible ----
        if (isEligibleForDiscount) {
            discount = 500;
        }

        // ---- Calculate final payable amount (subtraction operator -) ----
        finalAmount = totalAmount - discount;

        // ---- Display all values ----
        System.out.println("---- Theatre Show Ticket Reservation ----");
        System.out.println("Customer Name      : " + customerName);
        System.out.println("Show Name          : " + showName);
        System.out.println("Number of Tickets  : " + numberOfTickets);
        System.out.println("Ticket Price       : Rs. " + ticketPrice);
        System.out.println("Total Amount       : Rs. " + totalAmount);
        System.out.println("Seat Availability  : " + (seatAvailable ? "Available" : "Not Available"));
        System.out.println("Discount Eligible  : " + isEligibleForDiscount);
        System.out.println("Discount Applied   : Rs. " + discount);
        System.out.println("Final Payable Amt  : Rs. " + finalAmount);
        System.out.println("-----------------------------------------");
        System.out.println("Thank you for booking with us!");
        System.out.println("Enjoy the show!");
}
}
