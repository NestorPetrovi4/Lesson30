public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    public int executeFormula(int arg0, int arg1, Calculator.Operation operation){
        Double d = target.newFormula()
                .addOperand((double) arg0)
                .addOperand((double) arg1)
                .calculate(operation)
                .result();
        return (int)Math.round(d);
    }

    @Override
    public int sum(int arg0, int arg1) {
        return executeFormula(arg0, arg1, Calculator.Operation.SUM);
    }

    @Override
    public int mult(int arg0, int arg1) {
        return executeFormula(arg0, arg1, Calculator.Operation.MULT);
    }

    @Override
    public int pow(int arg0, int arg1) {
        return executeFormula(arg0, arg1, Calculator.Operation.POW);
    }

    @Override
    public int sub(int arg0, int arg1) {
        return executeFormula(arg0, arg1, Calculator.Operation.SUB);
    }
    @Override
    public int div(int arg0, int arg1) {
        return executeFormula(arg0, arg1, Calculator.Operation.DIV);
    }
}
