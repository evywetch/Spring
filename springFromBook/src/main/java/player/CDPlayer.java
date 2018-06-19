package player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


import soundsystem.CompactDisc;

// @Component @Autowired @ComponentScan if we gonna use the java config file
 
 

// @Component
public class CDPlayer implements MediaPlayer {


private CompactDisc cd;

/* adding @Autowired at the constructor means every paramerter classes that are passed
 * to constructor will be autowired to this object. So u don't hv to annotate
 * the properties, only once at constructor.
 * 
 */
// @Autowired 
	public CDPlayer(CompactDisc cd){
		this.cd = cd;
	}

	public void play() {
	if(cd != null) 
		cd.play();
	
	}
}
