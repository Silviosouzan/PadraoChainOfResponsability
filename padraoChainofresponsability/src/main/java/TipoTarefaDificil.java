public class TipoTarefaDificil implements TipoTarefa {
    private static TipoTarefaDificil tipoTarefaDificil = new TipoTarefaDificil();

    private TipoTarefaDificil() {}

    public static TipoTarefaDificil getTipoTarefaDificil() {
        return tipoTarefaDificil;
    }
}
