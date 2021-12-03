package Project;

public class Model {
    String id;
    String name;
    String gender;
    String dom;
    String hakbun;
    String age;
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
        
        switch(hakbun) {
        case 14:
     	    this.hakbun="14";
     	    break;
        case 15:
     	    this.hakbun="15";
     	    break;
        case 16:
     	    this.hakbun="16";
     	    break;
        case 17:
     	    this.hakbun="17";
     	    break;
        case 18:
     	    this.hakbun="18";
     	    break;
        case 19:
     	    this.hakbun="19";
     	    break;
        case 20:
     	    this.hakbun="20";
     	    break;
        case 21:
     	    this.hakbun="21";
     	    break;
     	default:
     		break;
       }
        
        switch(age) {
        case 1996:
     	    this.age="1996";
     	    break;
        case 1997:
     	    this.age="1997";
     	    break;
        case 1998:
     	    this.age="1998";
     	    break;
        case 1999:
     	    this.age="1999";
     	    break;
        case 2000:
     	    this.age="2000";
     	    break;
        case 2001:
     	    this.age="2001";
     	    break;
        case 2002:
     	    this.age="2002";
     	    break;
        case 2003:
     	    this.age="2003";
     	    break;
     	default:
     		break;
       }
        
       
        
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
            this.dpt="사회과학대";
            break;  
        case 3:
     	    this.dpt="자연과학대";
     	    break;
        case 4:
     	    this.dpt="경영대";
     	    break;
        case 5:
     	    this.dpt="공과대";
     	    break;
        case 6:
     	    this.dpt="전자정보대";
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
     	    this.dpt="자율";
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
    
    public String getHakbun() {
        return hakbun;
    }
    
    public String getAge() {
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
