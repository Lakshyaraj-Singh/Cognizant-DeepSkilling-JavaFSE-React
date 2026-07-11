package com.cognizant.springrest.model;

public class Country {
    private String code;
    private String name;

    public Country(){
        

    }
    public void setCode(String code){
        this.code=code;
        
    }
    public void setName(String name){
        this.name=name;
        
    }
    public String getName(){
        return name;
        
    }
    public String getCode(){
        return code;
        
    }
    @Override
public String toString() {
    return "Country{" +
            "code='" + code + '\'' +
            ", name='" + name + '\'' +
            '}';
}
    
}
