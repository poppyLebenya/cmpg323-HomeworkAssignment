
/**
 * Abstract class Student - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
import java.io.Serializable;
public abstract class Student implements Studentable, Serializable, Comparable<Student>
{
  private String name;
  private String stNumber;
  private int partMark;
  private int examMark;
  
  public Student (String name, String stNumber, int partMark, int examMark)
  {
      setName(name); 
      setStNumber(stNumber); 
      setPartMark(partMark); 
      setExamMark(examMark); 
  }
  
  public String getName()
  {
      return name;
  }
  
  public String getStNumber()
  {
      return stNumber;
  }
    
  public int getPartMark()
  {
      return partMark;
  }
  
  public int getExamMark()
  {
      return examMark;
  }
  public void setName(String name)
  {
      this.name = name;
  }
  public void setStNumber(String stNumber)
  {
      this.stNumber = stNumber;
  }
  
  public void setPartMark(int partMark)
  {
      this.partMark = partMark;
  }
  
  public void setExamMark(int examMark)
  {
      this.examMark = examMark;
  }
  
   @Override
    public int compareTo(Student s)
    {
       return (this.name).compareTo(s.name); 
    }
  
  public abstract double calcFinalMark();
    
  @Override
  public String toString()
  {
      String str = String.format("%-20s%-20s%-10d%-10d",name, stNumber,partMark, examMark);
      return str;
  }

    
}
