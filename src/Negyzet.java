public class Negyzet extends Teglalap {


    public Negyzet(double oldalHossz) {
        super(oldalHossz, oldalHossz);
    }

    public double getOldalhossz() {
        return super.getHosszabbOldal();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Negyzet [oldalhossz=");
        builder.append(super.getHosszabbOldal());
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
