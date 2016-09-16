/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package forwardwrite;

import java.io.File;

/**
 *
 * @author AJAY-PREM
 */
class initApp {

            File mfile;
    initApp() {

        mfile=new File("D:\\forwardWrite\\masterfile.fsw");
        if(!mfile.exists())
        {
            try{
            mfile.createNewFile();
            }
            catch(Exception e){
            }
        }
    }

    boolean isMasterPswSet(){
        fileRead frc=new fileRead(mfile);
        StringBuilder cont=new StringBuilder(frc.reader());
        encDec ed=new encDec();
        if(new String(ed.decrypt(cont)).contains("masterfile.fsw|"))
            return true;
        else
            return false;
    }


    static void hideMaster(){
    try{
        Runtime.getRuntime().exec("attrib +H +S D:\\forwardWrite\\masterfile.fsw");
        Runtime.getRuntime().exec("attrib +H +S D:\\forwardWrite\\votefile.vote");
        }
        catch(Exception e){
        }
    }

    static void initHelpDia(){
            forwardWrite.initHelpDialog.setAlwaysOnTop(true);
          if(forwardWrite.initHelpFlag.isSelected()){
            forwardWrite.initHelpDialog.setTitle("Tips For You");
            forwardWrite.initHelpDialog.setLocation(400,200);
            forwardWrite.initHelpDialog.setSize(400,350);
            long rand=(long)(Math.random()*10+1);
            File helpfile=new File("D:\\forwardWrite\\help.txt");
            try{
//            Runtime.getRuntime().exec("Attrib  D:\\forwardWrite\\help.txt");
            }
            catch(Exception e){}
            fileRead frc=new fileRead(helpfile);
            String str=frc.reader();
            String con=new String("");
            char ch=' ';
            System.out.println(rand);
            for(int i=0;i<str.length();i++)
            {
            ch=str.charAt(i);
            if((ch+"").equalsIgnoreCase(""+rand)){
                ch=str.charAt(++i);
                if(rand<9){
            while(!(""+ch).equalsIgnoreCase(""+(rand+1)))
            {
            con=con+ch;
            if(++i<str.length())
            ch=str.charAt(i);
            else
                break;
            }
            break;
            }
            else{
            while(!(""+ch+str.charAt(i+1)).equalsIgnoreCase(""+(rand+1)))
            {
            con=con+ch;
            if(++i<str.length())
            ch=str.charAt(i);
            else
                break;
            }
            break;
                }
            }
            }
            con=con.replaceAll("\n\r","\n");
            forwardWrite.initHelpCont.setText(con);
            forwardWrite.initHelpDialog.setVisible(true);
            }
    }
}