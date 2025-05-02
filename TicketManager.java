import java.util.*;
import java.io.*;

public class TicketManager {
    private Map<String, List<String>> bookings = new HashMap<>();

    // เพิ่มการจองตั๋วหนัง
    public void addTicket(MovieTicket ticket) {
        String key = ticket.getKey();
        String seat = ticket.getSeatNumber();
        List<String> booked = new ArrayList<>(Arrays.asList(seat));
        
        
        //
        //Your code here
        // - ตรวจสอบว่า seat ซ้ำหรือไม่
        // - ถ้าไม่ซ้ำให้เพิ่มที่นั่ง
        // - ถ้าซ้ำให้แสดงข้อความ error
        
        bookings.put(key, booked);
    }

    // แสดงข้อมูลการจองทั้งหมด
    public void displayAllBookings() {
        for (String key : bookings.keySet()) {
            System.out.println(key + ": " + bookings.get(key));
        }
    }

    // บันทึกข้อมูลการจองลงไฟล์
    public void saveToFile(String filename) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename,true));
        //
        //Your code here
        for(Map.Entry<String, List<String>> t :bookings.entrySet()) {
        	
        	writer.write(t.getKey());
        	writer.newLine();
        }
        //
    }
}