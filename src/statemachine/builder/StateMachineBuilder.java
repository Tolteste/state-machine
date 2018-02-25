/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statemachine.builder;

import statemachine.model.ComparisonOperator;
import statemachine.model.MachineMetaModel;
import statemachine.model.Operation;
import statemachine.model.State;
import statemachine.model.Transition;

/**
 *
 * @author steve
 */
public class StateMachineBuilder implements StateMachineInterface {

    private final MachineMetaModel stateMachine = new MachineMetaModel();

    private State stateScope;
    private Transition transitionScope;

    private boolean flagToStateSet;

    public StateMachineBuilder() {
        this.stateScope = null;
        this.transitionScope = null;
        this.flagToStateSet = true;
    }

    @Override
    public MachineMetaModel build() {
        return stateMachine;
    }

    @Override
    public StateMachineBuilder state(String name) {
        if (flagToStateSet == false) {
            throw new Error("Transition \"" + transitionScope.getName() + "\" doesn't have "
                    + "ending state. Set it by using \"to()\" method.");
        }
        stateScope = stateMachine.addState(name);
        transitionScope = null;
        return this;
    }

    @Override
    public StateMachineBuilder transition(String name) {
        if (flagToStateSet == false) {
            throw new Error("Transition \"" + transitionScope.getName() + "\" doesn't have "
                    + "ending state. Set it by using \"to()\" method.");
        }
        transitionScope = stateScope.addTransition(name);
        flagToStateSet = false;
        return this;
    }

    @Override
    public StateMachineBuilder to(String name) {
        if (this.stateScope == null) {
            throw new Error("First define a state before setting ending "
                    + "state \"" + name + "\" of a transition.");
        }
        if (this.transitionScope == null) {
            throw new Error("In definition of state: " + stateScope.getName()
                    + "; Define transition before setting ending state \"" + name
                    + "\" of a transition.");
        }
        // Checking if ending state exists, if not create a new one
        State toState = null;
        if (!stateMachine.hasState(name)) {
            toState = stateMachine.addState(name);
        } else {
            toState = stateMachine.getState(name);
        }
        transitionScope.setToState(toState);
        flagToStateSet = true;
        return this;
    }

    @Override
    public StateMachineBuilder set(String name, int value) {
        transitionScope.setEffect(name, Operation.SET, value);
        return this;
    }

    @Override
    public StateMachineBuilder increment(String variableName) {
        transitionScope.setEffect(variableName, Operation.ADD, 1);
        return this;
    }

    @Override
    public StateMachineBuilder decrement(String variableName) {
        transitionScope.setEffect(variableName, Operation.SUBTRACT, 1);
        return this;
    }

    @Override
    public StateMachineBuilder subtract(String variableName, String subtrahend) {
        transitionScope.setEffect(variableName, Operation.SUBTRACT, subtrahend);
        return this;
    }

    @Override
    public StateMachineBuilder subtract(String variableName, int subtrahend) {
        transitionScope.setEffect(variableName, Operation.SUBTRACT, subtrahend);
        return this;
    }

    @Override
    public StateMachineBuilder add(String variableName, String addend) {
        transitionScope.setEffect(variableName, Operation.ADD, addend);
        return this;
    }

    @Override
    public StateMachineBuilder add(String variableName, int addend) {
        transitionScope.setEffect(variableName, Operation.ADD, addend);
        return this;
    }

    @Override
    public StateMachineBuilder variable(String name, int value) {
        stateMachine.addVariable(name, value);
        return this;
    }

    @Override
    public StateMachineBuilder when(String leftVariable, ComparisonOperator operator, String rightVariable) {
        transitionScope.setCondition(leftVariable, operator, rightVariable);
        return this;
    }

    @Override
    public StateMachineBuilder when(String leftVariable, ComparisonOperator operator, int rightOperand) {
        transitionScope.setCondition(leftVariable, operator, rightOperand);
        return this;
    }
}
