interface Subject {
    void addSubscriber(Observer user);
    void removeSubscriber(Observer user);
    void sendNotification(String movieName);
    void releaseMovie(String movieName);
}