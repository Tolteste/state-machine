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
        builder.variable("kokot", 0).variable("pica", 2)
                .state("open")
                    .transition("close_doors").to("close").increment("kokot")
                .state("close").transition("test").to("open").add("kokot","pica");
    }   
}
