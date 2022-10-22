public class UFC {
    public static void main(String[] args) {
        var qtdLutadores = 6;
        Lutador l[] = new Lutador[qtdLutadores];

        l[0] = new Lutador("Ze Bom de Perna", "Brasil", 32, 1.70f, 65f, 10, 0, 2);
        l[1] = new Lutador("Fantasma", "Russia", 25, 1.75f, 85f, 9, 1, 3);
        l[2] = new Lutador("Sombra", "Estados Unidos", 27, 1.90f, 95f, 11, 1, 1);
        l[3] = new Lutador("Borracha", "Argentina", 24, 1.70f, 77f, 7, 3, 5);
        l[4] = new Lutador("Morsa", "Mocambique", 28, 1.82f, 83f, 9, 0, 1);
        l[5] = new Lutador("Chico Alicate", "Mexico", 30, 1.72f, 65f, 5, 4, 2);

        for (var i = 0; i < qtdLutadores; i++) {
            l[i].apresentar();
        }
    }
}
