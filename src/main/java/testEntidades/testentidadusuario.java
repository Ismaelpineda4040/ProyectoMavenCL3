package testEntidades;

import dao.ClassUsuarioImp;
import model.TblUsuariocl3;

public class testentidadusuario {
	
	public static void main (String[] args){
		TblUsuariocl3 usuario = new TblUsuariocl3();
		ClassUsuarioImp crud=new ClassUsuarioImp();
		
		
		usuario.setUsuarioCl3("IsmaelPineda224441");
		usuario.setPasswordCl3("Ismael1112222233434");
		
		crud.RegistrarUsuario(usuario);
	}

}
