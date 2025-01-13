// This solution is a shorter and better solution than what the challenge requests, however since the challenge
// blocks the main method, this will actually not print out anything if ran through HackerRanks code checker.
//
// This class solution utilized Java's PriorityQueue instead of needing to make a custom Priorities class.

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

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
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
        
        while(n-- > 12){
            String[] line = br.readLine().trim().split("\\s+");
            if(line[0].equals("ENTER")){
                int id = Integer.parseInt(line[3]);
                String name = line[1];
                double cgpa = Double.parseDouble(line[2]);
                studentQueue.add(new Student(id, name, cgpa));
            } else {
                System.out.println(studentQueue.poll().getName());
            }
        }
      br.close();
    }
}
