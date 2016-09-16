/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package forwardwrite;
import java.io.*;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author AJAY-PREM
 */
class viewOption {

    String fd;
    File fDir,file;
    File list[];

    FileNameExtensionFilter fff;
    public viewOption(File f) {
        fd=new String(""+f);
        fDir=f.getAbsoluteFile();
    }

    void genViewList(){

    if(fDir.isDirectory())
    {
     list=fDir.listFiles();
    }
    String item[]=new String[list.length];
    for(int i=0,j=0;i<list.length;i++){
    if(!list[i].isDirectory()){
        System.out.println(list[i].getName());
        if(list[i].getName().endsWith(".fsw")){
        item[j++]=new String(list[i].getName());
        }
    }
    }

    if(item.length>0){
        forwardWrite.viewList=new JList(item);
        forwardWrite.popUpMenu.add(forwardWrite.viewList);
        forwardWrite.popUpMenu.setLocation(500,300);
        forwardWrite.popUpMenu.setVisible(true);

    }
    else{
    JOptionPane.showMessageDialog(null,"No files in selected Directory");
    }
    }
}
