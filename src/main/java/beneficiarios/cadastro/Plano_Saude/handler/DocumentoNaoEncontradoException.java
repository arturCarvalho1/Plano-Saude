package beneficiarios.cadastro.Plano_Saude.handler;

public class DocumentoNaoEncontradoException extends RuntimeException{
    private static final int ERROR_CODE = 404;

    public DocumentoNaoEncontradoException(String mensagem) {
    }
    public int getErrorCode() {
        return ERROR_CODE;
    }

}

