public class SquarePegAdapter extends RoundPeg{
    private final SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public int getRadius() {
        int result;
        result = (int) ((peg.getWidth() / 2) * Math.sqrt(2));
        return result;
    }

}
