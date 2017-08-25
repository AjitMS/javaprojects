
package mu;

import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


public class Sound {
    
    public static void success()
    {
        try
        {
            String songFile = "C:\\Users\\acer\\Desktop\\emp\\success.wav";
            InputStream in = new FileInputStream(songFile);
            AudioStream audioStream = new AudioStream(in);
            AudioPlayer.player.start(audioStream);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       
    }
    
    public static void failure()
    {
        try
        {
            String songFile = "C:\\Users\\acer\\Desktop\\emp\\failure.wav";
            InputStream in = new FileInputStream(songFile);
            AudioStream audioStream = new AudioStream(in);
            AudioPlayer.player.start(audioStream);
            
        }
        catch(Exception e)
        {
          System.out.println(e);
        }
            
    }
}
