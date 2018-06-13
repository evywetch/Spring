package spring.app;

public class Controller {

	View view;
	
	public Controller(View view){
		this.view = view;
	}
	
	public void showView(){
		view.show();
	}
}
