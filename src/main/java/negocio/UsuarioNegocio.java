package negocio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.UsuarioDao;
import entidad.Usuario;

public class UsuarioNegocio {

	private UsuarioDao usuarioDao;
	
	public boolean agregarUsuario(Usuario usuario)
	{
		ApplicationContext appContext= new ClassPathXmlApplicationContext("resources/Beans.xml");
		usuarioDao=(UsuarioDao)appContext.getBean("UsuarioDaoBean");
		boolean existe = usuarioDao.Exist(usuario.getUsuario());
		if(existe ==false)
		{
			usuarioDao.Add(usuario);
			((ConfigurableApplicationContext)(appContext)).close(); 
			return true;
		}
		((ConfigurableApplicationContext)(appContext)).close(); 
		return false;
		
	}
}
