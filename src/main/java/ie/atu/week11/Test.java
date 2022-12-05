package ie.atu.week11;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Employee Mike = new Employee();
        Mike.setName("Mike");
        Mike.setId_num("777");

        ArrayList<String> Reportable = new ArrayList<>();

        Reportable.add(Mike.getName());
        Reportable.add(Mike.getId_num());
        System.out.println("ArrayList: " + Reportable);






    }
}
