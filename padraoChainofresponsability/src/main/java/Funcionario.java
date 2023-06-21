import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList<TipoTarefa> listaTarefas = new ArrayList<>();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoCargo();

    public String assinarTarefa(Tarefa tarefa) {
        if (listaTarefas.contains(tarefa.getTipoTarefa())) {
            return getDescricaoCargo();
        } else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.assinarTarefa(tarefa);
            } else {
                return "Sem assinatura";
            }
        }
    }
}

