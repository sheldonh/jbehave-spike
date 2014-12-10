package net.starjuice.jbehave_spike.stories;

import java.util.Arrays;
import java.util.List;

public class Addition extends Story {

    List<AdditionSteps> getSteps() {
        return Arrays.asList(new AdditionSteps(new StubAdditionTestProvider()));
    }

}
