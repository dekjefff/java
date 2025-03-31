

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

public class MovieCatalog {
	
	private List<Movie> movies = null;
	
	MovieCatalog()
	{
		movies = new ArrayList<Movie>();
	}
	
	public List<Movie> getAllMovies()
	{
		return movies;
	}
	
	
	public void loadMovies(String filename)
	{
		//********************* YOUR CODE HERE **************************//

		try(CSVParser csvParser = new CSVParser(new FileReader(filename), CSVFormat.DEFAULT.withFirstRecordAsHeader())){
			
				
			for(CSVRecord record : csvParser) {
					
					String title = record.get("Movie Title");
					String genre = record.get("Genre");
					String leadSttudio = record.get("Lead Studio");
					double audienceScore = Double.parseDouble(record.get("Audience Score %"));
					double profitability = Double.parseDouble(record.get("Profitability"));
					double rottenTomatoesScore = Double.parseDouble(record.get("Rotten Tomatoes %"));
					double worldwideGross = Double.parseDouble(record.get("Worldwide Gross").replace("$", ""));
					int year = Integer.parseInt(record.get("Year"));
					
					movies.add(new Movie(title ,genre ,leadSttudio ,audienceScore ,profitability ,rottenTomatoesScore ,worldwideGross ,year));
					}
				
		}catch(FileNotFoundException e){
			
			e.printStackTrace();
			
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}
		//**************************************************************/
}

	
	public List<Movie> searchByTitle(String keyword)
	{
		//********************* YOUR CODE HERE **************************//
		List<Movie> found = new ArrayList<>();
		
		for(Movie movie : movies) {
			if(movie.getTitle().contains(keyword)) {
				found.add(movie);
			}
		}
		return found;
		
		
		//**************************************************************//
	}
	
	public List<Movie> searchByRottenTomatoesScores(double lowScore , double highScore)
	{
		//********************* YOUR CODE HERE **************************//
	List<Movie> found = new ArrayList<>();
		
		for(Movie movie : movies) {
			if(lowScore < movie.getRottenTomatoesScore() && movie.getRottenTomatoesScore() < highScore) {
				found.add(movie);
			}
		}

		return found;
		//**************************************************************//
	}
	//challenge 2
	public List<Movie> searchUnderrateMovie(){
		double sum = 0;
		List<Movie> found = new ArrayList<>();
		for(Movie movie : movies) {
			
			sum += movie.getWorldwideGross();
			
		}
		
		double avg = sum / movies.size();
		for(Movie movie : movies) {
			
			if(movie.getWorldwideGross() < avg && movie.getRottenTomatoesScore() >= 75 && movie.getAudienceScore() >= 75) {
				found.add(movie);
			}
		}
		
		
		return found;	
	}
	
	
	public static void saveMoviesJSON(List<Movie> movieList, String outFilename)
	{
		//********************* YOUR CODE HERE **************************//
		Gson gson = new Gson();
		Gson gsonpretty = new GsonBuilder().setPrettyPrinting().create();
		try {
			FileWriter writer = new FileWriter(outFilename);
			
			gsonpretty.toJson(movieList, writer);
			//System.out.println(gson .toJson(movieList));
		System.out.println(gsonpretty .toJson(movieList)); // challange 1
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		//**************************************************************//
	}


}
