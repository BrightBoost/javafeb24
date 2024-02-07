package voorbeeldOO;

public class Cat {
    private String name;
    private boolean isEvil = true;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() > 2) {
            this.name = name;
        }
    }

    public boolean isEvil() {
        return isEvil;
    }

    public void setEvil(boolean evil) {
        isEvil = evil;
    }

    public void printCatInfo() {
        System.out.println(name + " is evil: " + isEvil);
    }
}
