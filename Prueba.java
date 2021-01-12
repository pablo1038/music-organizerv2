

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Prueba.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Prueba
{
    private MusicPlayer musicPla1;
    private MusicOrganizer musicOrg1;

    
    

    
    

    /**
     * Default constructor for test class Prueba
     */
    public Prueba()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        musicPla1 = new MusicPlayer();
        musicOrg1 = new MusicOrganizer();
        musicOrg1.addFile("audio/Willyrex- Paradise (Letra_Lyrics) (online-audio-converter.com).mp3");
        musicOrg1.listAllFiles();
        musicOrg1.addFile("dadwdwa");
        musicOrg1.addFile("adawadw");
        ;
        
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
