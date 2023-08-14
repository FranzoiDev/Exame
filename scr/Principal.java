public class Principal {
    public static void main(String[] args) {
        ExameGlicemia exameGlicemia = new ExameGlicemia("Joao", "A+", 1985, 130);
        exameGlicemia.mostrarResultado();

        ExameColesterol exameColesterol1 = new ExameColesterol("Carlos", "AB-", 1980, 80, 50, 'B');
        exameColesterol1.mostrarResultado();

        ExameTriglicerideos exameTriglicerideos1 = new ExameTriglicerideos("Ana", "A-", 2005, 120);
        exameTriglicerideos1.mostrarResultado();

        ExameGlicemia exameGlicemia1 = new ExameGlicemia("Maria", "O+", 1990, 90);
        exameGlicemia1.mostrarResultado();

    }
}