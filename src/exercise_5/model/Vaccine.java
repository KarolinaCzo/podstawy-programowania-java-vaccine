package exercise_5.model;

public class Vaccine {
    private String producer;
    private long serialNumber;
    private boolean isVaccinated;

    public Vaccine(String producer, long serialNumber, boolean isVaccinated) {
        this.producer = producer;
        this.serialNumber = serialNumber;
        this.isVaccinated = isVaccinated;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

}
