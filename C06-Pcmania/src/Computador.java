public class Computador {
    public String marca;
    public float preco;
    public SistemaOperacional sistema;
    public HardwareBasico[] hardwares;
    public MemoriaUSB memoriaUSB;

    public Computador(SistemaOperacional sistema) {
        this.sistema = sistema;
    }

    public Computador(HardwareBasico[] hardwares) {
        this.hardwares = hardwares;
    }
    public void addMemoriaUSB(MemoriaUSB musb) {
        memoriaUSB = musb;
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
        System.out.println("Sistema Operacional: " + sistema.nome + " (Tipo: " + sistema.tipo + ")");
        System.out.println("Hardware Básico:");
        for (int i = 0; i < hardwares.length; i++) {
            System.out.println(" - " + hardwares[i].nome + " (" + hardwares[i].capacidade + " GB)");}

        if (memoriaUSB != null) {
            System.out.println("Memória USB: " + memoriaUSB.nome + " (" + memoriaUSB.capacidade + " GB)");
        }
    }
}
