package com.mycompany.web.models;
import com.mycompany.web.models.Cliente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class AccionesCliente {
//INSERTAR REGISTRO
public static int registrarCliente(Cliente c){
    int estado = 0;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver"); //OJO!!!EN CADA CONECCION DEBEREMOS CARGAR LA CLASE PRIMERO PARA PODER IDENTIFICAR AL DRIVER Y CONECTARNOS A LA BBDD
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/proyecto","root","");

        String query = "INSERT INTO `cliente` (nombres,apellidos,contacto) VALUES (?,?,?)";

        
        String nombre = c.getNombre();
        String apellido = c.getApellido();
        String contacto = c.getContacto();

        PreparedStatement pst = conexion.prepareStatement(query);
        
        pst.setString(1, nombre);
        pst.setString(2, apellido);
        pst.setString(3, contacto);

        estado = pst.executeUpdate();

        conexion.close();


    } catch (Exception e){
        System.out.println(e);
        System.out.println("Ocurrio un error al conectar.");
    }

    return estado;
}

//ACTUALIZAR REGISTRO

public static int actualizarCliente(Cliente c){
    int estado = 0;

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/proyecto","root","");

        String query = "UPDATE cliente SET nombres=?,apellidos=?,contacto=? WHERE id_cliente=?";

        int id = c.getId();
        String nombre = c.getNombre();
        String apellido = c.getApellido();
        String contacto = c.getContacto();

        PreparedStatement pst = conexion.prepareStatement(query);
        
        pst.setString(1, nombre);
        pst.setString(2, apellido);
        pst.setString(3, contacto);
        pst.setInt(4, id);

        estado = pst.executeUpdate();

        conexion.close();


    } catch (Exception e){
        System.out.println("Ocurrio un error al conectar.");
    }

    return estado;
}

//CONSULTAR REGISTRO ID

public static Cliente verCliente(int idAConsultar){
    Cliente clienteADevolver = new Cliente();

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/proyecto","root","");

        String query = "SELECT * FROM cliente WHERE id_cliente=?";

        PreparedStatement pst = conexion.prepareStatement(query);
        
        pst.setInt(1, idAConsultar);

        ResultSet consultaCliente = pst.executeQuery();

        if (consultaCliente.next()){
            clienteADevolver.setId( consultaCliente.getInt(1));
            clienteADevolver.setNombre( consultaCliente.getString(2));
            clienteADevolver.setApellido( consultaCliente.getString(3));
            clienteADevolver.setContacto( consultaCliente.getString(4));
            conexion.close();
        }
    } catch (Exception e){
        System.out.println(e);
        System.out.println("Ocurrio un error al conectar.");
    }

    return clienteADevolver;
}    

//CONSULTA TODOS LOS REGISTROS

public static List<Cliente> verTodosClientes(){
    List<Cliente> listaClientesADevolver = new ArrayList<Cliente>();
    

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/proyecto","root","");

        String query = "SELECT * FROM cliente";

        PreparedStatement pst = conexion.prepareStatement(query);

        ResultSet consultaCliente = pst.executeQuery();

        while (consultaCliente.next()){
            Cliente clienteADevolver = new Cliente(); //EN CADA VUELTA NECESITAREMOS INSTANCIAR UN NUEVO OBJETO
            clienteADevolver.setId( consultaCliente.getInt(1));
            clienteADevolver.setNombre( consultaCliente.getString(2));
            clienteADevolver.setApellido( consultaCliente.getString(3));
            clienteADevolver.setContacto( consultaCliente.getString(4));
            listaClientesADevolver.add(clienteADevolver);
        }
        conexion.close();
    } catch (Exception e){
        System.out.println(e);
        System.out.println("Ocurrio un error al conectar.");
    }

    return listaClientesADevolver;
} 
}
