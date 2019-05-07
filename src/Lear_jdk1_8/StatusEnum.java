package Lear_jdk1_8;

public enum StatusEnum {
    NEW(0),RUNNABLE(1);

    public int statusCode;

    StatusEnum(int statusCode){
        this.statusCode = statusCode;
    }
}
