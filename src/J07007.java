import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class J07007 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        LinkedList<String> list = new LinkedList<>();
        while(sc.hasNext()){
            String s = sc.next().toLowerCase();
            if(!list.contains(s)){
                list.add(s);
            }
        }
        list.sort(String.CASE_INSENSITIVE_ORDER);
        for(String s : list){
            System.out.println(s);
        }
    }
}
