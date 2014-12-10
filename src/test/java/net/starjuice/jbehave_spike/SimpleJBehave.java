package net.starjuice.jbehave_spike;

import java.util.Arrays;
import java.util.List;

import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.junit.JUnitStory;

public class SimpleJBehave {

    private static Embedder embedder = new Embedder();
    private static List<String> storyPaths = Arrays
            .asList("net/starjuice/jbehave_spike/addition.story");

    public static void main(String[] args) {
        embedder.candidateSteps().add(new AdditionSteps());
        embedder.runStoriesAsPaths(storyPaths);
    }
}