package chapter04;

public class Computer {
    CPU cpu;
    Memory memory;
    VideoCard videoCard;
    int videoCardNum;
    float price;

    public Computer(CPU cpu, Memory memory, VideoCard videoCard) {
        this.cpu = cpu;
        this.memory = memory;
        this.videoCard = videoCard;
    }

    float totolPrice() {
        price = cpu.getCPUPrice() + memory.getMemoryPrice() + videoCard.getVideoCardPrice() * videoCardNum;
//        cpu.CPUPrice = 200;
        return price;
    }

    public static void main(String[] args) {

    }
}

class CPU {
    public String getCPUName() {
        return CPUName;
    }

    public void setCPUName(String CPUName) {
        this.CPUName = CPUName;
    }

    public int getCPUSlot() {
        return CPUSlot;
    }

    public void setCPUSlot(int CPUSlot) {
        this.CPUSlot = CPUSlot;
    }

    public float getCPUFrequency() {
        return CPUFrequency;
    }

    public void setCPUFrequency(float CPUFrequency) {
        this.CPUFrequency = CPUFrequency;
    }

    public void setCPUPrice(float CPUPrice) {
        this.CPUPrice = CPUPrice;
    }

    private String CPUName;
    private int CPUSlot;
    private float CPUFrequency;
    private float CPUPrice;

    float getCPUPrice() {
        return CPUPrice;
    }
}

class Memory {
    private String memoryName;
    private int memorySlot;
    private float memoryFrequency;
    private float MemoryPrice;

    float getMemoryPrice() {
        return MemoryPrice;
    }
}

class VideoCard {
    private String videoCardName;
    private int videoCardSlot;
    private float videoCardFrequency;
    private float videoCardPrice;

    float getVideoCardPrice() {
        return videoCardPrice;
    }
}