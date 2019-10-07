public class Television {
    String company;
    String resolution;
    String display;
    boolean on;

    public Television(String c, String r, String d, boolean o) {
        company = c;
        resolution = r;
        display = d;
        on = o;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void showStatus() {
        System.out.println("Television status: " + on);

    }
}
