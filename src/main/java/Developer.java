public class Developer implements Observer {
    private String name;

    public Developer(String name) {
        this.name = name;
    }


    @Override
    public void update(String information) {
        System.out.println(name + " knows that:\n" + information);
    }
}