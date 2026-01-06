package Basics;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String empNamme, int empId) {
        name = empNamme;
        id = empId;
    }

    Employee(String emname,double sal){
        name = emname;
        salary = sal;
    }

    public void test() {
        System.out.println("Employe name:" + name);
        System.out.println("Employe id:" + id);
        System.out.println("Employe salary:" + salary);
    }

}

public class Constructor {
    public static void main(String [] args){
        Employee e = new Employee("jeryy",23);
        e.test();
        Employee e1 = new Employee("poorna",2333.33);
        e1.test();
    }

}


