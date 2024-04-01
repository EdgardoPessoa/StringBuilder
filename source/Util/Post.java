package source.Util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date momento;
    private String titulo;
    private String conteudo;
    private Integer curtidas;
    private List<Comentarios> comentarios = new ArrayList<>();

    @SuppressWarnings("unused")
    private Post(){}

    public Post(Date momento, String titulo, String conteudo, Integer curtidas) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.curtidas = curtidas;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }

    public List<Comentarios> getComentarios() {
        return comentarios;
    }

    public void adicionarComentario(Comentarios comentario){
        comentarios.add(comentario);
    }
    public void removerComentario(Comentarios comentario){
        comentarios.remove(comentario);
    }

    public String toString(){
        StringBuilder testEstudos = new StringBuilder();
        testEstudos.append(titulo + "\n");
        testEstudos.append(curtidas + " Curtidas - " +"\n");
        testEstudos.append(sdf.format(momento) + "\n");
        testEstudos.append(conteudo + "\n");
        testEstudos.append("Comments: \n");
        for (Comentarios comentario : comentarios){
            testEstudos.append(comentario.getTexto() + "\n");
        }
        return testEstudos.toString();
    }
}
