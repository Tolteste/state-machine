/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statemachine.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author steve
 */
public class MachineMetaModel {

    private final Map<String, State> states = new HashMap<>();
    private final Map<String, Variable> variables = new HashMap<>();

    public State addState(String name) {
        State state = new State(name);
        states.put(name, state);
        return state;
    }

    public void addVariable(String name) {
        if (variables.containsKey(name)) {
            throw new Error("State with name " + name + " already exists. Please "
                    + "use unique name for a state.");
        }
        Variable variable = new Variable(name);
        variables.put(name, variable);
    }

    public void setToState(String fromStateName, String transitionName, String toStateName) {
        /*
        First check if ending state of  transition exists. If not then create a 
        new one.
         */
        State toState = null;
        if (!states.containsKey(toStateName)) {
            toState = addState(toStateName);
        } else {
            toState = states.get(toStateName);
        }
        State fromState = states.get(fromStateName);
        fromState.setToState(transitionName, toState);
    }
}
