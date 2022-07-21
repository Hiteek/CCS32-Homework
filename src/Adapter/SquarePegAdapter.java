public class SquarePegAdapter extends RoundPeg{
    private final SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public int getRadius() {
        int result;
        result = (int) Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2);
        return result;
    }

}
