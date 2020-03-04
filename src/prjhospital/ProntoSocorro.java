
package prjhospital;

public class ProntoSocorro {
    private PrjHospital matriz;
    private int idfilial;
    private String endereco;
    
    public PrjHospital getMatriz() {
        return matriz;
    }

    public void setMatriz(PrjHospital matriz) {
        this.matriz = matriz;
    }

    public void setIdfilial(int idfilial) {
        this.idfilial = idfilial;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdfilial() {
        return idfilial;
    }

    public String getEndereco() {
        return endereco;
    }
    
    public void ProntoSocorro (int idFi, PrjHospital matriz){
        this.idfilial = idFi;
        this.matriz = matriz;
    }
}
