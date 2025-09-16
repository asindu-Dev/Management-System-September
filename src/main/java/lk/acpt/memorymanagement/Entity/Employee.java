package lk.acpt.memorymanagement.Entity;

public class Employee {
    private int id_num;
    private String name;
    private String address;
    private String position;

    public Employee(int id_num, String name, String address, String position) {
        this.id_num = id_num;
        this.name = name;
        this.address = address;
        this.position = position;
    }

    public int getId_num() {
        return id_num;
    }

    public void setId_num(int id_num) {
        this.id_num = id_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
