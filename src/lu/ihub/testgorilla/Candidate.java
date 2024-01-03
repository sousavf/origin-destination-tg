package lu.ihub.testgorilla;

public class Candidate<T extends Tester>  {

    private Class<T> clazz;

    private double score;

    private int numberOfExceptions;

    public Candidate(Class<T> clazz) {
        this.clazz = clazz;
    }

    public T buildOne() throws InstantiationException, IllegalAccessException {
        return clazz.newInstance();
    }

    public String calculator( String[] distancesList ) throws java.lang.InstantiationException, java.lang.IllegalAccessException {
        final T t = buildOne();

        return t.calculator(distancesList);
    }

    public String getClazz() {
        try {
            return buildOne().getClass().getSimpleName();
        } catch (Exception e) {
            return "Error fetching class";
        }
    }

    public double getScore() {
        return this.score;
    }

    public void addScore(double value) {
        this.score += value;
    }

    public int getNumberOfExceptions() {
        return this.numberOfExceptions;
    }

    public void addException() {
        numberOfExceptions += 1;
    }
}
