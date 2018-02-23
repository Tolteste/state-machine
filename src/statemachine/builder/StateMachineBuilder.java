/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statemachine.builder;

import statemachine.model.MachineMetaModel;
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

    public StateMachineBuilder() {
        this.stateScope = null;
        this.transitionScope = null;
    }

    @Override
    public MachineMetaModel build() {
        return stateMachine;
    }

    @Override
    public StateMachineBuilder state(String name) {
        stateScope = stateMachine.addState(name);
        transitionScope = null;
        return this;
    }

    @Override
    public StateMachineBuilder transition(String name) {
        transitionScope = stateScope.addTransition(name);
        return this;
    }

    @Override
    public StateMachineBuilder to(String name) {
        if (this.stateScope == null) {
            throw new Error("First define a state before setting ending "
                    + "state " + name + " of a transition.");
        }
        if (this.transitionScope == null) {
            throw new Error("In definition of state: " + stateScope.getName()
                    + "; Define transition before setting ending state" + name
                    + " of a transition.");
        }
        // Checking if ending state exists, if not create a new one
        State toState = null;
        if (!stateMachine.hasState(name)) {
            toState = stateMachine.addState(name);
        }
        transitionScope.setToState(toState);
        //stateMachine.setToState(stateScope.getName(), transitionScope.getName(), name);
        return this;
    }

    @Override
    public StateMachineBuilder variable(String name) {
        stateMachine.addVariable(name);
        return this;
    }

    @Override
    public StateMachineBuilder set(String name, int value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
