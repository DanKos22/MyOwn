package ie.atu.week11;

public class Employee implements Reportable{
    private String name;
    private String id_num;

    public Employee() {
    }

    public Employee(String name, String id_num) {
        this.name = name;
        this.id_num = id_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId_num() {
        return id_num;
    }

    public void setId_num(String id_num) {
        this.id_num = id_num;
    }
}
