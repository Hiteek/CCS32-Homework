public class Cliente {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("La pieza redonda de radio 5 entra el agujero de radio 5.");
        }

        SquarePeg small_sqpeg = new SquarePeg(2);
        SquarePeg large_sqpeg = new SquarePeg(20);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(small_sqpeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(large_sqpeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("El cuadrado de ancho 2 entra en el agujero de radio 5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("El cuadrado de ancho 20 no quepa en el agujero de radio 5.");
        }
    }
}
