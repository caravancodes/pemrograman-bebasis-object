/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjform;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Driver;
import java.sql.DriverManager;

/**
 *
 * @author Rivkal
 */
public class koneksi {
   private Statement statement;
   private Connection connection;
   private ResultSet reusltset;
   private String driver="com.mysql.jdbc.Driver";
   private String url="jdbc:mysql://localhost:3306/rare";
   private String user="root";
   private String pw="";

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public ResultSet getReusltset() {
        return reusltset;
    }

    public void setReusltset(ResultSet reusltset) {
        this.reusltset = reusltset;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
   public void connect_to_db(){
       try {
           Class.forName(driver);
           connection=DriverManager.getConnection(url,user,pw);
           System.out.println("koneksi berhasil");
       } catch (Exception e) {
           System.out.println("koneksi gagal");
       }
   }
   
}
