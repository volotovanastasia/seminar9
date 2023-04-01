import java.util.*;

public class AppStore implements Subject {
    private List<Observer> players;
    private List<Observer> journalists;
    private List<Observer> developers;
    private String name;
    private String bestGamer;
    private Integer bestResult;
    private String description;
    private Map<String, Integer> parameters;

    public AppStore(String name, String bestGamer, Integer bestResult, String description, Map<String, Integer> parameters) {
        players = new ArrayList<>();
        journalists = new ArrayList<>();
        developers = new ArrayList<>();
        this.name = name;
        this.bestGamer = bestGamer;
        this.bestResult = bestResult;
        this.description = description;
        this.parameters = parameters;

    }

    @Override
    public void registerObserver(Observer observer, String role) {
        if (Objects.equals(role, "Player")) {
            players.add(observer);
        }
        if (Objects.equals(role, "Journalist")) {
            journalists.add(observer);
        }
        if (Objects.equals(role, "Developer")) {
            developers.add(observer);
        }
    }


    @Override
    public void notifyObservers() {
        String messageForPlayers =
                this.name + "\nOur best player " + this.bestGamer + " have result " + this.bestResult;
        String messageForDevelopers = "Our parameters:\n";
        for (Map.Entry<String, Integer> parameter : parameters.entrySet()) {
            messageForDevelopers += parameter.getKey() + " is " + parameter.getValue() + "\n";
        }
        for (Observer observer : players) {
            observer.update(messageForPlayers);
        }
        for (Observer observer : journalists) {
            observer.update(this.description);
        }
        for (Observer observer : developers) {
            observer.update(messageForDevelopers);
        }
    }
}
