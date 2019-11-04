
public class lab3_5 {

    public static void main(String[] args) {
        
        sClass test1 = new sClass("first test");
        firstClass test2 = new firstClass("Second test", 2);
        secondClass test3 = new secondClass("test3", 'a');
        sClass test4 = new secondClass("test4", 'b');
        
        System.out.println(test1.toString());
        System.out.println(test2.toString());
        System.out.println(test3.toString());
        System.out.println(test4.toString());
        
    }
}

class sClass {
    
    protected String f1 = "";
    
    sClass(String f1) {
        this.f1 = f1;
    }
    
    public String toString() {
        return "sClass " + "f1 " + f1;
    }
}

class firstClass extends sClass {
    
    protected int f2_int;
    
    public firstClass(String f1, int f2_int) {
        super(f1);
        this.f2_int = f2_int;
    }
    
    public String toString() {
        return "firstClass " + "f1 " + f1 + " f2 " + f2_int;
    }
}

class secondClass extends sClass {
    
    protected char f3_char;
    
    public secondClass(String f1, char f3_char) {
        super(f1);
        this.f3_char = f3_char;
    }
    
    public String toString() {
        return "secondClass " + "f1 " + f1 + " f3 " + f3_char;
    }
}