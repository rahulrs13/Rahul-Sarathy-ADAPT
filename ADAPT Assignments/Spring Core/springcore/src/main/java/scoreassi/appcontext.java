package scoreassi;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
@Component
public class appcontext implements ApplicationContextAware {

	private ApplicationContext context = null;
	
	public int draw(int s) {
		return s*s;
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	
		
	}

	
}
