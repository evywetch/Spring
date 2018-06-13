package spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Controller {
	
	/*
	 *-  @Qualifier("TheView1") specifies that Which View will be use as View view ; here
	 * -  ("TheView1") specifies that new View1 will be inject to Controller
	 * - ("TheBean") or ("Bunnie") they are the names of a bean method in Application
	 *   which return new View2, So if we specify @Qualifier("TheBean") or
	 *   @Qualifier("TheBean"), new View2 will be injected to Controller
	 */

	@Autowired @Qualifier("TheView1")View view ;
	
	public Controller(){
		
	}
	
	
	public Controller(View view){
		
		this.view = view;
	}
	
	public void showView(){
		view.show();
	}
	
}
