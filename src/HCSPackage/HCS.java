package HCSPackage;


public class HCS {
 
    private int age;
    private String name, icNum, gender, cause, disease;
    
    public HCS (String icNum, String name, int age, String gender, String disease, String cause) {
    
    this.gender = gender;
    this.disease = disease;
    this.cause = cause;
    this.age = age;
    this.name = name;
    this.icNum = icNum;
    
}
    
    public String getName(){
        
        return name;
        
    }
    
    public String getIcNum(){
        
        return icNum;
        
    }
    
    public int getAge(){
        
        return age;
        
    }
    
    public String getGender(){
        
        return gender;
        
    }
    
    public String getDisease(){
        
        return disease;
        
    }
    
    public String getCause(){
        
        return cause;
        
    }
    
    public void setCause(String newCause){
        
        cause = newCause;
        
    }
    
    public void setDisease(String newDisease){
        
        disease = newDisease;
        
    }
    
}
