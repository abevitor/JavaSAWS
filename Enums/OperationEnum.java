package Enums;

import java.util.function.BiFunction;

public enum OperationEnum {

    SUM((Double v1, Double v2) -> v1 + v2, "+"),

    SUBTRACTION ((Double v1, Double v2) -> v1 - v2, "-"),

    MULTIPLY ((Double v1, Double v2) -> v1 * v2, "*"),

    DIVISION ((Double v1, Double v2) -> v1 / v2, "/");

    private final BiFunction<Double, Double, Double> calculate;

    private final String symbol;

    OperationEnum(BiFunction <Double, Double, Double> calculate, String symbol){
        this.calculate = calculate;
        this.symbol = symbol;
    }

    public BiFunction<Double, Double, Double> getCalculate(){
        return calculate;
    }

    public String getSymbol(){
        return symbol;
    }
    
}
