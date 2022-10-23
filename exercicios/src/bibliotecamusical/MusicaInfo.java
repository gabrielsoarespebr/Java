package bibliotecamusical;
public class MusicaInfo {
    private String artista;
    private String musica;
    private String genero;

    public MusicaInfo(String a, String m, String g){
        this.setArtista(a);
        this.setMusica(m);
        this.setGenero(g);
    }

    public void setArtista(String a) {
        this.artista = a;
    }

    public String getArtista() {
        return this.artista;
    }

    public void setMusica(String m) {
        this.musica = m;
    }

    public String getMusica() {
        return this.musica;
    }

    public void setGenero(String g) {
        this.genero = g;
    }

    public String getGenero() {
        return this.genero;
    }

    public void status(){
        System.out.println("BIBLIOTECA MUSICAL");
        System.out.println("Artista/Banda: "+ this.artista);
        System.out.println("Musica: "+ this.musica);
        System.out.println("Genero: "+ this.genero);
        System.out.println();
    }
}
