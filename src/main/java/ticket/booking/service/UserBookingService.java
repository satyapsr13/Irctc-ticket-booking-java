package ticket.booking.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entities.User;
import ticket.booking.util.UserServiceUtil;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class UserBookingService {

    private User user;
    private List<User> userList;

    private static final String USERS_PATH = "src/main/java/ticket/booking/localDb/users.json";

    private ObjectMapper objectMapper = new ObjectMapper();

    public UserBookingService() throws IOException {

        loadUsers();
    }

    public UserBookingService(User user) throws IOException {
        this.user = user;
        loadUsers();
    }

    private void loadUsers() throws IOException {
        File users = new File(USERS_PATH);
        userList = objectMapper.readValue(users, new TypeReference<List<User>>() {
        });
    }

    public boolean loginUser() {
        Optional<User> foundUser = userList.stream().filter(user1 -> user1.getName().equalsIgnoreCase(user.getName()) && UserServiceUtil.checkPassword(user.getPassword(), user1.getHashPassword())).findFirst();

        return foundUser.isPresent();
    }

    public boolean signUp(User user) {
        try {
            userList.add(user);
            saveUserListToFile();
            return true;
        } catch (IOException ex) {
            return false;
        }
    }

    private void saveUserListToFile() throws IOException {
        File userFile = new File(USERS_PATH);

        objectMapper.writeValue(userFile, userList);
    }

    public void fetchBookings() {
        user.printTickets();
    }

    public boolean cancelBooking(String tickerId) {
        return false;
    }
}
