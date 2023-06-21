public class FuncionarioSenior extends Funcionario {

    public FuncionarioSenior(Funcionario superior) {
        listaTarefas.add(TipoTarefaMedia.getTipoTarefaMedia());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Senior";
    }

}
