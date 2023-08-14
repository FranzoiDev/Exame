public abstract class Exame {
    private String nomePaciente;
    private String tipoSanguineo;
    private int anoNascimento;

    public Exame(String nomePaciente, String tipoSanguineo, int anoNascimento) {
        this.nomePaciente = nomePaciente;
        this.tipoSanguineo = tipoSanguineo;
        this.anoNascimento = anoNascimento;
    }

    public abstract String classificarResultado();

    public abstract void mostrarResultado();

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public int getIdade() {
        return java.time.LocalDate.now().getYear() - anoNascimento;
    }
}
