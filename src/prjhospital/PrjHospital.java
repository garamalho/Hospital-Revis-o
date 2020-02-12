
package prjhospital;


public class PrjHospital {

    
    public static void main(String[] args) {
       Enfermeiro e = new Enfermeiro();
       e.setNome("Fernanda");
       e.setIdade(20);
       e.setCpf("123.321.456-25");
       e.setRg("321.654.987-00");
       e.setCoren("00011");
       
       
       Medico m = new Medico();
       m.setNome("Gabriel");
       m.setIdade(22);
       m.setCpf("123.147.255-22");
       m.setRg("125.157.258-36");
       m.setCRM("157786");
       m.setEspecialidade("ginecologista");
      
       
       Funcionario f = new Funcionario();
       f.setNome("Guimel");
       f.setIdade(19);
       f.setCpf("789.564.258.19");
       f.setRg("357.159.852-22");
       f.setSenha("1415");
       f.setMatricula(987654);
       
       Paciente p = new Paciente();
       p.setCodPaciente(456123);
       p.setSenha("1245ab");
       p.setNome("Roberto");
       p.setCpf("258.147.369-33");
       p.setRg("456.842.369-55");
       p.setIdade(23);
   
       
       System.out.println("nome: "+e.getNome());
        System.out.println("idade: "+e.getIdade());
        System.out.println("cpf: "+ e.getCpf());
        System.out.println("Rg: "+e.getRg());
        System.out.println("Coren: "+e.getCoren());
        
        
        System.out.println("nome: "+m.getNome());
        System.out.println("idade: "+m.getIdade());
        System.out.println("Cpf: "+m.getCpf());
        System.out.println("Rg:"+m.getRg());
        System.out.println("Crm: "+m.getCRM());
        System.out.println("especialidade: "+m.getEspecialidade());
       
        System.out.println("nome: "+f.getNome());
        System.out.println("idade: "+f.getIdade());
        System.out.println("cpf: "+f.getCpf());
        System.out.println("rg: "+f.getRg());
        System.out.println("senha: "+f.getSenha());
        System.out.println("matricula: "+f.getMatricula());
        
        
        System.out.println("codpaciente: "+p.getCodPaciente());
        System.out.println("senha: "+p.getSenha());
        System.out.println("nome: "+p.getNome());
        System.out.println("cpf: "+p.getCpf());
        System.out.println("rg: "+p.getRg());
        System.out.println("idade: "+p.getIdade());
        
    }
    
}
