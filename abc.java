import java.util.*;
class Employee
{
    String name,address;
    int age,p_num,salary;
    Scanner sc=new Scanner(System.in);
    void read()
    {
        System.out.println("Enter name");
        name=sc.nextLine();
        System.out.println("Enter address");
        address=sc.nextLine();
        System.out.println("Enter age");
        age=sc.nextInt();
        System.out.println("Enter phone number");
        p_num=sc.nextInt();
        System.out.println("Enter salary");
        salary=sc.nextInt();
    }
    void print_Salary()
    {
        System.out.println("Salary is:"+salary);
    }
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);
        System.out.println("Age:"+age);
        System.out.println("Phone number:"+p_num);
    }
}
class Officer extends Employee
{
    String specialization;
    void officerdetails()
    {
        sc.nextLine();
        System.out.println("Enter specialization");
        specialization=sc.nextLine();
    }
    void printofficer()
    {
        System.out.println("Specialization:"+specialization);
    }
}
class Manager extends Employee
{
    String department;
    void managerdetails()
    {
        sc.nextLine();
        System.out.println("Enter department");
        department=sc.nextLine();
    }
    void printmanager()
    {
        System.out.println("Department:"+department);
    }
}
class abc
{
    public static void main(String args[])
    {
        Officer off=new Officer();
        System.out.println("Enter officer details:");
        off.read();
        off.officerdetails();
        System.out.println("Officer details are:");
        off.display();
        off.print_Salary();
        off.printofficer();
        Manager man=new Manager();
        System.out.println("Enter manager details:");
        man.read();
        man.managerdetails();
        System.out.println("Manager details are:");
        man.display();
        man.print_Salary();
        man.printmanager();
    }
}
