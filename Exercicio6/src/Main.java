public class Main {

    public static void main(String[] args) {

        Piloto p1 = new Piloto();
        Piloto p2 = new Piloto();
        Piloto p3 = new Piloto();

        Kart k1 = new Kart();
        Kart k2 = new Kart();
        Kart k3 = new Kart();

        k1.piloto = p1;
        k2.piloto = p2;
        k3.piloto = p3;

        p1.nome = "Mario";
        p2.nome = "Peach";
        p3.nome = "Bowser";

        p1.vilão = false;
        p2.vilão = false;
        p3.vilão = true;

        k1.nome = "possante";
        k2.nome = "ferrari";
        k3.nome = "camaro";

        k1.motor.velocidadeMaxima = 135;
        k2.motor.velocidadeMaxima = 150;
        k3.motor.velocidadeMaxima = 120;

        k1.motor.cilindradas = "150";
        k2.motor.cilindradas = "100";
        k3.motor.cilindradas = "50";



        p1.soltarSuperPoder();
        p2.soltarSuperPoder();
        p3.soltarSuperPoder();

        k1.pular();
        k2.fazerDrif();
        k3.soltarTurbo();

        k1.motor.mostrarInfo();
        k2.motor.mostrarInfo();
        k3.motor.mostrarInfo();



    }


}