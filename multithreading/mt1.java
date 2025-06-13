package multithreading;
// class mythread extends Thread{
//     public void run(){
//         for(int i=1 ; i<=10;i++){
//             System.out.println(getName()+ "is running with priority");
//             Thread.yield();
//         }
//     }
// }
// public class mt1 {

//     // public static void main(String[] args) {
//     //     System.out.println("idhar dekho");
//     //     Thread t1 = new Thread(()-> {
//     //         System.out.println("hello");
//     //     });
//     //     Thread t2 = new Thread(()-> {
//     //         System.out.println("hiii");
//     //     });
//     //     t1.start();
//     //     t2.start();
//     //     t1.start();

//     public static void main(String[] args) {
//     mythread m1=new mythread();
//     mythread m2 = new mythread();
//     m1.setName("low priority thread");
//     m2.setName("high priority thread");
    
//     m1.setPriority(Thread.MIN_PRIORITY);
//     m2.setPriority(Thread.MAX_PRIORITY);
//     m1.start();
//     m2.start();

//}

