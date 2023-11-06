package Controller;

import Data.FuncionarioDao;
import Domain.Funcionario;
import java.sql.SQLException;
import java.util.List;

public class FuncionarioController {

    private FuncionarioDao funcionarioDao;
    
    public FuncionarioController() {
        funcionarioDao = new FuncionarioDao();
    }
    
    public List<Funcionario> obtenerFuncionario() throws SQLException {
        return funcionarioDao.obtenerFuncionario();
    }
    
    public void crear(Funcionario funcionario) throws SQLException {
        funcionarioDao.crear(funcionario);
    }
    
    public Funcionario obtenerFuncionarioByNombre(String nombre) throws SQLException {
        return funcionarioDao.obtenerFuncionarioByNombre(nombre);
    }
    
    public void actualizarFuncionario(Long cedula, Funcionario funcionario) throws SQLException {
        funcionarioDao.actualizarFuncionario(cedula, funcionario);
    }
    
    public void eliminarFuncionario(Long cedula) throws SQLException {
        funcionarioDao.eliminarFuncionario(cedula);
    }
    
}
