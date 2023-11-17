public class StartTest {
    public static void main(String[] args) {

        Computer computer = new Computer(4, 32, "Nvidia", 256);

        Computer computer2 = new Computer();
        computer2.setCpu(12);
        computer2.setSsd(512);
        computer2.setMemory(64);
        computer2.setVideoCard("Radion");

        System.out.println("Computer1: " + computer);

        System.out.println("Computer2: CPU: " + computer2.getCpu() + " Memory: " + computer2.getMemory() + " Videocard: " + computer2.getVideoCard() + " SSD: " + computer2.getSsd());
    }
}
