/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.patternshomework.controller;

import ec.edu.espe.patternshomework.model.HomeSchool;
import ec.edu.espe.patternshomework.model.Student;
import ec.edu.espe.patternshomework.model.StudentsComposite;
import java.awt.Button;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.w3c.dom.Document;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 * @author Oswaldo Tipan
 */
public class StudentController {
    
    public void addTableData(StudentsComposite studentsComposite) {
        
        ArrayList<Student> homeSchool= new ArrayList<>(studentsComposite.getHomeSchool());
        JFrame frame = new JFrame("Students");
        JTable table = new JTable();
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Course");
        tableModel.addColumn("Name");
        tableModel.addColumn("Age");
        for (Student student : homeSchool){
            tableModel.addRow(new Object[]{studentsComposite.getCourse(), student.getName(),student.getAge()});
        }
        table.setModel(tableModel);
        frame.add(new JScrollPane(table));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
