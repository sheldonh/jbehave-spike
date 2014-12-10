package net.starjuice.jbehave_spike.stories;

import net.starjuice.jbehave_spike.Calculator;
import org.junit.Assert;

public class StubAdditionTestProvider implements ImperativeAdditionTestProvider {

    private Calculator calculator;
    private int actual, expected;

    @Override
    public Calculator make_a_calculator() {
        calculator = new Calculator();
        return calculator;
    }

    @Override
    public void make_calculator_add_integers(int a, int b) {
        actual = calculator.add(a, b);
    }

    @Override
    public void check_calculated_result() {
        Assert.assertEquals(expected, actual);
    }

    @Override
    public void expect_calculated_result(int i) {
        expected = i;
    }
}
