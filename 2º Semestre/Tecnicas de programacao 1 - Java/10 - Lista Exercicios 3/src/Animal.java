public class Animal {
    
    private int patas;

    public Animal(int patas){
        this.patas = patas;
    }

    public int getPatas() {
        return this.patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public void mover(){
        System.out.println("movendo!");
    }

    public void comer(){
        System.out.println("comendo!");
    }

    public void imprimir(){
        System.out.println("Patas: "+patas);
    }
}
