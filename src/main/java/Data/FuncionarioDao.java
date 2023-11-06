package Data;

import BD.ConnectionUtil;
import Domain.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDao {

    // CONSTANTE DE CONSULTA MYSQL
    private static final String GET_FUNCIONARIO = "SELECT * FROM Funcionario";

    private static final String CREATE_FUNCIONARIO = "INSERT INTO Funcionario (tipo, cedula_fun ,nombre ,apellido ,estado_civil ,telefono ,sexo ,fecha_nacimiento ,direccion) "
            + "VALUES(? ,? ,? ,? , ?, ?, ?, ?,?)";

    private static final String GET_FUNCIONARIO_BY_NOMBRE = "SELECT * FROM Funcionario WHERE nombre = ? ";

    private static final String UPDATE_FUNCIONARIO = "UPDATE Funcionario SET tipo = ?, nombre = ?, apellido = ?, estado_civil = ?, "
            +"  telefono = ?, sexo = ?, fecha_nacimiento = ?, direccion = ? where cedula_fun = ? ";

    private static final String DELETE_FUNCIONARIO = "DELETE FROM Funcionario WHERE cedula_fun = ? ";

    
    
    //METODO DE LISTAR FUNCIONARIO
    public List<Funcionario> obtenerFuncionario() throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Funcionario> funcionarios = new ArrayList<>();

        try {

            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(GET_FUNCIONARIO);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {

                Funcionario funcionario = new Funcionario();
                funcionario.setTipo(resultSet.getString("tipo"));
                funcionario.setCedula(resultSet.getLong("cedula_fun"));
                funcionario.setNombre(resultSet.getString("nombre"));
                funcionario.setApellido(resultSet.getString("apellido"));
                funcionario.setEstado(resultSet.getString("estado_civil"));
                funcionario.setTelefono(resultSet.getLong("telefono"));
                funcionario.setSexo(resultSet.getString("sexo"));
                funcionario.setFecha_naci(resultSet.getString("fecha_nacimiento"));
                funcionario.setDireccion(resultSet.getString("direccion"));
                funcionarios.add(funcionario);
            }
            return funcionarios;

        } finally {

            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (resultSet != null) {
                resultSet.close();
            }
        }
    }
    
    //METODO DE GUARDAR FUNCIONARIO
    public void crear(Funcionario funcionario) throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareCall(CREATE_FUNCIONARIO);
            preparedStatement.setString(1, funcionario.getTipo());
            preparedStatement.setLong(2, funcionario.getCedula());
            preparedStatement.setString(3, funcionario.getNombre());
            preparedStatement.setString(4, funcionario.getApellido());
            preparedStatement.setString(5, funcionario.getEstado());
            preparedStatement.setLong(6, funcionario.getTelefono());
            preparedStatement.setString(7, funcionario.getSexo());
            preparedStatement.setString(8, funcionario.getFecha_naci());
            preparedStatement.setString(9, funcionario.getDireccion());
            preparedStatement.executeUpdate();

        } finally {
            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }
    
    //METODO DE BUSCAR FUNCIONARIO POR NOMBRE
    public Funcionario obtenerFuncionarioByNombre(String nombre) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Funcionario funcionario = null;

        try {

            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(GET_FUNCIONARIO_BY_NOMBRE);
            preparedStatement.setString(1, nombre);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                funcionario = new Funcionario();
                funcionario.setTipo(resultSet.getString("tipo"));
                funcionario.setCedula(resultSet.getLong("cedula_fun"));
                funcionario.setNombre(resultSet.getString("nombre"));
                funcionario.setApellido(resultSet.getString("apellido"));
                funcionario.setEstado(resultSet.getString("estado_civil"));
                funcionario.setTelefono(resultSet.getLong("telefono"));
                funcionario.setSexo(resultSet.getString("sexo"));
                funcionario.setFecha_naci(resultSet.getString("fecha_nacimiento"));
                funcionario.setDireccion(resultSet.getString("direccion"));

            }
            return funcionario;

        } finally {

            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (resultSet != null) {
                resultSet.close();
            }
        }
    }
    
    //METODO DE ACTUALIZAR FUNCIONARIO
    public void actualizarFuncionario(Long cedula, Funcionario funcionario) throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(UPDATE_FUNCIONARIO);
            preparedStatement.setString(1, funcionario.getTipo());
            preparedStatement.setString(2, funcionario.getNombre());
            preparedStatement.setString(3, funcionario.getApellido());
            preparedStatement.setString(4, funcionario.getEstado());
            preparedStatement.setLong(5, funcionario.getTelefono());
            preparedStatement.setString(6, funcionario.getSexo());
            preparedStatement.setString(7, funcionario.getFecha_naci());
            preparedStatement.setString(8, funcionario.getDireccion());
            preparedStatement.setLong(9, cedula);
            preparedStatement.executeUpdate();

        } finally {
            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }

    //METODO DE ELIMIAR FUNCIONARIO
    public void eliminarFuncionario(Long cedula) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(DELETE_FUNCIONARIO);
            preparedStatement.setLong(1, cedula);
            preparedStatement.executeUpdate();

        } finally {
            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }
}
