public class Ave extends Animal{
    private String especie;

    public Ave(int patas, String especie){
        super(patas);
        this.especie = especie;
    }


    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
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
        System.out.print("Ave ");
        super.mover();
    }

    @Override
    public void comer(){
        System.out.print("Ave ");
        super.comer();
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Especie: "+especie);
    }
}
