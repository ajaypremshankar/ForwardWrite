/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package forwardwrite;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author AJAY-PREM
 */
class fileWrite {


String fd="D:\\forwardWrite";
private File file;
private FileWriter fw;
private BufferedWriter bw;
encDec ed=new encDec();
private File mf=new File(fd+"\\masterfile.fsw");
String setPass,filename;
String newline=System.getProperty("line.separator");
RandomAccessFile raf;
private FileReader fr;
private BufferedReader br;


protected fileWrite(File f) {
        file=f;
        filename=new String(""+file);
    }



boolean writer(StringBuilder cont,String pass)
{
    setPass=pass;
    if(saveToMaster(setPass,true))
    {

        try{
        file=new File(filename.replaceAll(".txt",".fsw"));
        fw=new FileWriter(file);
        bw=new BufferedWriter(fw);
        bw.write(new String(ed.encrypt(cont)));
        bw.newLine();
        bw.close();
        return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    else{
            JOptionPane.showMessageDialog(forwardWrite.passHelpText,"password is too small \n" +
            "Enter password a that must contain atleast 4 chars");

        return false;
    }

}

boolean writer(StringBuilder cont)
{

    String s=new String(cont);
    s.replaceAll("\n",newline);
    try{
    fw=new FileWriter(file);
    bw=new BufferedWriter(fw);
    bw.write(s+newline);
    bw.close();
    }
    catch(IOException e)
    {
        System.out.println("err"+e);
        return false;
    }
return true;
}

boolean saveToMaster(String pass)
{
        boolean existflag=false;
try{
    String s=new String("");
    StringBuilder sb=new StringBuilder("");
    String full=new String("");
    String psw=new String("");
    String sy=new String("");
    if(mf.exists()){
     fr=new FileReader(mf);
     br=new BufferedReader(fr);
        while((s=br.readLine())!=null){
            sb=ed.decrypt(new StringBuilder(s));
            full=new String(sb);
            if(full.contains(file.getName()+"|")){
                psw=full.substring(full.indexOf("|")+1,full.indexOf("`"));
                fileRead read=new fileRead(file);
                
                if(JOptionPane.showInputDialog("Confirm old password for "+file.getName()+
                       "").equals(psw))
                {
                full=full.replace(psw+"`","")+pass+"`";
               sy=new String(ed.encrypt(new StringBuilder(full)))+newline;
               br.close();
               existflag=true;
               break;
                }
                else{
                JOptionPane.showMessageDialog(null,"Wrong password" +
                        "you cant overwrite file "+file.getName());
                return false;
                }

            }
    }
    }
    if(!existflag){
    fw=new FileWriter(mf,true);
    bw=new BufferedWriter(fw);
    full=""+file.getName()+"|"+pass+"`";
    sb=new StringBuilder(full);
    bw.write(new String(ed.encrypt(sb)).trim());
    bw.write(newline);
    bw.close();
    return true;
    }
    else{
        fr=new FileReader(mf);
        br=new BufferedReader(fr);
        String sx=new String("");
        while((sx=br.readLine())!=null){
            if(!sx.equals(s))
                sy=sy+sx+newline;
        }
        br.close();
        mf.delete();
        mf=new File("D:\\forwardWrite\\masterfile.fsw");
        fw=new FileWriter(mf);
        bw=new BufferedWriter(fw);
        bw.write(sy);
        bw.close();
        return true;
    }
    }
    catch(Exception e)
    {
        System.out.println("Something went Wrong::"+e);
        return false;
    }
}
/*while re-setting password*/
boolean saveToMaster(String oldpass,String newpass)
{
    if(newpass.length()<4)
        return false;
try{
    String s=new String("");
    StringBuilder sb=new StringBuilder("");
    String full=new String("");
    String psw=new String("");
    String sy=new String("");
     fr=new FileReader(mf);
     br=new BufferedReader(fr);
        while((s=br.readLine())!=null){
            sb=ed.decrypt(new StringBuilder(s));
            full=new String(sb);
            if(full.startsWith(file.getName()+"|")){
                psw=full.substring(full.indexOf("|")+1,full.indexOf("`"));
                if(psw.equals(oldpass))
                {
                full=full.replace(psw+"`","")+newpass+"`";
               sy=new String(ed.encrypt(new StringBuilder(full)))+newline;
               br.close();
               break;
                }
                else{
                return false;
                }
    }
    }

        fr=new FileReader(mf);
        br=new BufferedReader(fr);
        String sx=new String("");
        while((sx=br.readLine())!=null){
            if(!sx.equals(s))
                sy=sy+sx+newline;
        }
        br.close();
        mf.delete();
        mf=new File("D:\\forwardWrite\\masterfile.fsw");
        fw=new FileWriter(mf);
        bw=new BufferedWriter(fw);
        bw.write(sy);
        bw.close();
        return true;
    }
    catch(Exception e)
    {
        return false;
    }
}
/*While saving new file or initilising master password on new system*/
boolean saveToMaster(String newpass,boolean abc)
{
    if(newpass.length()<4)
        return false;
    String s=new String("");
    StringBuilder sb=new StringBuilder("");

    try{
        mf=new File(fd+"\\masterfile.fsw");
        fw=new FileWriter(mf,true);
        bw=new BufferedWriter(fw);
        s=file.getName()+"|"+newpass+"`";
        sb=ed.encrypt(new StringBuilder(s));
        bw.write(new String(sb));
        bw.newLine();
        bw.close();
        return true;
        }
        catch(Exception e){
        return false;
        }
}
void deleteEntry(){
       String s=new String("");
       String full=new String("");
       String sy=new String("");
       String name=new String("");
       StringBuilder sb=new StringBuilder("");
       boolean flag=false;
       try{
       fr=new FileReader(mf);
       br=new BufferedReader(fr);
       while((s=br.readLine())!=null){
            sb=ed.decrypt(new StringBuilder(s));
            full=new String(sb);
            if(full.startsWith(file.getName()+"|"))
            {
            name=full.substring(0,full.indexOf("|"));
            }
       }
       br.close();
       if(!name.equals(""))
       {
        fr=new FileReader(mf);
        br=new BufferedReader(fr);
        String sx=new String("");
        while((sx=br.readLine())!=null){
            if(!new String(ed.decrypt(new StringBuilder(sx))).startsWith(name))
                sy=sy+sx+newline;
        }
        br.close();
        mf.delete();
        mf=new File("D:\\forwardWrite\\masterfile.fsw");
        fw=new FileWriter(mf);
        bw=new BufferedWriter(fw);
        bw.write(sy);
        bw.close();

       }
       }
       catch(Exception e)
       {
       System.out.println("Error in deleteEntry"+e);
       }

}

}
