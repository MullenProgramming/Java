import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// ************************************* MY CODE BELOW *************************************
import java.io.*;
import java.util.*;

class Student {
        int id;
        String name;
        double cgpa;
        
        public Student(int id, String name, double cgpa){
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }
        String getName(){
            return name;
        }
        int getId(){
            return id;
        }
        double getCGPA(){
            return cgpa;
        }
    }
    
class Priorities {
    PriorityQueue<Student> studentQueue = new PriorityQueue<>((s1, s2) -> {
            int compareCGPA = Double.compare(s2.getCGPA(), s1.getCGPA());
            if(compareCGPA != 0){
                return compareCGPA;
            }
            
            int compareName = s1.getName().compareTo(s2.getName());
            if(compareName != 0){
                return compareName;
            }
            
            return Integer.compare(s1.getId(), s2.getId());
        });
        
    List<Student> getStudents(List<String> events){
        List<Student> studentList = new ArrayList<>();
        for(int i = 0; i < events.size(); i++){
            String[] event = events.get(i).trim().split("\\s+");
            if(event[0].equals("ENTER")){
                int id = Integer.parseInt(event[3]);
                String name = event[1];
                double cgpa = Double.parseDouble(event[2]);
                studentQueue.add(new Student(id, name, cgpa));
            } else {
                studentQueue.poll();
            }
        }
        while(!studentQueue.isEmpty()){
            studentList.add(studentQueue.poll());
        }
        
        return studentList;
    }
}
// ************************************* MY CODE ABOVE *************************************

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
