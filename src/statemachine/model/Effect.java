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
class Effect {

    private final String affectedVariable;
    private final Operation operation;
    private final Object operandRight;

    public Effect(String affectedVariable, Operation operation, Object operandRight) {
        this.affectedVariable = affectedVariable;
        this.operation = operation;
        this.operandRight = operandRight;
    }
}
