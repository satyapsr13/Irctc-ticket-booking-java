package ticket.booking;

import ticket.booking.entities.User;
import ticket.booking.service.UserBookingService;
import ticket.booking.util.UserServiceUtil;

import javax.imageio.IIOException;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println("Running Train booking system");

        Scanner scan = new Scanner(System.in);
        int option = 0;
        UserBookingService userBookingService;
        try {
            userBookingService = new UserBookingService();
        } catch (IOException ex) {
            System.out.println("Error in User booking service" + ex);
            return;

        }
        while (option != 7) {
            System.out.println("Choose Option");
            System.out.println("1. Sign up");
            System.out.println("2. Login");
            System.out.println("3. Fetch bookings");
            System.out.println("4. Search Trains");
            System.out.println("5. Book a seat");
            System.out.println("6. Cancel my bookings");
            System.out.println("7. Exit the App");
            option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter user name to signup");
                    String userName = scan.next();
                    System.out.println("Enter password to signup");
                    String password = scan.next();
                    User newUser = new User(userName, password, UserServiceUtil.hashPassword(password), new ArrayList<>(), UUID.randomUUID().toString());

                    userBookingService.signUp(newUser);
                    break;
                case 2:
                    System.out.println("Enter user name to signup");
                    String nameToLogin = scan.next();
                    System.out.println("Enter password to signup");
                    String passwordToLogin = scan.next();
                    User userToLogin = new User(nameToLogin, passwordToLogin, UserServiceUtil.hashPassword(passwordToLogin), new ArrayList<>(), UUID.randomUUID().toString());

                    try {

                        userBookingService = new UserBookingService(userToLogin);
                    } catch (IOException ex) {
                        System.out.println("Error: in login user" + ex);
                        return;
                    }
                    break;

                default:
                    System.out.println("Please choose any option");
            }
        }

    }


}