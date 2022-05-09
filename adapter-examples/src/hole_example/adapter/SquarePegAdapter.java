package hole_example.adapter;

import hole_example.pegs.RoundPeg;
import hole_example.pegs.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
    	return (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
    }
}
