 class student{
    String name;
    int age;
    void eat(){
        System.out.println("ye hai fun");
    }
    // student(){
    //     System.out.println("constructor");
    // }
    // student(String n,int a){
    //     name = n;
    //     age =a;
    //     System.out.println(name+" "+ age);

    // }
    
    student(int age){
        this.age=age;
    }
    void sum(){
        System.out.println(age);
    }

}
class hello{
    void print(){
        System.out.println("new class");
    }
}

 public class a5 {
    public static void main(String[] args) {
        student obj = new student(23);
        // obj.eat();
        //System.out.println(obj);
        obj.sum();
        hello obj1 = new hello();
        obj1.print();
    }
}
