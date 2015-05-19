package ws;
 
import javax.jws.WebService;
 
//Service Implementation
@WebService(endpointInterface = "ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
 
	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}
 
        @Override
        public int getHelloInt(int name) {
            return name;
        }
}