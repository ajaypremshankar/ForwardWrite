/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package forwardwrite;

import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author AJAY-PREM
 */
class fileOption {
forwardWrite fw;
FileNameExtensionFilter fff;
String title="forwardWrite--";
JFileChooser jfc;
    public fileOption(JFileChooser jfc) {
        this.jfc=jfc;
fw=new forwardWrite();
    }


protected void fileSave(File file1,String cont, boolean pswflag){

    StringBuilder contSb=new StringBuilder(cont);
    if(pswflag){

            if(file1.getName().endsWith(".txt"))
                file1=new File((""+file1).replaceAll(".txt",".fsw"));
            else
                if(!file1.getName().endsWith(".fsw"))
                file1=new File(""+file1+".fsw");
          fileWrite fwc=new fileWrite(file1);
          fileRead frc=new fileRead(file1);
            forwardWrite.passCheckField.setText("");
            if(frc.existsMasterFileEntry())
            {

            if(JOptionPane.showConfirmDialog(null,"Entry for File Already Exists " +
                    "in masterfile \n" +
                "Do You want to Replace" +
            " it","warning",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION)
            {
            if(!fileRead.isFileExistInDirectory(file1))
            {
            fwc.deleteEntry();
            forwardWrite.passCheckField.setText("");
            JOptionPane.showConfirmDialog(null,forwardWrite.passCheckField,"Enter a " +
           "new password for "+file1.getName()+
            "\n must be min 4 char long",JOptionPane.OK_CANCEL_OPTION);
            String pass=new String(forwardWrite.passCheckField.getPassword());

            if(fwc.writer(contSb,pass))
            fw.setTitle(title+file1.getName());
            }
            else
            {
            JOptionPane.showConfirmDialog(null,forwardWrite.passCheckField,"Enter " +
           "current password for "+file1.getName(),JOptionPane.OK_CANCEL_OPTION);
            String oldpass=new String(forwardWrite.passCheckField.getPassword());

            forwardWrite.passCheckField.setText("");
            JOptionPane.showConfirmDialog(null,forwardWrite.passCheckField,"Enter a " +
           "new password for "+file1.getName()+"\n must be min 4 char long",JOptionPane.OK_CANCEL_OPTION);
            String newpass=new String(forwardWrite.passCheckField.getPassword());

            if(fwc.saveToMaster(oldpass, newpass)){
            if(fwc.writer(contSb,newpass))
            fw.setTitle(title+file1.getName());
            }
            else{
            JOptionPane.showMessageDialog(forwardWrite.passHelpText,"password is too small \n" +
            "Enter password a that must contain atleast 4 chars");
            }
            }
            }
            }
            else{
            forwardWrite.passCheckField.setText("");
            JOptionPane.showConfirmDialog(null,forwardWrite.passCheckField,"Enter a " +
           "new password for "+file1.getName()+
            "\n must be min 4 char long",JOptionPane.OK_CANCEL_OPTION);
            String pass=new String(forwardWrite.passCheckField.getPassword());

            if(fwc.writer(contSb,pass))
            fw.setTitle(title+file1.getName());
            }
            fw.changeFlag=false;
        }
        else{
            if(!file1.getName().endsWith(".txt"))
                file1=new File(""+file1+".txt");
          fileWrite fwc=new fileWrite(file1);

            fwc.writer(contSb);
            fw.setTitle(file1.getName());
            fw.changeFlag=false;
            if(fw.newflag){
            fw.newflag=false;
            fw.write.setText("");
            fw.setTitle(title+"Untitled");
            fw.passFieldflag=false;
            }
        }
}

protected void fileFilter(){
        if(fw.pswflag){
          fff=new FileNameExtensionFilter("forwardWrite(FSW) files", "fsw");
          jfc.addChoosableFileFilter(fff);
          jfc.setFileFilter(fff);
          jfc.removeChoosableFileFilter(jfc.getChoosableFileFilters()[0]);
        }
        else{
            fff=new FileNameExtensionFilter("Other files", "txt","html","docx");
            jfc.addChoosableFileFilter(fff);
            jfc.setFileFilter(fff);
            jfc.removeChoosableFileFilter(jfc.getChoosableFileFilters()[0]);
        }

}

}
