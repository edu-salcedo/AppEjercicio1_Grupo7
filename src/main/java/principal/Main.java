package principal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.UsuarioDao;
import entidad.Usuario;
import negocio.UsuarioNegocio;

public class Main {

	static ApplicationContext appContext;
	public static void main(String[] args) {
		
		/*Usuario usuario = new Usuario();
	    usuario.setUsuario("Pepe");
	    usuario.setContrasenia("123");
	    UsuarioDao use =new UsuarioDao();
	    use.Add(usuario);
	    UsuarioNegocio usuarioNegocio = new UsuarioNegocio();
	    boolean estado= usuarioNegocio.agregarUsuario(usuario);
	    if(estado)
	    	System.out.println("Se agrego correctamente");
	    else
	    	System.out.println("No se pudo agregar, el usuario ya existe en la BD");
		    	
		*/
		
		
		appContext= new ClassPathXmlApplicationContext("resources/Beans.xml");
          
	    Usuario usuario=(Usuario)appContext.getBean("pepe");
	    UsuarioNegocio usuarioNegocio = new UsuarioNegocio();
	    usuarioNegocio.agregarUsuario(usuario);
	    boolean estado= usuarioNegocio.agregarUsuario(usuario);
	    if(estado)
	    	System.out.println("Se agrego correctamente");
	    else
	    	System.out.println("No se pudo agregar, el usuario ya existe en la BD");
	    
	    System.out.println(usuario.toString());
	    
	    ((ConfigurableApplicationContext)(appContext)).close(); 
	}
}
