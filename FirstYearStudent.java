
/**
 * Write a description of class FirstYearStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FirstYearStudent extends Student
{
    private int attMark;
    private double finalMark;
    
    public FirstYearStudent(String name, String stNumber, int partMark, int examMark, int attMark)
    {
       super(name, stNumber, partMark, examMark);
       setAttMark(attMark); 
    }
    
    public int getAttMark()
    {
        return attMark;
    }
    
    public double getFinalMark()
    {
        return finalMark;
    }
        
    public void setAttMark(int attMark)
    {
        this.attMark = attMark; 
    }
    
    public double calcFinalMark()
    {
        finalMark = (super.getPartMark() * 40/100.0) + (super.getExamMark() * 50/100.0) + (attMark * 10/100.0); 
        return finalMark;
    }
    @Override
    public String toString()
    {
       String str = String.format("%s%-10d%-10.1f",super.toString(),attMark, calcFinalMark()); 
       return str;
    }
}
