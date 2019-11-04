
public class lab3_1 {	

    public static void main(String[] args) {
        
       sClass test1 = new sClass("First test");
       secondClass test2 = new secondClass("Second test");
       secondClass test3 = new secondClass("First test", "Second Test");
       
       System.out.println(test1.toString());
       System.out.println(test2.toString());
       System.out.println(test3.toString());
    }
}

class sClass {
    
    private String s1;
    
    public String getS1() {
        return s1;
    }
    
    sClass(String s1) {
        this.s1 = s1;
    }
    
    @Override
    public String toString() {
        
        return "sClass. Field s1 = " + s1;
    }
}

class secondClass extends sClass {
    
    private String s2 = "";
    
    secondClass (String s1, String s2) {
        super(s1);
        this.s2 = s2;
    }
    
    secondClass (String s1) {
        super(s1);
    } 
    
 public String toString() {
        
        return "secondClass. field s1 = " + getS1() + " " +s2 ;
    }
    
}
