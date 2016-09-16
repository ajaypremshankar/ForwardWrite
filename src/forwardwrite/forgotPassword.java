/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package forwardwrite;

import java.awt.Color;
import java.io.*;
import java.awt.Font;
/**
 *
 * @author AJAY-PREM
 */
class forgotPassword {

    private File file;
    private String filename;
    private String fd="D:\\forwardWrite";
    private FileReader fr;
    private BufferedReader br;
    private encDec ed;
    private String password;
    String newline=System.getProperty("line.separator");


 forgotPassword(File f) {
    file=f;
    filename=""+f.getName();
    ed=new encDec();
    password=getPassword();
    }

    protected  String getPassword()
    {
       File ms=new File(fd+"\\masterfile.fsw");
       String psw=new String("");
       String s=new String("");
       String full=new String("");
       StringBuilder sb=new StringBuilder("");
       try{
       fr=new FileReader(ms);
       br=new BufferedReader(fr);
       while((s=br.readLine())!=null){

            sb=ed.decrypt(new StringBuilder(s));
            full=new String(sb);
            if(full.contains(filename+"|")){
            psw=full.substring(full.indexOf("|")+1,full.indexOf("`"));

       }
       }
       }
       catch(Exception e)
       {
       System.out.println("failed somewhere");
       }
    return psw;
    }

    protected void genHelp()
    {
            String s=new String("");
            String full=new String("");
            if(password.length()>0){
            full="HINT 1 :\n Your password is "+password.length()+" characters long ...\n\n";
            s="HINT 2 : \n Your password is something like "+password.charAt(0);
            for(int i=0;i<password.length()-2;i++)
                s=s+"*";
            if(password.length()>2)
            s=s+password.charAt(password.length()-1)+"\n";
            if(password.length()==2)
                s=s+"*";
            if(password.length()==1)
                s="(it is of Single letter)";
            full=full+s+"\n";
            }
            else{
            full="Sorry help can't be provided,\n Somthing went wrong.....";
            }
            forwardWrite.passHelpText.setFont(new Font("Courier new",Font.PLAIN,18));
            forwardWrite.passHelpText.setForeground(Color.BLUE);
            forwardWrite.passHelpText.setText(full);
            forwardWrite.passHelpDialog.setVisible(true);
            forwardWrite.passHelpDialog.setSize(600,350);
            forwardWrite.passHelpDialog.setLocation(350,180);
            forwardWrite.passHelpDialog.setTitle("Password hints for "+filename);
    }
    protected void useMasterPass(){

    }
}
