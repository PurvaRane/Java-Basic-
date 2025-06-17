package Multithreading;

class InterruptMethod extends Thread{
    @Override 
    public void run() {
        try{
            for(int i = 1;i<=3;i++){
                System.out.println("Thread t");
                sleep(1000);

            }

        }
        catch(InterruptedException e){

        }
}
}
class Main{
    public static void main(String[] args) {
        InterruptMethod m1 = new InterruptMethod();
        m1.start();
        m1.interrupt();
    }
}