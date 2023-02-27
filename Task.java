public class Task {

    public Task(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public Task() {
        name="";
        length=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private String name;
    private int length;

}
