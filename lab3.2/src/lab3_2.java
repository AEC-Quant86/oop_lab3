
public class lab3_2 {   

    public static void main(String[] args) {
        
       sClass test1 = new sClass("First test");
       secondClass test2 = new secondClass("Second test" , 24);
       
       System.out.println(test1.toString());
       System.out.println(test2.toString());
       
       test2.setFields();
       System.out.println(test2.toString());
       
       test2.setFields("test2");
       System.out.println(test2.toString());
       
       test2.setFields(3);
       System.out.println(test2.toString());
       
       
       test2.setFields("test4", 4);
       System.out.println(test2.toString());
       
      // System.out.println(test3.toString());
    }
}

class sClass {
    
    private String _s1;
    private int _len;
    
    public void set_s1(String _s1) {
        this._s1 = _s1;
    }
    
    public int get_len() {
        _len = _s1.length();
        return _len;
    }
    
    public String getS1() {
        return _s1;
    }
    
    sClass(String _s1) {
        this._s1 = _s1;
    }
    
    @Override
    public String toString() {
        
        return "sClass. Field s1 = " + _s1 + "  l = " + get_len();
    }
}

class secondClass extends sClass {
    
    public int i;
    
    secondClass (String _s1, int i) {
        super(_s1);
        this.i = i;

    }
    
    void setFields () {
        super.set_s1("woFields");
        i = 0;
    }
    
    void setFields (String s) {
        super.set_s1(s);
    } 
    
    void setFields (int i) {
        this.i = i;
    } 
    
    void setFields (String s, int i) {
        super.set_s1(s);
        this.i = i;
    } 
    
    
 public String toString() {
        
        return "secondClass. field s1 = " + getS1() + " i_open = " + i ;
    }
    
}
