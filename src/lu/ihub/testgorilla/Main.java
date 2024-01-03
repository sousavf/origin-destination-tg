package lu.ihub.testgorilla;

import lu.ihub.testgorilla.candidates.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pair input1 = new Pair(new String[]{"Vienna-Prague 312,Prague-Zurich 676"}, "Total expenses:$160.55;Longest distance:Prague-Zurich");
        Pair input2 = new Pair(new String[]{"Amsterdam-Rotterdam 80,Rotterdam-Brussels 146"}, "Total expenses:$36.73;Longest distance:Rotterdam-Brussels");
        Pair input3 = new Pair(new String[]{"Distance 1 10"," Distance 2 200"}, "Total expenses:$34.13;Longest distance:Distance 2");
        Pair input4 = new Pair(new String[]{"London-Rotterdam:432","Rotterdam-Calais:311","Calais-Venice:1229"}, "Total expenses:$320.45;Longest distance:Calais-Venice");
        /**
         *
         * TODO
         * Continue here with the existing test cases following the pattern
         *
         */

        List<Pair> testCases = List.of(input1, input2, input3, input4 /** TODO Here you continue with the same, add the remainder of hidden Test Cases */);

        List<Candidate> candidates = List.of(
                /** TODO Example for adding candidates */
                new Candidate<>(ExampleCandidate.class)//,
                //new Candidate<>(JohnDoe.class),
                //new Candidate<>(JaneDoe.class),
                //...
        );

        for (Candidate candidate : candidates) {
            for (Pair testCase : testCases) {
                try {
                    final String result = candidate.calculator(testCase.getInput());
                    if (testCase.isValid(result.toString())) {
                        candidate.addScore(/** TODO Add here the score per TestCase */ 0d);
                    }
                } catch (Exception e) {
                    candidate.addException();
                }
            }

            System.out.println(candidate.getClazz() + ": No. Exceptions: " + candidate.getNumberOfExceptions() +  " # Final Score: " + candidate.getScore());
        }
    }
}