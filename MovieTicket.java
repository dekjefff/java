//name id
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class MovieTicket {
    private String movieName;
    private String date;
    private String seatNumber;

    // TODO: เขียน Constructor ที่รับ movieName, date, seatNumber
    
    public MovieTicket(String movieName , String date , String seatNumber) {
    	this.movieName = movieName;
    	this.date = date;
    	this.seatNumber = seatNumber;
    	
    }

    // TODO: เขียน Getter สำหรับ movieName, date, seatNumber
    public String getMovieName() {
    	return this.movieName;
    }
    
    public String getDate() {
    	return this.date;
    }
    
    public String getSeatNumber() {
    	return this.seatNumber;
    }
    
    // TODO: เขียน Method getKey() คืนค่าเป็น "ชื่อหนัง-วันที่"



    public String getKey() {
    	
    	Map<String , String> get = new HashMap<>();
    	String key = null;
    	String value = null;
    	
    	get.put(movieName, date);
    	
    	for(Entry<String, String> e : get.entrySet()) {
    		
    		key = e.getKey();
    		
    		value = e.getValue();
    		
    		
    	}
    	return key + value;
    }
}