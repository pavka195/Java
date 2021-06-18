package main.block02.lesson09;

public class Car  implements Cloneable{
    private String brandCar;
    private String modelCar;
    private Driver driverCar;

    public Car(String brandCar, String modelCar, Driver driverCar) {
        this.brandCar = brandCar;
        this.modelCar = modelCar;
        this.driverCar = driverCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public void setDriverCar(Driver driverCar) {
        this.driverCar = driverCar;
    }

    public Car clone() throws CloneNotSupportedException {
        Car newCar = (Car) super.clone();
        Driver newDriver = new Driver(driverCar.nameDriver);
        newCar.setDriverCar(newDriver);
        return newCar;
    }

    public String print() {
        return "Car{" +
                "brandCar='" + brandCar + '\'' +
                ", modelCar='" + modelCar + '\'' +
                ", nameDriver='" + driverCar.nameDriver + '\'' +
                '}';
    }

    static class Driver implements Cloneable {
        private String nameDriver;

        public Driver(String nameDriver) {
            this.nameDriver = nameDriver;
        }

        public void setNameDriver(String nameDriver) {
            this.nameDriver = nameDriver;
        }

        public Driver clone() throws CloneNotSupportedException {
            return (Driver) super.clone();
        }


        public String print() {
            return "Driver{" +
                    "nameDriver='" + nameDriver + '\'' +
                    '}';
        }
    }
}