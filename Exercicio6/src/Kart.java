public class Kart {

    String nome;
    Piloto piloto;
    Motor motor;

    public Kart (){

        motor = new Motor();
    }

    public void pular(){

        System.out.println(nome+ " Esta pulando");

    }
    public void soltarTurbo(){
        System.out.println(nome+" Esta usando turbo");
    }

    public void fazerDrif(){

        System.out.println(nome+" Esta fazendo drift");
    }

}
