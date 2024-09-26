package Cinema;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Category {
    private String id;
    private String type_id;
    private Date dateOnAir;
    private String name;
    private int soTap;

    public Category(String id, String type_id, String dateOnAir, String name, int soTap) throws ParseException {
        this.id = id;
        this.type_id = type_id;
        this.dateOnAir = new SimpleDateFormat("dd/MM/yyyy").parse(dateOnAir);
        this.name = name;
        this.soTap = soTap;
    }

    public String getType_id() {
        return type_id;
    }

    public String toString(){
        return id + " " + 
    }
}
