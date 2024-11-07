package ThucHanhOS;

public class Thread2 extends Thread{
    @Override
    public void run() {
        for(int i = 0; i <= 1000; i++){
            if(i % 5 == 0)
                System.out.print(i + " ");
        }
    }
}
