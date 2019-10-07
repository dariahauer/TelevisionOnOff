public class StatusTest {

    public void turnOn(Television television) {
        television.on = true;
    }

    public void turnOff(Television television) {
        television.on = false;
    }

    public void showStatus(Television television) {
        System.out.println("Television status: " + television.on);
    }
}

