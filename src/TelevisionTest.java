public class TelevisionTest {
    public static void main(String[] args) {
        Television television = new Television("Toshiba", "Full HD", "4K", false);

        System.out.println("Television company: " + television.company + " , Resolution: " + television.resolution
                + " ,Display: " + television.display + " ,Television status: " + television.on);

        television.turnOn();

        television.showStatus();

        television.turnOff();

        television.showStatus();

    }

}
