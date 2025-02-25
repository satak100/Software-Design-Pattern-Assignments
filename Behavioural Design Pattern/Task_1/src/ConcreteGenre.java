import java.util.*;

class ConcreteGenre implements Subject {
    private String genreName;
    private List<Observer> subscribers = new ArrayList<>();

    public ConcreteGenre(String genreName) {
        this.genreName = genreName;
    }

    @Override
    public void addSubscriber(Observer user) {
        subscribers.add(user);
    }

    @Override
    public void removeSubscriber(Observer user) {
        subscribers.remove(user);
    }

    @Override
    public void sendNotification(String movieName) {
        for (Observer user : subscribers) {
            // Create a new thread for each notification
            new Thread(() -> user.update(movieName, genreName)).start();
        }
    }

    @Override
    public void releaseMovie(String movieName) {
        System.out.println("New movie released in " + genreName + ": " + movieName);
        sendNotification(movieName);
    }
}