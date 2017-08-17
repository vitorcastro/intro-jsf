import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class UsuarioMBean {
	
	private Usuario usuario;
	
	@PostConstruct
	public void initUsuario()
	{
		this.usuario = new Usuario();
	}
	
	public String realizarLogin()
	{
		return "usuarioLogado";
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
