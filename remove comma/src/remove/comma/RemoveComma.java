/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remove.comma;

/**
 *
 * @author MOHAMED HASSAN
 */
public class RemoveComma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       String str = "mohamed,waheed,mohamed";
//        str = str.replaceAll(","," ");
//        System.out.println(str); 
        /* another way */
        StringBuffer line =new StringBuffer("heloo,,,,world,,");
        for(int i =0;i<line.length();++i){
            char ch =line.charAt(i);
            if(ch == ','){
                line.deleteCharAt(i);
                System.out.println("done");
            }
        }
        System.out.println(line);
        
        
        
    }
    
}
