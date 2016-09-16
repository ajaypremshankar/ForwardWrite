/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package forwardwrite;

/**
 *
 * @author AJAY-PREM
 */
class encDec {

    String input;

private final String keyPrime=new String("ITooHadALoveStoryByRavindraSingh");

    public StringBuilder encrypt(StringBuilder s)
    {
        int x;
        StringBuilder ret=new StringBuilder("");
        for(int i=0,j=0;i<s.length();i++,j++)
        {
        if(j>=keyPrime.length())
            j=0;
        x=keyPrime.charAt(j)%5;
        if(x==0)
            x=2;
        ret=ret.append((s.charAt(i)*x)/112);
        ret=ret.append(".");
        ret=ret.append((s.charAt(i)*x)%112);
        ret=ret.append("@");
        }
        ret=ret.append("$$~");
        int len=ret.length();
        for(int i=0;i<Math.random()*len/5;i++)
        {
          x=(int)(Math.random()*len);
          if(i%7==0){
          ret=ret.insert(i,'f');
          }
          else if(i%7==1){
          ret=ret.insert(i,'b');
          }
          else if(i%7==2){
          ret=ret.insert(i,"o");
          }
          else if(i%7==3){
          ret=ret.insert(i,'a');
          }
          else if(i%7==4){
          ret=ret.insert(i,"p");
          }
          else if(i%7==5){
          ret=ret.insert(i,'w');
          }
          else{
          ret=ret.insert(i,"v");
          }

        }
        System.out.println("RET:::  "+ret);
        return ret;
    }


    /*decryption algo*/
public StringBuilder decrypt(StringBuilder a)
    {
    String s=new String("");
    StringBuilder full=new StringBuilder("");
    int x=0,y=0,z,p;
    int len;
    String d=new String("");

    String s1=new String(a);
    
    s1=s1.replaceAll("a","");
    s1=s1.replaceAll("v","");
    s1=s1.replaceAll("p","");
    s1=s1.replaceAll("b","");
    s1=s1.replaceAll("f","");
    s1=s1.replaceAll("w","");
    s1=s1.replaceAll("o","");
    a=new StringBuilder(s1);
    len=a.length();
    for(int i=0,j=0;i<len;j++,i++)
    {
//    System.out.println(a.substring(i,i+3));
    if(a.substring(i,i+3).equals("$$~"))
    break;
    if(j>=keyPrime.length())
        j=0;
    s=s+a.charAt(i);
    do
    {
        s=s+a.charAt(++i);
    }while(a.charAt(i)!='@');
  
 //   System.out.println(s);
    for(int q=0;q<s.length();q++)
    {
    while(s.charAt(q)!='.'){
        d=d+s.charAt(q);
        q++;
    }
    
    x=Integer.parseInt(d);
    d="";
    q++;
    
    while(s.charAt(q)!='@'){
    d=d+s.charAt(q);
    q++;
    }
    
    y=Integer.parseInt(d);
    d="";
    q++;

    }
    z=x*112+y;
    p=keyPrime.charAt(j)%5;
    s="";
    if(p==0)
        p=2;
    
    for(int k=0;k<128;k++)
    {
    if(z==k*p)
    {
     full.append((char)k);
     break;
    }
    }
    }
    return full;
    }

}
