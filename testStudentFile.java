
/**
 * Write a description of class testStudentFile here.
 * 
 * @author () 
 * @version ()
 */

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class testStudentFile
{
    
    public static void main(String [] args)
    {
        System.out.print("\f");
        Scanner input = new Scanner(System.in);
        
        Studentable [] arrStudents = new Studentable[10];
        int count = 0;
        
        display(arrStudents,count);
        sortData(arrStudents,count);
        display(arrStudents,count);
        
        // Sort data using the Arrays.sort method
        arrStudents = Arrays.copyOf(arrStudents, count); //truncating the array to right size
        Arrays.sort(arrStudents);
        display(arrStudents,count);
        
        System.out.println("Enter a name: ");
        String sName = input.nextLine();
        int index = searchName(arrStudents, count, sName);
        if (index < 0)
            System.out.println(sName + " is not on the list");
        else
          System.out.println(sName + " is on the list");  
          
        FileClass f = new FileClass();
        f.readFromFile();
        arrStudents = f.getArray();
        count = f.getCount();
        f.serializeObjectsToFile();
       
    }
    
      
    public static void display(Studentable [] arrStudents, int count)
    {
        int countFail = 0;
        System.out.printf("%-20s%-15s%-10s%-10s%-10s%-10s\n","Name of Student","St Number","Part Mark","Ex Mark", "Att Mark", "Final Mark");
        for(int k = 0; k < count; k++)
        {
            Studentable student = arrStudents[k];
            System.out.println(student.toString()); 
            if (student instanceof FirstYearStudent)
            {
                if (student.calcFinalMark() < 50)
                    countFail = countFail + 1;
             }
               
        }
        System.out.println("\nNumber of first years who failed: " + countFail);
    }
    
    public static void sortData(Studentable [] arrStudents, int count)
    {
        for (int k = 0; k < count-1; k++)
        {
            for (int j = k+1; j < count; j++)
            {
                
                if (arrStudents[k].getStNumber().compareTo(arrStudents[j].getStNumber())>0)
                {
                    Studentable temp = arrStudents[k];
                    arrStudents[k] = arrStudents[j];
                    arrStudents[j] = temp;
                }
            }
        }
    }
    
   
    public static int searchName(Studentable [] arrStudents, int count, String search_name)
    {
        for (int k=0; k<count; k++)
        {
            if (search_name.equalsIgnoreCase(arrStudents[k].getName()))
            {
                return k;
            }            
        }
         return -1;
    } 
    
}
