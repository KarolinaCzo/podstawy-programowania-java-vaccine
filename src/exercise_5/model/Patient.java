package exercise_5.model;

import java.util.Objects;

public class Patient implements Comparable<Patient> {
    public String name;
    public String lastName;
    public long pesel;
    public Vaccine vaccine;

    public Patient(String name, String lastName, long pesel, Vaccine vaccine) {
        this.name = name;
        this.lastName = lastName;
        this.pesel = pesel;
        this.vaccine = vaccine;
    }

    @Override
    public boolean equals(Object o) {
        Patient patient = (Patient) o;
        return pesel == patient.pesel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesel);
    }


    @Override
    public int compareTo(Patient patient) {
        return Long.compare(this.vaccine.getSerialNumber(), patient.vaccine.getSerialNumber());
    }
}
