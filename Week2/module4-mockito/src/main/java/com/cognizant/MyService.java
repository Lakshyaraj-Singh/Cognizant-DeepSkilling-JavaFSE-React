package com.cognizant;

public class MyService {
    private ExternalApi api;

    MyService(ExternalApi api){
        this.api=api;
    }
    public String fetchData(){
        return api.getData();
    }
}
