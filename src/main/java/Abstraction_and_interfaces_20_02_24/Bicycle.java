package Abstraction_and_interfaces_20_02_24;

public final class Bicycle extends WheeledTransport {
    private String type;

    public Bicycle(String type) {
        this.type = type;
    }

    public Bicycle(int wheelCount, double maxSpeed, String type) {
        super(wheelCount, maxSpeed);
        this.type = type;
    }

    private void useBikeKlaxon() {
        System.out.println("Ring-Ring");
    }

    @Override
    public void service() {
        super.service();
        attachmentsService();
        useBikeKlaxon();
    }

    private void attachmentsService() {
        System.out.println("Обслужено навесное оборудование велосипеда типа " + type);
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
