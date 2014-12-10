package net.starjuice.jbehave_spike.stories;

import net.starjuice.jbehave_spike.Calculator;

public interface ImperativeAdditionTestProvider {
    Calculator make_a_calculator();

    void make_calculator_add_integers(int a, int b);

    void check_calculated_result();

    void expect_calculated_result(int i);
}
