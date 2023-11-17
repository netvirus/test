public class Computer {

    private int cpu;
    private int memory;
    private String videoCard;
    private int ssd;

    public Computer() {
    }

    public Computer(int cpu, int memory, String videoCard, int ssd) {
        this.cpu = cpu;
        this.memory = memory;
        this.videoCard = videoCard;
        this.ssd = ssd;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }
}
