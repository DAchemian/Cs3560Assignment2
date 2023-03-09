package cs3560;

public class Person {
    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public void watch(Movie movie, Watch watch) {
        System.out.println(name + " is watching " + movie.getName() + " (" + movie.getGenre() + ")");
        System.out.println("Rating: " + watch.getRating());
    }


	public class Movie {
	    private String name;
	    private String genre;
	    
	    public Movie(String name, String genre) {
	        this.name = name;
	        this.genre = genre;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public String getGenre() {
	        return genre;
	    }
	}

	public class Watch {
	    private int rating;
	    
	    public Watch(int rating) {
	        this.rating = rating;
	    }
	    
	    public int getRating() {
	        return rating;
	    }
}
}

