public class Cliente {
    public String name;
    public long cpf;
    public Computador[] computadores;



    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < computadores.length; i++) {
            total += computadores[i].preco;
        }
        return total;
    }
}
