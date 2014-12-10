package net.starjuice.jbehave_spike;

import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;
import org.junit.Assert;

public class AdditionSteps extends Steps {

    private Calculator calculator;
    private int expected, actual;

    @Given("I have a calculator")
    public void aCalculator() {
        calculator = new Calculator();
    }

    @When("I make the calculator add two different positive integers")
    public void addTwoDifferentPositiveIntegers() {
        actual = calculator.add(42, 7);
        expected = 49;
    }

    @When("I make the calculator add a positive integer to itself")
    public void addPositiveIntegerToItself() {
        actual = calculator.add(42, 42);
        expected = 84;
    }

    @When("I make the calculator add zero to a positive integer")
    public void addZeroToPositiveInteger() {
        actual = calculator.add(0, 42);
        expected = 42;
    }

    @When("I make the calculator add a positive integer to zero")
    public void addPositiveIntegerToZero() {
        actual = calculator.add(42, 0);
        expected = 42;
    }

    @When("I make the calculator add zero to itself")
    public void addZeroToItself() {
        actual = calculator.add(0, 0);
        expected = 0;
    }

    @Then("I get the expected result")
    @Aliases(values = {
            "I get the sum of the two positive integers",
            "I get double the positive integer",
            "I get the positive integer",
            "I get zero"})
    public void assertExpectedResult() {
        Assert.assertEquals(actual, expected);
    }
}
