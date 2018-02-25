/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statemachine.model;

/**
 *
 * @author steve
 */
public class Transition {

    private State toState;
    private final String name;
    private Effect effect;
    private Condition cond;

    public Transition(String name) {
        this.name = name;
        this.toState = null;
    }

    public void setToState(State state) {
        this.toState = state;
    }

    public String getName() {
        return this.name;
    }

    public void setEffect(String variableName, Operation operation, Object operand) {
        this.effect = new Effect(name, operation, operand);
    }

    public void setCondition(String variableName, ComparisonOperator operator, Object leftOperand) {
        this.cond = new Condition(variableName, operator, leftOperand);
    }
}
