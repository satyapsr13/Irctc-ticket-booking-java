# IRCTC Ticket Booking App

A console-based IRCTC Ticket Booking application built with pure Java, using Jackson for loading and managing JSON data. No Spring or Spring Boot required—just clean, object-oriented Java and file-based persistence for learning and quick prototyping.

---

### Features

- User registration and login (console UI)
- Search trains by source and destination
- Book and cancel train tickets
- Sample train, user, and ticket data loaded from JSON
- Data stored in and retrieved from JSON files by Jackson
- No frameworks—easy to run and understand

---

### Tech Stack

- **Language:** Java (8+)
- **Build Tool:** Gradle
- **Library:** Jackson (for JSON serialization/deserialization)
- **Storage:** JSON files in `/resources`

---

### Project Structure

IrctcTicketBookingApp/
│── src/
│ ├── main/
│ │ ├── java/
│ │ │ ├── model/ # POJOs: User, Train, Ticket
│ │ │ ├── service/ # BookingService, UserService, TrainService
│ │ │ ├── util/ # JSON utility with Jackson
│ │ │ └── Main.java # CLI entry point
│ │ └── resources/ # Sample JSONs: trains.json, users.json, tickets.json
│── build.gradle
│── README.md
