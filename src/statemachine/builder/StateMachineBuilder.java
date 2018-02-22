/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statemachine.builder;

import statemachine.model.MachineMetaModel;

/**
 *
 * @author steve
 */
public class StateMachineBuilder implements StateMachineInterface{
    private MachineMetaModel stateMachine = new MachineMetaModel();

    @Override
    public void build() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public StateMachineBuilder state(String name) {
        stateMachine.addState(name);
        return this;
    }

    @Override
    public StateMachineBuilder transition(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public StateMachineBuilder to(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public StateMachineBuilder variable(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public StateMachineBuilder set(String name, int value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
