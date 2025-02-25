class ConcreteUser implements Observer {
    private String username;

    public ConcreteUser(String username) {
        this.username = username;
    }

    @Override
    public void update(String movieName, String genreName) {
        System.out.println("Notification to " + username + ": New " + genreName + " movie - " + movieName);
    }
}