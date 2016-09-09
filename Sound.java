/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diary;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.io.*;
import sun.audio.*;
/**
 *
 * @author thulasidevi
 */
public class Sound {
    

public static void main(String args[]){
    JFrame frame=new JFrame();
    frame.setSize(200,200);
    JButton button=new JButton("Click me");
    frame.add(button);
    button.addActionListener(new AL());
    frame.show(true);
    JButton b=new JButton("Stop");
    frame.add(b);
    button.addActionListener(new AL());

}
public static class AL implements ActionListener{
    public final void actionPerformed(ActionEvent e){
        music();
    }
}
public static void music(){
    AudioPlayer MGP=AudioPlayer.player;
    AudioStream BGM;
    AudioData MD;
    ContinuousAudioDataStream loop=null;
    ChooseFile ch=new ChooseFile();
    try
    {
    BGM=new AudioStream(new FileInputStream(ch.getFilename()));
    MD=BGM.getData();
    loop=new ContinuousAudioDataStream(MD);
     }
    catch(IOException error){
        
    }
    MGP.start(loop);
  
}


}