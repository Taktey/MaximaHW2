package Project_patterns_01_03_24;

public final class Car extends MotorTransport {
    private String brand;
    private String model;

    public Car(Builder builder) {
        super(builder.wheelCount, builder.maxSpeed, builder.engineType);
        this.brand = builder.brand;
        this.model = builder.model;
    }

    private void useCarKlaxon() {
        System.out.println("beep-beep");
    }

    private void carService() {
        System.out.println("Обслужен автомобиль, марка: " + brand + " модель: " + model);
    }

    @Override
    public void service() {
        super.service();
        carService();
        useCarKlaxon();
    }

    public static class Builder {
        private String brand;
        private String model;
        private int wheelCount;
        private String engineType;
        private int maxSpeed;

        public Builder maxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder wheelCount(int wheelCount) {
            this.wheelCount = wheelCount;
            return this;
        }

        public Builder engineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
