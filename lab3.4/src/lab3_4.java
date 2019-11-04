
public class lab3_4 {   

    public static void main(String[] args) {
        
       sClass test1 = new sClass('1');
       secondClass test2 = new secondClass('2',"Second");
       thirdClass test3 = new thirdClass('3',"third", 3);
       thirdClass test4 = new thirdClass(test3);
       
       System.out.println(test1.toString());
       System.out.println(test2.toString());
       System.out.println(test3.toString());
       System.out.println(test4.toString());
       
    }
}

class sClass {
    
    public char f1;
    
    public void setF(char f1) {
        this.f1 = f1;
    }
    
    sClass(char f1) {
        this.f1 = f1;
    }
    
    sClass(sClass in) {
        this(in.f1);
    }
    
    @Override
    public String toString() {
        
        return "sClass. Field f1 = " + f1;
    }
}

class secondClass extends sClass {
    
    public String f2 = "";
    
    secondClass (char f1, String f2) {
        super(f1);
        this.f2 = f2;
    }
    
    public secondClass(secondClass in) {
        this(in.f1, in.f2);
    }
    
    public void setF(char f1, String f2) {
        super.setF(f1);
        this.f2 = f2;
    }
    
 public String toString() {
        
        return "secondClass. field f1 = " + super.f1 + " field f2 = " +f2 ;
    } 
}

class thirdClass extends secondClass {
    
    public int f3 = 0;
    
    thirdClass(char f1, String f2, int f3) {
        super(f1, f2);
        this.f3 = f3;
    }
    
    public thirdClass(thirdClass in) {
        this(in.f1, in.f2, in.f3);
    }
    
    public void setF(char f1, String f2, int f3) {
        super.setF(f1, f2);
        this.f3 = f3;
    }
    
 public String toString() {
        
        return "thirdClass. field f1 = " + super.f1 + " field f2 = " + super.f2 + " field f3 = " + f3 ;
    } 
    
}
