public class Sandwich extends Food {
    public String _filling1 = "";
    public String _filling2 = "";

    public Sandwich()
    {
        super("Sandwich");
    }

    public Sandwich(String name, String filling1){
        super(name == ""? "Sandwich" : name);
        _filling1 = filling1;
    }

    public Sandwich(String name, String filling1, String filling2) {
        super(name == ""? "Sandwich" : name);
        _filling1 = filling1;
        _filling2 = filling2;
    }

    public String getName() {
        return super.getName();
    }

    @Override
    public int calculateCalories() {
        if (_filling1 == "" && _filling2 == "")
            return 100;
        if (_filling2 == "")
            return 200;
        return 300;
    }
}
