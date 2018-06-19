package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import player.CDPlayer;
import player.DVDPlayer;
import player.MediaPlayer;
import player.PlayerConfig;
import soundsystem.CDPlayerConfig;
import soundsystem.CompactDisc;
import soundsystem.SgtPeppers;

public class App {
	
	public static void main(String[] args){
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class,PlayerConfig.class);
		
		CompactDisc cd = context.getBean(SgtPeppers.class);
		cd.play();
		
		MediaPlayer cdp =   (MediaPlayer) context.getBean("bean2");
		cdp.play();
		
		MediaPlayer cdd =   context.getBean(DVDPlayer.class);
		cdd.play();
		
	}

}
