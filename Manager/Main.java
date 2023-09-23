package Manager;

import Entity.Student;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        ArrayList<Student> ls = new ArrayList<>();
        Validation validation = new Validation();
        ls.add(new Student("1", "Nguyen Ngoc Duy", "Spring", "java"));
        ls.add(new Student("2", "Nguyen Trong Tri", "Summer", ".net"));
        ls.add(new Student("3", "Nguyen Tuan Anh", "Spring", "c/c++"));
        int count = 3;
        
        while (true) {
            
            Manager.menu();
            int choice = validation.checkInputIntLimit(1, 5);
            switch (choice) {
                case 1:
                    Manager.createStudent(count, ls);
                    break;
                case 2:
                    Manager.findAndSort(ls);
                    break;
                case 3:
                    Manager.updateOrDelete(count, ls);
                    break;
                case 4:
                    Manager.report(ls);
                    break;
                case 5:
                    return;
            }

        }
    }

}
