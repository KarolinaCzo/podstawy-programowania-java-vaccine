package exercise_5;

import exercise_5.model.Patient;
import exercise_5.model.Vaccine;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Patient aleksandraKlan = new Patient("Aleksandra", "Kaln", 78123546, new Vaccine("Moderna", 3234567, true));
        Patient sylwiaPac = new Patient("Sylwia", "Pac", 88123546, new Vaccine("Moderna", 2234567, false));
        Patient janKowalski = new Patient("Jan", "Kowalski", 98123546, new Vaccine("Moderna", 1234567, true));
        Patient janKowalskiKopia = new Patient("Jan", "Kowalski", 98123546, new Vaccine("Moderna", 1234567, true));

        HashSet<Patient> patients = new HashSet<>();
        patients.add(aleksandraKlan);
        patients.add(sylwiaPac);
        patients.add(janKowalski);
        patients.add(janKowalskiKopia);

        System.out.println("Klasa Patient dodana do HashSet-u - sprawdzamy równość po polu pesel");
        for(Patient patient : patients) {
            System.out.println(patient.name + ' ' + patient.lastName);
        }

        TreeSet<Patient> patientsSorted = new TreeSet<>();
        patientsSorted.add(aleksandraKlan);
        patientsSorted.add(sylwiaPac);
        patientsSorted.add(janKowalski);
        patientsSorted.add(janKowalskiKopia);

        System.out.println("Klasa Patient dodana do TreeSet-u - sortowanie po serialNumber z klasy Vaccine");
        for(Patient patient : patientsSorted) {
            System.out.println(patient.name + ' ' + patient.lastName);
        }
    }
}
