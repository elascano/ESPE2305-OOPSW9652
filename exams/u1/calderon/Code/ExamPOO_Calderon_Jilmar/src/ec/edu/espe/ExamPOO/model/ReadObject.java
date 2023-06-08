
package ec.edu.espe.ExamPOO.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class ReadObject {

    public ReadObject(int par, String samsung, String a10) {
    }
public static void main(String[] args){
    
    List<ReadObject> readObject = new ArrayList<>();

        readObject.add(new ReadObject(1, "Samsung", "A10"));
        readObject.add(new ReadObject(2, "Samsung", "A20"));
        readObject.add(new ReadObject(3, "Xiaomi", "X1"));
        readObject.add(new ReadObject(4, "Poco", "F40"));
        readObject.add(new ReadObject(5, "Huawei", "Mlite30"));


        int count = countObjects(readObject);
        System.out.println("Total number of objects stored: " + count);

    }

    public static int countObjects(List<ReadObject> students) {
        return students.size();
    }
}