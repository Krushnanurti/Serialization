import java.io.*;

public class Student implements Serializable {
    private String name;
    private String lastName;

    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s=new Student("Krishnamurti","Wartalkar");
        FileOutputStream f=new FileOutputStream("/home/hp/Desktop/Practice/demo1.txt");
        ObjectOutputStream o=new ObjectOutputStream(f);
        o.writeObject(s);
        o.close();
        f.close();
        Student k;
        FileInputStream in=new FileInputStream("/home/hp/Desktop/Practice/demo1.txt");
        ObjectInputStream ob=new ObjectInputStream(in);
        k= (Student) ob.readObject();
        System.out.println("new serialized object " + k);
        ob.close();
        in.close();
    }
}