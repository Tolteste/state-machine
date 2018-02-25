/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statemachine.builder;

import statemachine.model.ComparisonOperator;
import statemachine.model.MachineMetaModel;

/**
 *
 * @author Bc. Štefan Töltési
 */
public interface StateMachineInterface {

    public MachineMetaModel build();

    /**
     * Adds a state in our statemachine representaion
     *
     * @param name name that identifies state
     * @return StateMachineBuilder with added statemachine state
     */
    public StateMachineBuilder state(String name);

    /**
     * Adds a transition into our stetmachine representaiton
     *
     * @param name name that identifies transition
     * @return StateMachineBuilder with added statemachine transition
     */
    public StateMachineBuilder transition(String name);

    /**
     * Defines ending state of a transition
     *
     * @param name name that identifies ending state of transition
     * @return StateMachineBuilder with added statemachine transition end
     */
    public StateMachineBuilder to(String name);

    /**
     * Adds an variable in our statemachine representaion
     *
     * @param name name that identifies variable
     * @param value default value of variable
     * @return StateMachineBuilder with added statemachine variable
     */
    public StateMachineBuilder variable(String name, int value);

    /**
     * Sets a variable of statemachine to a certain value
     *
     * @param name name of a variable that we are setting
     * @param value
     * @return StateMachineBuilder with set variable
     */
    public StateMachineBuilder set(String name, int value);

    /**
     * Increment specified variable when transition enabled
     *
     * @param variableName name of incremented variable
     * @return StateMachineBuilder
     */
    public StateMachineBuilder increment(String variableName);

    /**
     * Decrements specified variable when transition enabled
     *
     * @param variableName
     * @return
     */
    public StateMachineBuilder decrement(String variableName);

    /**
     * Adds addend (variable) to a variable specified by variableName
     *
     * @param variableName
     * @param addend name of variable to be added
     * @return StateMachineBuilder
     */
    public StateMachineBuilder add(String variableName, String addend);

    /**
     * Adds addend (int value) to a variable specified by variableName
     *
     * @param variableName
     * @param addend
     * @return StateMachineBuilder
     */
    public StateMachineBuilder add(String variableName, int addend);

    /**
     * Subtracts subtrahend (variable) from a variable specified by variableName
     *
     * @param variableName
     * @param subtrahend
     * @return StateMachineBuilder
     */
    public StateMachineBuilder subtract(String variableName, String subtrahend);

    /**
     * Subtracts subtrahend (int value) from a variable specified by
     * variableName
     *
     * @param variableName
     * @param subtrahend
     * @return StateMachineBuilder
     */
    public StateMachineBuilder subtract(String variableName, int subtrahend);

    /**
     * Sets an condition to a transition
     *
     * @param leftVariable name of a variable that is on the left side of
     * equation
     * @param operator enum of available comparison operators for transition
     * condition
     * @param rightVariable name of a variable that is on the right side of
     * equation
     * @return StateMachineBuilder
     */
    public StateMachineBuilder when(String leftVariable, ComparisonOperator operator, String rightVariable);

    /**
     * Sets an condition to a transition
     *
     * @param leftVariable name of a variable that is on the left side of
     * equation
     * @param operator enum of available comparison operators for transition
     * condition
     * @param rightOperand int value that the variable on the left side of
     * equation is compared to
     * @return StateMachineBuilder
     */
    public StateMachineBuilder when(String leftVariable, ComparisonOperator operator, int rightOperand);
}
