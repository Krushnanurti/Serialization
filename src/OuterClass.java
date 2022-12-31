public class OuterClass {
    public String name;
    public String LastName;

    public OuterClass(String name, String lastName) {
        this.name = name;
        LastName = lastName;
    }
    public void display()
    {
        System.out.println("LastName " + LastName + "Name" + name );
    }
    public class InnerClass{
        public int a,b;

        public InnerClass(int a, int b) {
            this.a = a;
            this.b = b;
        }
        public void display()
        {
            System.out.println("displaying a and b " + a  +  b);
        }
    }

    public static void main(String[] args) {
        OuterClass ref=new OuterClass("Krishnamurti","Wartalkar");
        OuterClass.InnerClass ref1=ref.new InnerClass(1,2);
        ref1.display();
        ref.display();
    }

}
