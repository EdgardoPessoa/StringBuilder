package source;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import source.Util.Comentarios;
import source.Util.Post;

public class program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comentarios c1 = new Comentarios("Tenha uma boa viagem!");
        Comentarios c2 = new Comentarios("Wow, isso é incrivel!");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Viajando para Nova Zelandia", "Estou indo visitar esse pais maravilhoso!", 12);
        p1.adicionarComentario(c1);
        p1.adicionarComentario(c2);


        Comentarios c3 = new Comentarios("Boa noite.");
        Comentarios c4 = new Comentarios("Que a força esteja com você.");
        Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Boa noite pesosal.", "Vejo vocês amanha!", 5);
        p2.adicionarComentario(c3);
        p2.adicionarComentario(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}
