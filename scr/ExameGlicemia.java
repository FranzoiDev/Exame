public class ExameGlicemia extends Exame {
    private double quantidadeGlicose;

    public ExameGlicemia(String nomePaciente, String tipoSanguineo, int anoNascimento, double quantidadeGlicose) {
        super(nomePaciente, tipoSanguineo, anoNascimento);
        this.quantidadeGlicose = quantidadeGlicose;
    }

    @Override
    public String classificarResultado() {
        if (quantidadeGlicose < 100) {
            return "Normoglicemia";
        } else if (quantidadeGlicose >= 100 && quantidadeGlicose < 126) {
            return "Pré-diabetes";
        } else {
            return "Diabetes estabelecido";
        }
    }

    @Override
    public void mostrarResultado() {
        System.out.println("Exame de Glicemia");
        System.out.println("Nome do paciente: " + getNomePaciente());
        System.out.println("Idade: " + getIdade());
        System.out.println("Resultado: " + quantidadeGlicose + " mg/dL");
        System.out.println("Classificação: " + classificarResultado());
        System.out.println();
    }
}
