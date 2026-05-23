package Q4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Owner owner1 = new Owner("Nimal","0771234567");

        Bicycle myBike = new Bicycle(owner1);

        System.out.println("Bicycle Owner: " + myBike.getOwner().getOwnerName());
        System.out.println("Owner Phone: " + myBike.getOwner().getPhoneNo());
    }
}
