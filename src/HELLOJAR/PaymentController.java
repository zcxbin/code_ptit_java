package HELLOJAR;

import java.util.ArrayList;
import java.util.Scanner;
import vn.edu.ptit.Invoice;
import vn.edu.ptit.Rule;
import vn.edu.ptit.Student;
import vn.edu.ptit.Subject;

public class PaymentController {
    private Invoice invoice;
    private Student student;
    private Subject subject;
    private Rule rule;
    public PaymentController() {
        Scanner sc = new Scanner(System.in);
        String maSV = sc.nextLine();
        String tenSV = sc.nextLine();
        int soMH = Integer.parseInt(sc.nextLine());
        student = new Student(maSV, tenSV);
        ArrayList<Subject> arrList = new ArrayList<>();
        while(soMH-- > 0){
            String maMH = sc.nextLine();
            String tenMH = sc.nextLine();
            int soTC = Integer.parseInt(sc.nextLine());
            arrList.add(new Subject(tenMH, maMH, soTC));
        }
        String soQD = sc.nextLine();
        String tenQD = sc.nextLine();
        double hocPhi = Double.parseDouble(sc.nextLine());
        int sum = 0;
        for(Subject s : arrList){
            sum += hocPhi * s.getCredit();
        }
        rule = new Rule(soQD, tenQD, sum);
        invoice = new Invoice(rule);
        invoice.setAlSubject(arrList);
        invoice.setAmount(sum);
        invoice.setSt(student);
    }
    public Invoice getInvoice() {
        return invoice;
    }
}
