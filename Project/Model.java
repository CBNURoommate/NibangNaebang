package Project;

public class Model {
    String id;
    String name;
    String gender;
    String dom;
    int hakbun;
    int age;
    String smoking;
    String jam;
    String dpt;
    

    public Model(String id, String name, int gender ,int dom, int hakbun, int age, int smoking,int jam, int dpt) {
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
        
        switch(jam) {
        case 0:
     	    this.jam="x";
     	    break;
        case 1:
            this.jam="o";
            break;      
        }
        
        switch(dpt) {
        case 1:
     	    this.dpt="인문대";
     	    break;
        case 2:
            this.dpt="사과대";
            break;  
        case 3:
     	    this.dpt="자과대";
     	    break;
        case 4:
     	    this.dpt="경영대";
     	    break;
        case 5:
     	    this.dpt="공과대";
     	    break;
        case 6:
     	    this.dpt="전정대";
     	    break;
        case 7:
     	    this.dpt="농생대";
     	    break;
        case 8:
     	    this.dpt="사범대";
     	    break;
        case 9:
     	    this.dpt="생과대";
     	    break;
        case 10:
     	    this.dpt="수의대";
     	    break;
        case 11:
     	    this.dpt="의과대";
     	    break;
        case 12:
     	    this.dpt="자율대";
     	    break; 
        }

        
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
    
    public String getJam() {
        return jam;
    }

    public String getDpt() {
        return dpt;
    }

    
}
