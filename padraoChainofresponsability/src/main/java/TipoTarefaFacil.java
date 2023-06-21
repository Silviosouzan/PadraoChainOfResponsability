public class TipoTarefaFacil implements TipoTarefa {

    private static TipoTarefaFacil tipoTarefaFacil = new TipoTarefaFacil();

    private TipoTarefaFacil() {};

    public static TipoTarefaFacil getTipoTarefaFacil() {
        return tipoTarefaFacil;
    }

}
