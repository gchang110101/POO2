package service;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {
    private static final String POSTGRE_CONNECTION = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USUARIO_DB = "postgres";
    private static final String PASSWORD_DB = "1234";

    //private static final String SQLSERVER_CONNECTION = "jdbc:sqlserver://localhost;encrypt=true;databaseName=Northwind;integratedSecurity=true;";
    //private static final String USUARIO_SQLSERVER = "sa";
    //private static final String PASSWORD_SQLSERVER = "123";

    private static DataSource instance;
    private DataSource () {

    }

    public static DataSource getInstance() {
        if (instance == null)
            instance  = new DataSource();
        return instance;
    }

    public Connection  openConnection() throws SQLException {
        Connection con = DriverManager.getConnection(POSTGRE_CONNECTION, USUARIO_DB, PASSWORD_DB);
        return con;
    }

    /* public Connection openConnectionSQLServer() throws SQLException {
       Connection con = DriverManager.getConnection(SQLSERVER_CONNECTION, USUARIO_SQLSERVER, PASSWORD_SQLSERVER);
       return con;
    } */

    public void closeConnection(Connection con) throws SQLException {
        con.close();
    }

}
