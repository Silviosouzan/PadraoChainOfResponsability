public class FuncionarioJunior extends Funcionario {

    public FuncionarioJunior(Funcionario superior) {
        listaTarefas.add(TipoTarefaFacil.getTipoTarefaFacil());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Coordenador";
    }
}
