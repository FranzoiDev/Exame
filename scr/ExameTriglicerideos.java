public class ExameTriglicerideos extends Exame {
    private double quantidadeTriglicerideos;

    public ExameTriglicerideos(String nomePaciente, String tipoSanguineo, int anoNascimento,
            double quantidadeTriglicerideos) {
        super(nomePaciente, tipoSanguineo, anoNascimento);
        this.quantidadeTriglicerideos = quantidadeTriglicerideos;
    }

    @Override
    public String classificarResultado() {
        if (getIdade() >= 0 && getIdade() <= 9) {
            if (quantidadeTriglicerideos < 75) {
                return "Com jejum: inferior a 75 mg/dL";
            }
        } else if (getIdade() >= 10 && getIdade() <= 19) {
            if (quantidadeTriglicerideos < 90) {
                return "Com jejum: inferior a 90 mg/dL";
            }
        } else {
            if (quantidadeTriglicerideos < 150) {
                return "Com jejum: inferior a 150 mg/dL";
            }
        }
        return "Fora dos padrões";
    }

    @Override
    public void mostrarResultado() {
        System.out.println("Exame de Triglicerideos");
        System.out.println("Nome do paciente: " + getNomePaciente());
        System.out.println("Idade: " + getIdade());
        System.out.println("Resultado: " + quantidadeTriglicerideos + " mg/dL");
        System.out.println("Classificação: " + classificarResultado());
        System.out.println();
    }
}
