package entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor;

@Entity
@Table(name="User")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="user")
	private String usuario;
	
	@Column(name="pass")
	private String contrasenia;
	
	public Usuario()
	{
		
	}


	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "usuario=" + usuario + ", contrasenia=" + contrasenia + "]";
	}
	
	public void init() {
		
		System.out.println("se inicia bean");
		
	}
	
	public void destroy() {
		System.out.println("se destruye bean");
		
	}
}
