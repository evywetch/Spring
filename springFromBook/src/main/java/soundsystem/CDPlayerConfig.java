package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages ={ "soundsystem","player"})
public class CDPlayerConfig {
	
	@Bean(name = "lonelyHeartsClub")
	public CompactDisc sgtPeppers() {
	return new SgtPeppers();
	}

}
