
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test
{
    public int test(int i)
    {
        int dir = -1;
        int size = 4;
        
        return i*dir - ((dir-Math.abs(dir))*(size-1)/2);
    }
}
