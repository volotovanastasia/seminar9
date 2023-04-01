public interface Subject {
    void registerObserver(Observer observer, String role);

    void notifyObservers();
}
