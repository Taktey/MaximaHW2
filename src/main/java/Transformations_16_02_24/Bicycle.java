package Transformations_16_02_24;

public final class Bicycle extends WheeledTransport {
    private String type;

    public Bicycle(String type) {
        this.type = type;
    }

    public Bicycle(int wheelCount, double maxSpeed, String type) {
        super(wheelCount, maxSpeed);
        this.type = type;
    }
    public void useBikeKlaxon(){
        System.out.println("Ring-Ring");
    }

    @Override
    public void service() {
        super.service();
        System.out.println("Обслужено навесное оборудование велосипеда типа " + type);
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
