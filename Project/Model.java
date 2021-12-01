package Project;

public class Model {
    String id;
    String name;
    String gender;
    String dom;
    int hakbun;
    int age;
    String smoking;
    

    public Model(String id, String name, int gender ,int dom, int hakbun, int age, int smoking) {
        this.id = id;
        this.name = name;

        
        switch(gender) {
            case 1:
            	this.gender="남자";
            	break;
            case 2:
                this.gender="여자";
                break;
        }
        
        switch(dom) {
           case 1:
        	    this.dom="개성재";
        	    break;
           case 2:
                this.dom="계영원";
                break;
           case 3:
                this.dom="양성재";
                break;
           case 4:
                this.dom="양진재";
                break;
           case 5:
                this.dom="양현재";
                break;
        }
        
        switch(smoking) {
        case 1:
     	    this.smoking="흡연";
     	    break;
        case 2:
            this.smoking="비흡연";
            break;
        
     }
        
        this.hakbun=hakbun;
        this.age=age;

        
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public String getGender() {
        return gender;
    }

    public String getDom() {
        return dom;
    }
    
    public int getHakbun() {
        return hakbun;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getSmoking() {
        return smoking;
    }

    
}
