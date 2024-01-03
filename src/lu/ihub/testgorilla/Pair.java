package lu.ihub.testgorilla;

public class Pair {

    private final String[] input;
    private final String result;

    public Pair(String[] input, String result) {
        this.input = input;
        this.result = result;
    }

    public String[] getInput() {
        return input;
    }

    public String getResult() {
        return result;
    }

    public boolean isValid(String result) {
        return this.result.trim().equalsIgnoreCase(result.trim());
    }
}
