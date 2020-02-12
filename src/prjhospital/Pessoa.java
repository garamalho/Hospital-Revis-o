
package prjhospital;


public abstract class Pessoa {
    
    private String Nome;
    private String Rg;
    private String Cpf;
    private int Idade;
 
    public String getNome(){
        return this.Nome;
    }  
    
    public void setNome(String nome){
        this.Nome = nome;
    }
    public String getRg(){
        return this.Rg;
    }
    
    public void setRg(String rg){
        this.Rg = rg;
    }

    public String getCpf(){
        return Cpf;
    }

    public void setCpf(String Cpf){
        this.Cpf = Cpf;
    }

    public int getIdade(){
        return Idade;
    }

    public void setIdade(int Idade){
        this.Idade = Idade;
    }
  
}


