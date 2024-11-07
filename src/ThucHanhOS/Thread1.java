package ThucHanhOS;

public class Thread1 extends Thread{
    @Override
    public void run() {
        for(int i = 0; i <= 1000; i++){
            if(i % 9 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
