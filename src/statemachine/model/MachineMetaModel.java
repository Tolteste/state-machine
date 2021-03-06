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
    private final Map<String, Integer> variablesInitial = new HashMap<>();

    /**
     * Adds a new state to a map of all states
     *
     * @param name key for a state
     * @return state with param name
     */
    public State addState(String name) {
        if (states.containsKey(name)) {
            return states.get(name);
        }
        State state = new State(name);
        states.put(name, state);
        return state;
    }

    /**
     * Adds a variable into a map of all variables
     *
     * @param name key for accessing variable
     * @param value default value for variable
     */
    public void addVariable(String name, int value) {
        if (variablesInitial.containsKey(name)) {
            throw new Error("State with name " + name + " already exists. Please "
                    + "use unique name for a state.");
        }
        variablesInitial.put(name, value);
    }

    public boolean hasState(String name) {
        return states.containsKey(name);
    }

    public State getState(String name) {
        return states.get(name);
    }
}
