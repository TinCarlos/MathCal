public class Calculator{
    private int operand1;

    public Calculator(int op1){
        this.operand1 = op1;
    }
    public Calculator(){

    }

    public int add(Calculator op2){
        return operand1 + op2.operand1;
    }

    public int subtract(Calculator op2){
        return operand1 - op2.operand1;
    }

    public int divide(Calculator op2){
        return operand1 / op2.operand1;
    }

    public int multiply(Calculator op2){
        return operand1 * op2.operand1;
    }
    public String toString(){
        return "" + operand1;
    }
     
    
}
