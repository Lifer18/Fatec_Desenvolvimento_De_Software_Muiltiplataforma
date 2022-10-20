public class App {
    public static void main(String[] args) throws Exception {
        Animal a;
        Animal c;

        a = new Ave(2, "Pombo");

        c = new Cachorro(4, "Dalmatas");

        a.mover();
        a.comer();
        a.imprimir();

        System.out.println("\n");
        
        c.mover();
        c.comer();
        c.imprimir();
    }
}
