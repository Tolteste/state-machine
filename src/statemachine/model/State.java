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
public class State {

    private String name;
    private final Map<String, Transition> transitions = new HashMap<>();


    State(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Transition addTransition(String name) {
        Transition transition = new Transition(name);
        transitions.put(name, transition);
        return transition;
    }

    public void setToState(String transName, State state) {
        Transition trans = transitions.get(transName);
        trans.setToState(state);
    }
}
