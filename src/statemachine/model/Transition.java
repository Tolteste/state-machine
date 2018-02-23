/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statemachine.model;

/**
 *
 * @author steve
 */
public class Transition {

    private State toState;
    private final String name;

    public Transition(String name) {
        this.name = name;
        this.toState = null;
    };
    
    public void setToState(State state) {
        this.toState = state;
    }
    
    public String getName(){
        return this.name;
    }
}
