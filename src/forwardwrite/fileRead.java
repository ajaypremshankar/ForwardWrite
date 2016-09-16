/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package forwardwrite;
import java.io.*;
/**
 *
 * @author AJAY-PREM
 */
class fileRead {

private File file; 
private FileReader fr;
private BufferedReader br;
private String fd="D:\\forwardWrite";
String filename;
encDec ed=new encDec();
String newline=System.getProperty("line.separator");



fileRead(File f)
{
file=f;
filename=new String(""+file);
}


boolean checkPassword(String getPass)
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
            if(full.contains(file.getName()+"|")){
            psw=full.substring(full.indexOf("|")+1,full.indexOf("`"));
                if(psw.equals(getPass)){
                    br.close();
                return true;
                }
                else{
                    br.close();
                return false;
                }
            }
       }

       }
       catch(Exception e)
       {
       System.out.println("failed in check pass");
       }
       return false;
       }

 String reader()
{
     String s=new String("");
     String full=new String("");
     try{
     fr=new FileReader(file);
     br=new BufferedReader(fr);
     while((s=br.readLine())!=null)
     {
     full=full+s+"\n";
     }
     br.close();
     }
     catch(IOException e)
     {
     }
     full=full.replaceAll(newline,"\n");
     return full;
}
String reader(String pass)
{
    String s=new String("");
    String full=new String("");
    StringBuilder sb=new StringBuilder("");
    if(checkPassword(pass)){
        try{
            fr=new FileReader(file);
            br=new BufferedReader(fr);
            while((s=br.readLine())!=null)
            {
             
            sb=ed.decrypt(new StringBuilder(s));
            full=full+new String(sb)+"\n";
            }
            full.replaceAll(newline,"\n");
            br.close();
        }
        catch(IOException e)
        {
            System.out.println("Cant read");
        }

    }
    else{
    return null;
    }
    return full;
}

protected boolean existsMasterFileEntry(){

       File ms=new File(fd+"\\masterfile.fsw");
       String s=new String("");
       String full=new String("");
       StringBuilder sb=new StringBuilder("");
       try{
       fr=new FileReader(ms);
       br=new BufferedReader(fr);
       while((s=br.readLine())!=null){

            sb=ed.decrypt(new StringBuilder(s));
            full=new String(sb);
            if(full.startsWith(file.getName()+"|")){
                return true;
            }
       }
       }
       catch(Exception e)
       {
           return false;
       }
    return false;
}
static boolean isFileExistInDirectory(File f){
    String parent=f.getParent();
    File arr[]=new File(parent).listFiles();
    for(int i=0;i<arr.length;i++){
    if(arr[i].equals(f)){
    return true;
    }
    }
    return false;
}
}
