package org.example;

public class CountClass {

    static int totalCount;
    int instanceCount;

    public CountClass(){

    }
    public CountClass(int instanceCount){
        this.instanceCount = instanceCount;
    }

    public static void incrementTotalCount(){
        totalCount++;
    }
    public void incrementInstanceCount(){
        instanceCount++;
    }

    public String toString(){
        return "{totalCount=%d, instanceCount=%d}".formatted(totalCount,instanceCount);
    }
}
