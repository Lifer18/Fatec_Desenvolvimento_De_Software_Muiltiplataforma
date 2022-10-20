public class Cachorro extends Animal{
    private String raca;

    public Cachorro(int patas, String raca){
        super(patas);
        this.raca = raca;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }


    @Override
    public int getPatas(){
        return super.getPatas();
    }

    @Override
    public void setPatas(int patas){
        super.setPatas(patas);
    }

    @Override
    public void mover(){
        System.out.print("Cachorro ");
        super.mover();
    }

    @Override
    public void comer(){
        System.out.print("Cachorro ");
        super.comer();
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Raca: "+raca);
    }
}
