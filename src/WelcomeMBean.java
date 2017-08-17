import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class WelcomeMBean {
	
	public String getMensagemDeBoasVindas()
	{
		return "Sexta-feira com JSF.";
	}

}
