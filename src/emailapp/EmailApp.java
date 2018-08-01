/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailapp;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Mr_KAJOL
 */
public class EmailApp {
    
    
    public static void main(String[] args) {
        String s1 ;
        String s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter First & Last Name of the Student : ");
        s1 = sc.next();
        s2 = sc.next();
        Email em = new Email(s1,s2);
       /// System.out.println(em.showinfo);
        String a,b,c;
        a = em.dept;
        b = em.password;
        c = em.email;
        ////System.out.println(a + " " + b + " " + c);
        
         try {
            Class.forName("com.mysql.jdbc.Driver");
     Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kajol","root" ,"1234");
      Statement  st =  con.createStatement();
        int rs =  st.executeUpdate("insert into kajol.info(fname,lname,dept,email,pass) values('"+s1+"','"+s2+"','"+a+"','"+c+"','"+b+"')");
    } 
         catch (ClassNotFoundException | SQLException ex) {
           out.println("data not entered!! ");
        }
    }
    
}
