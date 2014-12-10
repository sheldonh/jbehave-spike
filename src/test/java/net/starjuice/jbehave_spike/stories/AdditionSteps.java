package net.starjuice.jbehave_spike.stories;

import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;

public class AdditionSteps extends Steps {

    /**
     * The {@link ImperativeAdditionTestProvider} to delegate test activity to.
     */
    ImperativeAdditionTestProvider testProvider;

    /**
     * Allows the {@link AdditionSteps#testProvider} will be injected.
     */
    public AdditionSteps() {
    }

    /**
     * Allows {@link AdditionSteps#testProvider} to be passed in.
     * @param testProvider The {@link ImperativeAdditionTestProvider} to delegate test activity to
     */
    public AdditionSteps(ImperativeAdditionTestProvider testProvider) {
        this.testProvider = testProvider;
    }

    @Given("I have a calculator")
    public void aCalculator() {
        testProvider.make_a_calculator();
    }

    @When("I make the calculator add two different positive integers")
    public void addTwoDifferentPositiveIntegers() {
        testProvider.make_calculator_add_integers(42, 7);
        testProvider.expect_calculated_result(49);
    }

    @When("I make the calculator add a positive integer to itself")
    public void addPositiveIntegerToItself() {
        testProvider.make_calculator_add_integers(42, 42);
        testProvider.expect_calculated_result(84);
    }

    @When("I make the calculator add zero to a positive integer")
    public void addZeroToPositiveInteger() {
        testProvider.make_calculator_add_integers(0, 42);
        testProvider.expect_calculated_result(42);
    }

    @When("I make the calculator add a positive integer to zero")
    public void addPositiveIntegerToZero() {
        testProvider.make_calculator_add_integers(42, 0);
        testProvider.expect_calculated_result(42);
    }

    @When("I make the calculator add zero to itself")
    public void addZeroToItself() {
        testProvider.make_calculator_add_integers(0, 0);
        testProvider.expect_calculated_result(0);
    }

    @Then("I get the expected result")
    @Aliases(values = {
            "I get the sum of the two positive integers",
            "I get double the positive integer",
            "I get the positive integer",
            "I get zero"})
    public void assertExpectedResult() {
        testProvider.check_calculated_result();
    }
}
