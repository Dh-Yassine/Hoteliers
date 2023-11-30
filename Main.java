package Hotel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create arrays to hold hotels, rooms, and clients
        Hotel[] hotels = new Hotel[3];
        Client[] clients = new Client[10];
        Reservation[] reservations = new Reservation[10]; // Assuming a fixed number of reservations for demonstration

        // Generate actual dates for hotels using LocalDate
        LocalDate currentDate = LocalDate.now();
        LocalDate hotelStartDate = currentDate.minus(2, ChronoUnit.DAYS);
        LocalDate hotelEndDate = hotelStartDate.plus(7, ChronoUnit.DAYS);

        // Create multiple hotels
        for (int i = 0; i < hotels.length; i++) {
            Hotel hotel = new Hotel(
                    "Hotel " + (i + 1),
                    "4-star",
                    "Address " + (i + 1),
                    Date.from(hotelStartDate.atStartOfDay(ZoneId.systemDefault()).toInstant()),
                    Date.from(hotelEndDate.atStartOfDay(ZoneId.systemDefault()).toInstant())
            );

            // Add rooms to the hotel
            CategorieChambre[] roomCategories = new CategorieChambre[5];
            for (int j = 0; j < roomCategories.length; j++) {
                roomCategories[j] = new CategorieChambre(true, true, true, 2);
                try {
                    roomCategories[j].setPrix(150 + j * 10);
                } catch (Anomalie e) {
                    System.out.println("Anomalie: " + e.getMessage());
                }
                hotel.ajouterChambre(roomCategories[j]);
            }

            hotels[i] = hotel; // Assign the created hotel to the array
        }

        // Create clients
        for (int i = 0; i < clients.length; i++) {
            Adresse clientAddress = new Adresse(
                    "Client Street " + (i + 1),
                    (i + 1) * 10,
                    "City " + (i + 1),
                    "1234" + (i + 1),
                    "Dept " + (i + 1),
                    "Country " + (i + 1),
                    "12345678" + (i + 1),
                    "client" + (i + 1) + "@email.com",
                    "www.client" + (i + 1) + "website.com"
            );

            Consommation[] consommations = new Consommation[]{
                    new Consommation("Food", LocalDateTime.now(), 20.0, false, 2),
                    new Consommation("Drink", LocalDateTime.now(), 8.0, true, 1),
            };

            Facture facture = new Facture(
                    (i + 1) * 100,  // numero
                    LocalDateTime.now(),  // date
                    "Credit Card",  // modePaiement
                    150.0,  // montantTotal
                    hotels[i % 3].getChambres(),  // chambresOccupes (Assigning rooms from hotels in a cyclic manner)
                    consommations,  // consommations
                    15.0  // remise
            );

            Client client = new Client(i + 1, "Client" + (i + 1), "LastName" + (i + 1), clientAddress, consommations, facture);
            clients[i] = client;
        }

        // Create reservations and assign clients to hotels
        for (int i = 0; i < clients.length - 1; i++) {
            LocalDate reservationStartDate = hotelStartDate.plus(i, ChronoUnit.DAYS);
            LocalDate reservationEndDate = reservationStartDate.plus(3, ChronoUnit.DAYS);

            Chambre[] rooms = hotels[i % 3].getChambres(); // Assigning rooms from hotels in a cyclic manner

            Reservation reservation = new Reservation(
                    i + 1,
                    Date.from(reservationStartDate.atStartOfDay(ZoneId.systemDefault()).toInstant()),
                    Date.from(reservationStartDate.atStartOfDay(ZoneId.systemDefault()).toInstant()),
                    Date.from(reservationEndDate.atStartOfDay(ZoneId.systemDefault()).toInstant()),
                    rooms,
                    rooms[0].getCategorie(), // Assuming the first room's category for simplicity
                    clients[i]
            );

            // Assign specific rooms to the reservation
            for (int j = 0; j < 3; j++) {
                rooms[j].ajouterReservation(reservation);
                reservation.getChambres()[j] = rooms[j];
            }

            reservations[i] = reservation;
        }

        // Print the details using toString methods
        for (Hotel hotel : hotels) {
            System.out.println("Hotel Details:");
            System.out.println(hotel);
            System.out.println("Rooms: " + Arrays.toString(hotel.getChambres()));
            System.out.println("-------------------------");
        }

        for (Client client : clients) {
            System.out.println("Client Details:");
            System.out.println(client);
            System.out.println("-------------------------");
        }

        for (Reservation reservation : reservations) {
            if (reservation != null) {
                System.out.println("Reservation Details:");
                System.out.println(reservation);
                System.out.println("-------------------------");
            }
        }
    }
}
