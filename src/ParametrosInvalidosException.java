public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(){
        System.out.println("Parâmetros inválidos: o segundo parâmetro deve ser maior que o primeiro!");
    }

    public ParametrosInvalidosException(String alerta){
        super(alerta);
    }
}
