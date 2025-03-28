public class Empresas{
    private int firmados;
    private String contratos;
    
    public Empresas(){
        this.firmados=00000000;
        this.contratos=" ";
        
    }
    public Empresas(int firmados, String contratos ){
        this.firmados=firmados;
        this.contratos=contratos;

    }

    public int getFirmados() {
        return firmados;
    }

    public void setFirmados(int firmados) {
        this.firmados = firmados;
    }

    public String getContratos() {
        return contratos;
    }

    public void setContratos(String contratos) {
        this.contratos = contratos;
    }
    
    
}