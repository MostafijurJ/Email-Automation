/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailapp;

import java.util.Scanner;

/**
 *
 * @author Mr_KAJOL
 */
public class Email {
    String fstName;
    String lstName;
    String dept;
    String password;
    String email;
    int len = 5;
    String suffix = ".just.edu";
    String showinfo;
    
    public Email(String fstName, String lstName){
        this.fstName = fstName;
        this.lstName = lstName;
        System.out.println("First & Last Name is : " + this.fstName + " " + this.lstName);
        
        this.dept = setDept();
        System.out.println("Department is : "+this.dept);
        this.email = this.fstName.toLowerCase()+"."+this.lstName.toLowerCase()+"@"+ this.dept.toLowerCase()+suffix;
        System.out.println("Email is : " + this.email);
        
        this.password = setPass(); 
        System.out.println("Your random selected password(1-9) is : "+this.password);
       this.showinfo = showinfo();
        ///System.out.println("\nYour Information is \n "+this.showinfo);
    }
    
    public String setDept(){
        System.out.println("\nDepartment Codes : ");
        System.out.print("1 for CSE\n2 for EEE\n3 for PME\n4 for IPE\n0 for Nothing \n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Dept. Code : ");
        int deptcode = sc.nextInt();
        
        if(deptcode == 1){
            return "CSE";
        }
        else if(deptcode == 2){
            return "EEE";
        }
        else if(deptcode == 3){
            return "PME";
        }
        else if(deptcode == 4){
            return "IPE";
        }
        else {
            return "Nothing is Selected";
        }
    }
    
    public String setPass(){
        String pp = "0123456789!@#";
        char[] pass = new char[len];
        
        for(int i=0; i<len; i++){
            int rndm = (int)(Math.random()* pp.length());
            pass[i] = pp.charAt(rndm);
        }
        return new String(pass);
    }
    
    public String showinfo(){
        String info;
        info = "FirstName : " + this.fstName + "\nLastName : "+this.lstName+"\nDepartment :"+this.dept+"\nEmail : "+this.email+"\nPassword "+this.password;
       
        return info;
    }
    
    
}
