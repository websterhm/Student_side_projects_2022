public class Equation {

    public Equation(){}

    private int intA;
    private int intB;
    private String operator;

    public int getIntA() {
        return intA;
    }

    public void setIntA(int intA) {
        this.intA = intA;
    }

    public int getIntB() {
        return intB;
    }

    public void setIntB(int intB) {
        this.intB = intB;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void makeEquation(String operator, int intA, int intB){
        this.operator = operator;
        this.intA = intA;
        this.intB = intB;
    }

}
