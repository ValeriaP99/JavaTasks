package md.pentalog.tasks_part1.chapter20.Ex20_8;

public class Pair<F, S> {
    private F firstParameter;
    private S secondParameter;

    public Pair(F firstParameter, S secondParameter) {
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
    }

    public F getFirstParameter() {
        return firstParameter;
    }

    public void setFirstParameter(F firstParameter) {
        this.firstParameter = firstParameter;
    }

    public S getSecondParameter() {
        return secondParameter;
    }

    public void setSecondParameter(S secondParameter) {
        this.secondParameter = secondParameter;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstParameter=" + firstParameter +
                ", secondParameter=" + secondParameter +
                '}';
    }
}
