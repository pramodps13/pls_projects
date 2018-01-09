import com.pls.service.CustomerService;
import com.pls.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Uses a hard coded reference to the Customer Repository which is what Spring tries to avoid*/
		/*Tied to a concrete implementation*/
		CustomerService service=new CustomerServiceImpl();
		
		System.out.println(service.findAll().get(0).getFirstName());

	}

}
