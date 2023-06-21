public class TipoTarefaMedia implements TipoTarefa {

    private static TipoTarefaMedia tipoTarefaMedia = new TipoTarefaMedia();

    private TipoTarefaMedia() {};

    public static TipoTarefaMedia getTipoTarefaMedia() {
        return tipoTarefaMedia;
    }

}
