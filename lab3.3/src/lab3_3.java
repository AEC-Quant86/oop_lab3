
public class lab3_3 {   

    public static void main(String[] args) {
        
       sClass test1 = new sClass(1);
       secondClass test2 = new secondClass(2,'2');
       secondClass test3 = new thirdClass(3,'3', "Test");
       
       System.out.println(test1.toString());
       System.out.println(test2.toString());
       System.out.println(test3.toString());
    }
}

class sClass {
    
    public int f1;
    
    public void setF(int f1) {
        this.f1 = f1;
    }
    
    sClass(int f1) {
        this.f1 = f1;
    }
    
    @Override
    public String toString() {
        
        return "sClass. Field f1 = " + f1;
    }
}

class secondClass extends sClass {
    
    public char f2 = ' ';
    
    secondClass (int f1, char f2) {
        super(f1);
        this.f2 = f2;
    }
    
    public void setF(int f1, char f2) {
        super.setF(f1);
        this.f2 = f2;
    }
    
 public String toString() {
        
        return "secondClass. field f1 = " + super.f1 + " field f2 = " +f2 ;
    } 
}

class thirdClass extends secondClass {
    
    public String f3 = "";
    
    thirdClass(int f1, char f2, String f3) {
        super(f1, f2);
        this.f3 = f3;
    }
    
    public void setF(int f1, char f2, String f3) {
        super.setF(f1, f2);
        this.f3 = f3;
    }
    
 public String toString() {
        
        return "thirdClass. field f1 = " + super.f1 + " field f2 = " + super.f2 + " field f3 = " + f3 ;
    } 
    
}
