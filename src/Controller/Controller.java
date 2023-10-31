package Controller;

import Model.Student;
import View.Menu;

import java.util.*;

public class Controller {
    ArrayList<Student> arr = new ArrayList<>();

    public void addStudent(Student student){
        //student.input();
        arr.add(student);
    }

    public void removeStudentById(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID:");
        int id = sc.nextInt();
        boolean found = false;

        for (Student st : arr) {
            if (st.getId() == id) {
                arr.remove(st);
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Sinh viên có ID " + id + " đã được xóa.");
        } else {
            System.out.println("Không tìm thấy sinh viên có ID " + id);
        }
    }
    public void showAll(){
        for (Student st : arr){
//           System.out.println("id: "+ st.id + "name: " + st.name + "address: " +st.address + "diem tb: "+ st.diemTB);
            System.out.println(st);
        }
    }

    public void findStudentById(){
        Scanner sc = new Scanner(System.in);
        System.out.println("input id");
        int id = sc.nextInt();
        for (Student st : arr){
            if (st.getId() == id){
                showAll();
            }else {
                System.out.println("not found student");
            }

        }
    }
    public void sortByMark(){
        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getDiemTB() > o2.getDiemTB())
                    return 1;
                else if (o1.getDiemTB() < o2.getDiemTB())
                    return -1;
                else
                    return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });

    }
    public void menuController(){
        Menu menu = new Menu();
        menu.menuController();
        boolean isChecked = true;
        Scanner sc = new Scanner(System.in);
        while (isChecked){
            System.out.println("xin moi chon");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    Student student = new Student();
                    student.input();
                    addStudent(student);
                    showAll();
                    break;
                case 2:
                    removeStudentById();
                    showAll();
                    break;
                case 3:
                    findStudentById();
                    break;
                case 4:
                    sortByMark();
                    break;
                case 5:
                    isChecked = false;

            }
        }
    }
}

