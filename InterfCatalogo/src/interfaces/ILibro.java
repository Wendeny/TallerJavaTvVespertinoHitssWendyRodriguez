package interfaces;

import java.time.LocalDate;

public interface ILibro {
    public LocalDate getFechaPublicacion();
    public String getAutor();
    public String getTitulo();
    public String getEditorial();

}
