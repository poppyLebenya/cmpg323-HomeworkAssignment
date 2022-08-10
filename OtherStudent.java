
/**
 * Write a description of class OtherStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OtherStudent extends Student
{
    private int projectMark;
    private double finalMark;
    
    public OtherStudent(String name, String stNumber, int partMark, int examMark, int projectMark)
    {
       super(name, stNumber, partMark, examMark);
       setProjectMark(projectMark); 
    }
    
    public int getProjectMark()
    {
        return projectMark;
    }
    
    public double getFinalMark()
    {
        return finalMark;
    }
        
    public void setProjectMark(int projectMark)
    {
        this.projectMark = projectMark; 
    }
    
    public double calcFinalMark()
    {
        finalMark = (super.getPartMark() * 30/100.0) + (super.getExamMark() * 40/100.0) + (projectMark * 30/100.0); 
        return finalMark;
    }
    @Override
    public String toString()
    {
       String str = String.format("%s%-10d%-10.1f",super.toString(),projectMark, calcFinalMark()); 
       return str;
    }
}
