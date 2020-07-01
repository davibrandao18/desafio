package service;

import dao.UsuarioDao;
import model.Usuario;

public class UsuarioService {
    
    private UsuarioDao dao = new UsuarioDao();
    
    
    public boolean criar(Usuario usuario) {
        if (Auth(usuario)) {
            dao.inserirUsuario(usuario);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean Auth(Usuario usuario) {
        if (usuario.equals(null)){
            return false;
        } else if (usuario.getCpf() != null && !usuario.getCpf().equals("")) {
            if (usuario.getCpf().length() == 11)
                return true;
        } else if (usuario.getEmail() != null && !usuario.getEmail().equals("")){
            return true;
        }
        return false;
    }

}