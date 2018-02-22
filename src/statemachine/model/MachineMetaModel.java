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

    public void addState(String name) {
        State state = new State(name);
        states.put(name, state);
    }
}
