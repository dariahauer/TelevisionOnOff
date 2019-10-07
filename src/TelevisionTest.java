public class TelevisionTest {
    public static void main(String[] args) {
        Television television = new Television("Toshiba", "Full HD", "4K", false);
        StatusTest statusTest = new StatusTest();

        System.out.println("Television company: " + television.company + " , Resolution: " + television.resolution
                + " ,Display: " + television.display + " ,Television status: " + television.on);

        statusTest.turnOn(television);

        statusTest.showStatus(television);

        statusTest.turnOff(television);

        statusTest.showStatus(television);

    }

}
