public class Journalist implements Observer {
    private String name;

    public Journalist(String name) {
        this.name = name;
    }


    @Override
    public void update(String information) {
        System.out.println(name + " knows that:\n" + information);
    }
}
