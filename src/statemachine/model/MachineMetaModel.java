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
        if (states.containsKey(name)) {
            System.err.println("State with name " + name + " already exists. Please "
                    + "use unique name for a state.");
            return null;
        } else {
            State state = new State(name);
            states.put(name, state);
            return state;
        }
    }

    public void addVariable(String name) {
        if (variables.containsKey(name)) {
            System.err.println("Variable with name " + name + " already exists. Please "
                    + "use unique name for a variable.");
        } else {
            Variable variable = new Variable(name);
            variables.put(name, variable);
        }
    }
}
