/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statemachine.model;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author steve
 */
public class State {

    private String name;
    private final Set<Transition> transitions = new HashSet<>();

    State(String name) {
        this.name = name;
    }
}
