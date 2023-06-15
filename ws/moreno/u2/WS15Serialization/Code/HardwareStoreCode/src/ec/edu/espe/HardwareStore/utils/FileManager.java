
package ec.edu.espe.HardwareStore.utils;

import ec.edu.espe.HardwareStore.controller.HammerData;
import ec.edu.espe.HardwareStore.model.Hammer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class FileManager {
    public static void saveObject(){
        FileOutputStream fos=null;
        ObjectOutputStream exit=null;
        ArrayList<Hammer> list=new ArrayList<>();
        Hammer h;
        try{
            fos = new FileOutputStream("Data\\Hammers.dat");
            exit = new ObjectOutputStream(fos);
            h= HammerData.registerHammer();
            list.add(h);
            exit.writeObject(list);
            
        } catch(FileNotFoundException e){
                System.out.println("1"+e.getMessage());
        }catch (IOException e){
                System.out.println("2"+e.getMessage());
        }finally{
            try{ 
                if(fos!=null){
                    fos.close();
                }
                if(exit !=null){
                    exit.close();
                }
            }catch(IOException e){
                System.out.println("3"+e.getMessage());
            }
            
        }
    }
    
    public static void readObject(){
        FileInputStream fis= null;
        ObjectInputStream obj =null;
        ArrayList<Hammer> list2=new ArrayList<>();
        try{
            fis= new FileInputStream("Data\\Hammers.dat");
            obj= new ObjectInputStream(fis);
            list2= (ArrayList<Hammer>)obj.readObject();
            obj.close();
            
            System.out.println("-----Data-----");
            
            for(int i=0;i<list2.size();i++){
                System.out.println("Data{"+i+"}=" + list2.get(i));
            }
            
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally{
            try{
                if(fis != null){
                    fis.close();
                }
                if(obj != null){
                    obj.close();
                }
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
        
    }
}
