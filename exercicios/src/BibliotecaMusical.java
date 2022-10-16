public class BibliotecaMusical {
    public static void main(String[] args) {
        MusicaInfo dados1 = new MusicaInfo("Djavan","Oceano","MPB");
        dados1.status();
        
        MusicaInfo dados2 = new MusicaInfo("Phill Veras", "Pode vir comigo", "MPB");
        dados2.status();

        MusicaInfo dados3 = new MusicaInfo("Carne Doce","Princesa","Rock alternativo");
        dados3.status();

        MusicaInfo dados4 = new MusicaInfo("Boogarins", "Invenção", "Psicodelia");
        dados4.status();

        MusicaInfo dados5 = new MusicaInfo("Tame Impala", "Solitude is bliss", "Psicodelia");
        dados5.status();

        MusicaInfo dados6 = new MusicaInfo("Donne", "Sereia", "POP");
        dados6.status();
    }
}
