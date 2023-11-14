public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        EgyenloOldaluHaromszog haromszog = new EgyenloOldaluHaromszog(5);
        System.out.println(haromszog);
        Teglalap teglalap = new Teglalap(-5,3);
        System.out.println(teglalap);
        Negyzet negyzet = new Negyzet(10);
        System.out.println(negyzet);
    }
}