/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statemachine.builder;

import statemachine.model.MachineMetaModel;
import statemachine.model.State;

/**
 *
 * @author steve
 */
public class StateMachineBuilder implements StateMachineInterface {

    private MachineMetaModel stateMachine = new MachineMetaModel();

    private State stateScope;

    @Override
    public void build() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public StateMachineBuilder state(String name) {
        stateScope = stateMachine.addState(name);
        return this;
    }

    @Override
    public StateMachineBuilder transition(String name) {
        stateScope.addTransition(name);
        return this;
    }

    @Override
    public StateMachineBuilder to(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
