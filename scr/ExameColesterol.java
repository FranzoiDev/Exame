public class ExameColesterol extends Exame {
    private double quantidadeLDL;
    private double quantidadeHDL;
    private char risco;

    public ExameColesterol(String nomePaciente, String tipoSanguineo, int anoNascimento,
                           double quantidadeLDL, double quantidadeHDL, char risco) {
        super(nomePaciente, tipoSanguineo, anoNascimento);
        this.quantidadeLDL = quantidadeLDL;
        this.quantidadeHDL = quantidadeHDL;
        this.risco = risco;
    }

    @Override
    public String classificarResultado() {
        String classificacaoLDL = "";
        if (risco == 'B') {
            if (quantidadeLDL < 100) {
                classificacaoLDL = "Risco Baixo: LDL abaixo de 100 mg/dL";
            } else {
                classificacaoLDL = "Risco Baixo: LDL acima de 100 mg/dL";
            }
        } else if (risco == 'M') {
            if (quantidadeLDL < 70) {
                classificacaoLDL = "Risco Médio: LDL abaixo de 70 mg/dL";
            } else {
                classificacaoLDL = "Risco Médio: LDL acima de 70 mg/dL";
            }
        } else if (risco == 'A') {
            if (quantidadeLDL < 50) {
                classificacaoLDL = "Risco Alto: LDL abaixo de 50 mg/dL";
            } else {
                classificacaoLDL = "Risco Alto: LDL acima de 50 mg/dL";
            }
        }
        return "HDL: " + quantidadeHDL + " mg/dL, " + classificacaoLDL;
    }

    @Override
    public void mostrarResultado() {
        System.out.println("Exame de Colesterol");
        System.out.println("Nome do paciente: " + getNomePaciente());
        System.out.println("Idade: " + getIdade());
        System.out.println("Resultado LDL: " + quantidadeLDL + " mg/dL");
        System.out.println("Resultado HDL: " + quantidadeHDL + " mg/dL");
        System.out.println("Classificação: " + classificarResultado());
        System.out.println();
    }
}
