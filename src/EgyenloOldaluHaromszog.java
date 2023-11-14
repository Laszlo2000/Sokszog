public class EgyenloOldaluHaromszog extends Sokszog{

    private double oldalhossz;

    public EgyenloOldaluHaromszog(double oldalhossz) {
        super(3);
        this.oldalhossz = oldalhossz;
    }

    @Override
    public double kerulet() {
        return 0;
    }

    @Override
    public double terulet() {
        return 0;
    }

    public double getOldalhossz() {
        return oldalhossz;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("EgyenloOldaluHaromszog [oldalhossz=");
        builder.append(oldalhossz);
        builder.append(", getKerulet()=");
        builder.append(kerulet());
        builder.append(", getTerulet()=");
        builder.append(terulet());
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }
}