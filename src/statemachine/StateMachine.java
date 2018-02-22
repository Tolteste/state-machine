/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statemachine;

import statemachine.builder.StateMachineBuilder;

/**
 *
 * @author steve
 */
public class StateMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StateMachineBuilder builder = new StateMachineBuilder();
        builder.state("insert coins").transition("coin inserted");//.to("insert coins").build();
    }   
}
