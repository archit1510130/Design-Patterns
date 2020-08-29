package Patterns.Chain_of_Responsiblity;

public class Request {

    private int num1;
    private int num2;

    private String cal_type;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getCal_type() {
        return cal_type;
    }

    public void setCal_type(String cal_type) {
        this.cal_type = cal_type;
    }

    public Request(int num1, int num2, String cal_type) {
        this.num1 = num1;
        this.num2 = num2;
        this.cal_type = cal_type;
    }

    
    
}