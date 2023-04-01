import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> parameters = new HashMap<>();
        String name = "Game";
        String bestPlayer = "Best of the Best";
        String description = "Best game for spending your free time";
        Integer bestResult = 99999;
        parameters.put("Parameter 1", 10);
        parameters.put("Parameter 2", 20);
        AppStore appStore = new AppStore(name, bestPlayer, bestResult, description, parameters);

        Observer player1 = new Player("Player");
        Observer journalist1 = new Journalist("Journalist");
        Observer developer1 = new Developer("Developer");

        appStore.registerObserver(player1, "Player");
        appStore.registerObserver(journalist1, "Journalist");
        appStore.registerObserver(developer1, "Developer");

        appStore.notifyObservers();
    }
}