
/**
 * Write a description of class FileClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

public class FileClass
{
    Studentable [] arrStudents = new Studentable[10];
    int count = 0;
    
           
    public void readFromFile()
    {
     
        try
        {
            Scanner sc = new Scanner(new FileReader("marks.txt"));
            
            while (sc.hasNext())
            {
                String line = sc.nextLine();
                String [] info = line.split(",");
                
                String name = info[0];
                String stNumber = info[1];
                int pMark = Integer.parseInt(info[2]);
                int eMark = Integer.parseInt(info[3]);
                
                                
                if (stNumber.substring(0,1).equals("1"))
                {
                    int attMark = Integer.parseInt(info[4]);                   
                    arrStudents[count] = new FirstYearStudent(name,stNumber,pMark, eMark, attMark);
                }
                else
                {
                    int projectMark = Integer.parseInt(info[4]);
                    arrStudents[count] = new OtherStudent(name,stNumber,pMark, eMark, projectMark);
                    
                }
                count++;
            }
            sc.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error reading the file");
        }
    }
    
    public Studentable [] getArray()
    {
        return arrStudents;
    }
    
    public int getCount()
    {
        return count;
    }
    
    public void serializeObjectsToFile() 
    {
    //Serializing objects to file students.ser
    try
    {
       // FileOutputStream file = new FileOutputStream("students.ser");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("students.ser"));
        for(int k = 0; k < count;k++)
        {
            out.writeObject(arrStudents[k]);
        }
            
        out.close();
        //file.close();
    }
    catch(IOException ex)
    {
        System.out.println(ex);
    }
            

    }
    
    
}


        