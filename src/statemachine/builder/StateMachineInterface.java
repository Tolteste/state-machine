/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statemachine.builder;

import statemachine.model.MachineMetaModel;

/**
 *
 * @author Bc. Štefan Töltési
 */
public interface StateMachineInterface {
    public MachineMetaModel build();

    /**
     * Adds a state in our statemachine representaion
     * @param name name that identifies state
     * @return StateMachineBuilder with added statemachine state
     */
    public StateMachineBuilder state(String name);

    /**
     * Adds a transition into our stetmachine representaiton
     * @param name name that identifies transition
     * @return StateMachineBuilder with added statemachine transition
     */
    public StateMachineBuilder transition(String name);
    
    /**
     * Defines ending state of a transition
     * @param name name that identifies ending state of transition
     * @return StateMachineBuilder with added statemachine transition end
     */
    public StateMachineBuilder to(String name);
    
    /**
     * Adds an variable in our statemachine representaion
     * @param name name that identifies variable
     * @return StateMachineBuilder with added statemachine variable
     */
    public StateMachineBuilder variable(String name);
    
    /**
     * Sets a variable of statemachine to a certain value 
     * @param name name of a variable that we are setting
     * @param value 
     * @return StateMachineBuilder with set variable
     */
    public StateMachineBuilder set(String name, int value);
}
