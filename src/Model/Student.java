package Model;

import utils.Validator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {
    int id;
    String name;
    String address;
    double diemTB;

    public Student(){}

    public Student(int id, String name, String address, double diemTB) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.diemTB = diemTB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public void input()  {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


            this.id = Validator.getInt(bf,"ID");
            this.name = Validator.getString(bf,"name");
            this.address = Validator.getString(bf, "address");
            this.diemTB = Validator.getDouble(bf, "diem TB");

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", diemTB=" + diemTB +
                '}';
    }
}

