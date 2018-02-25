/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statemachine.model;

/**
 *
 * @author Bc. Štefan Töltési
 */
class Condition {

    private final String variable;
    private final ComparisonOperator operator;
    private final Object rightOperand;

    public Condition(String variable, ComparisonOperator operator, Object rightOperand) {
        this.variable = variable;
        this.operator = operator;
        this.rightOperand = rightOperand;
    }
}
