import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Computador promocao1 = new Computador;
        promocao1.marca = "Apple";
        promocao1.preco = 1234;
        promocao1.hardwares = new HardwareBasico[3];
        promocao1.hardwares[0] = new HardwareBasico;
        promocao1.hardwares[0].nome = "Pentium Core i3";
        promocao1.hardwares[0].capacidade = 2200;
        promocao1.hardwares[1] = new HardwareBasico;
        promocao1.hardwares[1].nome = "Memória RAM";
        promocao1.hardwares[1].capacidade =  8;
        promocao1.hardwares[2] = new HardwareBasico;
        promocao1.hardwares[2].nome = "HD";
        promocao1.hardwares[3].capacidade = 500;
        promocao1.memoriaUSB = new MemoriaUSB;
        promocao1.memoriaUSB.nome = "Pen-drive";
        promocao1.memoriaUSB.capacidade = 16;
        promocao1.addMemoriaUSB(promocao1.memoriaUSB);
        promocao1.sistema = new SistemaOperacional;
        promocao1.sistema.nome = "Linux Ubuntu";
        promocao1.sistema.tipo =  32;

        Computador promocao2 = new Computador;
        promocao2.marca = "Samsung";
        promocao2.preco = 1234 + 1234;
        promocao2.hardwares = new HardwareBasico[3];
        promocao2.hardwares[0] = new HardwareBasico;
        promocao2.hardwares[0].nome = "Pentium Core i5";
        promocao2.hardwares[0].capacidade = 3370;
        promocao2.hardwares[1] = new HardwareBasico;
        promocao2.hardwares[1].nome = "Memória RAM";
         promocao2.hardwares[1].capacidade = 16;
        promocao2.hardwares[2] = new HardwareBasico;
        promocao2.hardwares[2].nome = "HD";
        promocao2.hardwares[2].capacidade = 1000;
        promocao2.memoriaUSB = new MemoriaUSB;
        promocao2.memoriaUSB.nome ="Pen-drive";
        promocao2.memoriaUSB.capacidade = 32;
        promocao2.addMemoriaUSB(promocao2.memoriaUSB);
        promocao2.sistema = new SistemaOperacional;
        promocao2.sistema.nome = "Windows 8";
        promocao2.sistema.tipo = 64;

        Computador promocao3 = new Computador;
        promocao3.marca = "Dell";
        promocao3.preco = 1234 + 5678;
        promocao3.hardwares = new HardwareBasico[3];
        promocao3.hardwares[0] = new HardwareBasico;
        promocao3.hardwares[0].nome = "Pentium Core i7";
        promocao3.hardwares[0].capacidade = 4500;
        promocao3.hardwares[1] = new HardwareBasico;
        promocao3.hardwares[1].nome = "Memória RAM";
        promocao3.hardwares[1].capacidade =  32;
        promocao3.hardwares[2] = new HardwareBasico;
        promocao3.hardwares[2].nome = "HD";
        promocao3.hardwares[2].capacidade =  2000;
        promocao3.memoriaUSB = new MemoriaUSB;
        promocao3.memoriaUSB.nome = "HD Externo";
        promocao3.memoriaUSB.capacidade =  1000;
        promocao3.addMemoriaUSB(promocao3.memoriaUSB);
        promocao3.sistema = new SistemaOperacional;
        promocao3.sistema.nome = "Windows 10";
        promocao3.sistema.tipo = 64;


        Cliente cliente = new Cliente();
        System.out.print("Digite o nome do cliente: ");
        cliente.name = scanner.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        cliente.cpf = scanner.nextLong();
        scanner.nextLine();
        cliente.computadores = new Computador[10];
        int qtdCompras = 0;

        while (true) {
            System.out.println("Digite o código da promoção (1 a 3) ou 0 para sair: ");
            int codigo = scanner.nextInt();
            if (codigo == 0) {
                break;
            }
            if (codigo == 1) {
                cliente.computadores[qtdCompras++] = promocao1;
            } else if (codigo == 2) {
                cliente.computadores[qtdCompras++] = promocao2;
            } else if (codigo == 3) {
                cliente.computadores[qtdCompras++] = promocao3;
            } else {
                System.out.println("Código inválido!");
            }
        }

        System.out.println("Informações da compra:");
        System.out.println("Cliente: " + cliente.name);
        System.out.println("CPF: " + cliente.cpf);
        System.out.println("Computadores comprados:");
        for (int i = 0; i < qtdCompras; i++) {
            cliente.computadores[i].mostraPCConfigs();
            System.out.println();
        }
        System.out.println("Total da compra: R$ " + cliente.calculaTotalCompra());

        scanner.close();
    }
}

