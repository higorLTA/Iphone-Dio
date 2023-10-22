public class iPhone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public iPhone() {
        reprodutorMusical = new ReprodutorMusicalImpl();
        aparelhoTelefonico = new AparelhoTelefonicoImpl();
        navegadorInternet = new NavegadorInternetImpl();
    }

    // Outros métodos e funcionalidades do iPhone
}

public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica();
}

public class ReprodutorMusicalImpl implements ReprodutorMusical {
    @Override
    public void tocar() {
        // Implementação
    }

    @Override
    public void pausar() {
        // Implementação
    }

    @Override
    public void selecionarMusica() {
        // Implementação
    }
}

public interface AparelhoTelefonico {
    void ligar();
    void atender();
    void iniciarCorreioVoz();
}

public class AparelhoTelefonicoImpl implements AparelhoTelefonico {
    @Override
    public void ligar() {
        // Implementação
    }

    @Override
    public void atender() {
        // Implementação
    }

    @Override
    public void iniciarCorreioVoz() {
        // Implementação
    }
}

public interface NavegadorInternet {
    void exibirPagina();
    void adicionarNovaAba();
    void atualizarPagina();
}

public class NavegadorInternetImpl implements NavegadorInternet {
    @Override
    public void exibirPagina() {
        // Implementação
    }

    @Override
    public void adicionarNovaAba() {
        // Implementação
    }

    @Override
    public void atualizarPagina() {
        // Implementação
    }
}
