package DiemExeption;


import static DiemExeption.IO.VaoRa;

public class Main {
    public static void main(String[] args){

        try{
            double x = VaoRa();
            System.out.println(x);
        }
        catch (DiemException e){
            System.out.println(e.toString());
        }

    }
}
