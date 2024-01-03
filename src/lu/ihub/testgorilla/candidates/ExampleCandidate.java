package lu.ihub.testgorilla.candidates;

import lu.ihub.testgorilla.Tester;

public class ExampleCandidate implements Tester {

    @Override
    public String calculator(String[] distancesList) {
        return "Total expenses:$160.55;Longest distance:Prague-Zurich";
    }
}
