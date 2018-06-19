package player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import soundsystem.CDPlayerConfig;
import soundsystem.CompactDisc;

@Import(CDPlayerConfig.class)
@Configuration
//@ComponentScan("player")
public class PlayerConfig {
	
	@Autowired
	CompactDisc sgtPeppers;

	@Bean("bean1")
	public CDPlayer cdPlayer(){
		return new CDPlayer(sgtPeppers);
	}
	
	@Bean("bean2")
	public CDPlayer anotherCDPlayer(){
		return new CDPlayer(sgtPeppers);
	}
	
	
	@Bean
	public DVDPlayer dvdPlayer(){
		return new DVDPlayer(sgtPeppers);
	}

}
