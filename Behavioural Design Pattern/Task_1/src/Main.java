import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create genres
        Subject thriller = new ConcreteGenre("Thriller");
        Subject horror = new ConcreteGenre("Horror");
        Subject comedy = new ConcreteGenre("Comedy");

        // Create users
        Observer user1 = new ConcreteUser("Ash");
        Observer user2 = new ConcreteUser("Pikachu");
        Observer user3 = new ConcreteUser("Raiku");

        // Users subscribe to genres
        thriller.addSubscriber(user1);
        horror.addSubscriber(user1);
        comedy.addSubscriber(user2);
        thriller.addSubscriber(user3);

        System.out.println("Welcome to DesiFlix!");
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) {
            printMenu();

            System.out.print("Enter your choice: \n");
            int choice = getUserChoice(scanner);

            switch (choice) {
                case 1 -> handleAddGenre(scanner, thriller, horror, comedy, user1);
                case 2 -> handleRemoveGenre(scanner, thriller, horror, comedy, user1);
                case 3 -> handleMovieRelease(scanner, thriller, horror, comedy);
                case 4 -> {
                    System.out.println("Exiting DesiFlix. Goodbye!");
                    isRunning = false;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Add genre to favorites");
        System.out.println("2. Remove genre from favorites");
        System.out.println("3. Release a new movie");
        System.out.println("4. Exit");
    }

    private static int getUserChoice(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine(); // Consume invalid input
            return -1;
        }
    }

    private static void handleAddGenre(Scanner scanner, Subject thriller, Subject horror, Subject comedy, Observer user) {
        System.out.print("Enter genre to add (Thriller/Horror/Comedy): ");
        String genreName = scanner.next().trim().toLowerCase();
        switch (genreName) {
            case "thriller" -> {
                thriller.addSubscriber(user);
                System.out.println("User added to Thriller favorites.");
            }
            case "horror" -> {
                horror.addSubscriber(user);
                System.out.println("User added to Horror favorites.");
            }
            case "comedy" -> {
                comedy.addSubscriber(user);
                System.out.println("User added to Comedy favorites.");
            }
            default -> System.out.println("Invalid genre. Please try again.");
        }
    }

    private static void handleRemoveGenre(Scanner scanner, Subject thriller, Subject horror, Subject comedy, Observer user) {
        System.out.print("Enter genre to remove (Thriller/Horror/Comedy): ");
        String genreName = scanner.next().trim().toLowerCase();
        switch (genreName) {
            case "thriller" -> {
                thriller.removeSubscriber(user);
                System.out.println("User removed from Thriller favorites.");
            }
            case "horror" -> {
                horror.removeSubscriber(user);
                System.out.println("User removed from Horror favorites.");
            }
            case "comedy" -> {
                comedy.removeSubscriber(user);
                System.out.println("User removed from Comedy favorites.");
            }
            default -> System.out.println("Invalid genre. Please try again.");
        }
    }

    private static void handleMovieRelease(Scanner scanner, Subject thriller, Subject horror, Subject comedy) {
        System.out.print("Enter genre to release movie (Thriller/Horror/Comedy): ");
        String genreName = scanner.next().trim().toLowerCase();
        System.out.print("Enter movie name: ");
        scanner.nextLine(); // Consume newline
        String movieName = scanner.nextLine();

        switch (genreName) {
            case "thriller" -> thriller.releaseMovie(movieName);
            case "horror" -> horror.releaseMovie(movieName);
            case "comedy" -> comedy.releaseMovie(movieName);
            default -> System.out.println("Invalid genre. Please try again.");
        }
    }
}
