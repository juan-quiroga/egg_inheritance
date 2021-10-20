package rel_extra2;

public class Pelicula {
    
    private String title;
    private int length;
    private int minAge;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String title, int length, int minAge, String director) {
        this.title = title;
        this.length = length;
        this.minAge = minAge;
        this.director = director;
    }
    
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "title=" + title + ", length=" + length + ", minAge=" + minAge + ", director=" + director + '}';
    }
    
}
