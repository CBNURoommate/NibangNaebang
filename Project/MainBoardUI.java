package Project;

public class Model {
    String name;
    String birth;
    String tel;
    int a;
    int b;
    int c;
    int d;
    int num;
    

    public Model(String name, String birth, String tel, int a, int b, int c, int d) {
        this.birth = birth;
        this.name = name;
        this.tel = tel;
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }

    public String getName() {
        return name;
    }

    public String getBirth() {
        return birth;
    }

    public String getTel() {
        return tel;
    }
    
    public int getA() {
        return a;
    }
    
    public int getB() {
        return b;
    }
    
    public int getC() {
        return c;
    }
    
    public int getD() {
        return d;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public void setA(int num) {
        this.a = num;
    }
    
    public void setB(int num) {
        this.b = num;
    }
    
    public void setC(int num) {
        this.c = num;
    }
    
    public void setD(int num) {
        this.c = num;
    }
}
