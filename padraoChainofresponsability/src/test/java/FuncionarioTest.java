import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveAssinarTarefaFacil() {
        // Configuração do cenário
        FuncionarioJunior funcionarioJunior = new FuncionarioJunior(null);
        Tarefa tarefaFacil = new Tarefa(TipoTarefaFacil.getTipoTarefaFacil());

        // Execução
        String resultado = funcionarioJunior.assinarTarefa(tarefaFacil);

        // Verificação
        assertEquals("Coordenador", resultado);
    }

    @Test
    void deveAssinarTarefaMedia() {
        // Configuração do cenário
        FuncionarioJunior funcionarioJunior = new FuncionarioJunior(new FuncionarioSenior(null));
        Tarefa tarefaMedia = new Tarefa(TipoTarefaMedia.getTipoTarefaMedia());

        // Execução
        String resultado = funcionarioJunior.assinarTarefa(tarefaMedia);

        // Verificação
        assertEquals("Senior", resultado);
    }

    @Test
    void naoDeveAssinarTarefa() {
        // Configuração do cenário
        FuncionarioJunior funcionarioJunior = new FuncionarioJunior(null);
        Tarefa tarefaDificil = new Tarefa(TipoTarefaDificil.getTipoTarefaDificil());

        // Execução
        String resultado = funcionarioJunior.assinarTarefa(tarefaDificil);

        // Verificação
        assertEquals("Sem assinatura", resultado);
    }
}