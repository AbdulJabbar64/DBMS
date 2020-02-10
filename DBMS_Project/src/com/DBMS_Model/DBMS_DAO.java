/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.DBMS_Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Abdul Jabbar
 */
public class DBMS_DAO {
    Connection connection=ConnectionUtil.getConnection();
    Statement stmt=null;
    PreparedStatement pstmt=null;
    ResultSet result=null;
    
    public static DBMS_DAO getObjectDB(){
        return new DBMS_DAO();
    }
    
    public void insertEmployee(String name,String email,String address,String desi,String id,int phone){
        try{
            //Anomalies_Page ap=new Anomalies_Page();
            System.out.println(name);
            String sql1="INSERT INTO employee (emp_id,emp_name,emp_email,emp_ph_no,emp_address,emp_designation, chairman) VALUES(?,?,?,?,?,?,?)";
            System.out.println(name+" 1");
            pstmt=connection.prepareStatement(sql1);
            System.out.println(name+" 2");
            pstmt.setString(1,id);
            pstmt.setString(2,name);
            pstmt.setString(3,email);
            pstmt.setInt(4,phone);
            pstmt.setString(5,address);
            pstmt.setString(6,desi);
            pstmt.setString(7,"1");
            System.out.println(name+" 3");
            int row=pstmt.executeUpdate();
            System.out.println(row);
        }catch(SQLException w) {
            JOptionPane.showMessageDialog(null,"Already inserted that employee with this id","Error",JOptionPane.ERROR_MESSAGE);
            System.out.println(w.getMessage());
        }
    }
    public void insertCourse(String title,String area,String pre,int code,int hours,String id){
        try{
            //Anomalies_Page ap=new Anomalies_Page();
            String sql1="INSERT INTO course (course_code,course_title,credit_hours,knowlege_area,pre_requisite,emp_id) VALUES(?,?,?,?,?,?)";
            pstmt=connection.prepareStatement(sql1);
            pstmt.setInt(1,code);
            pstmt.setString(2,title);
            pstmt.setInt(3,hours);
            pstmt.setString(4,area);
            pstmt.setString(5,pre);
            pstmt.setString(6,id);
            int row=pstmt.executeUpdate();
            System.out.println(row);
        }catch(SQLException w) {
            JOptionPane.showMessageDialog(null,"Already inserted that employee with this id","Error",JOptionPane.ERROR_MESSAGE);
            //System.out.println(w.getMessage());
        }
    }
    public void insertCourseBook(String title,int id,int code){
        try{
            //Anomalies_Page ap=new Anomalies_Page();
            String sql1="INSERT INTO course_book (book_id,book_title,course_code) VALUES(?,?,?)";
            pstmt=connection.prepareStatement(sql1);
            //System.out.println(ap.emp_id.getText()+"   ssa");
            pstmt.setInt(1,id);
            pstmt.setString(2,title);
            pstmt.setInt(3,code);
            int row=pstmt.executeUpdate();
            System.out.println(row);
        }catch(SQLException w) {
            JOptionPane.showMessageDialog(null,"Already inserted that employee with this id","Error",JOptionPane.ERROR_MESSAGE);
            //System.out.println(w.getMessage());
        }
    }
    public void insertProject(String title,String type,String submit,int batch,int id,String sup){
        try{
            //Anomalies_Page ap=new Anomalies_Page();
            String sql1="INSERT INTO project (pro_id,pro_title,batch,pro_type,supervior,submitted) VALUES(?,?,?,?,?,?)";
            pstmt=connection.prepareStatement(sql1);
            //System.out.println(ap.emp_id.getText()+"   ssa");
            pstmt.setInt(1,id);
            pstmt.setString(2,title);
            pstmt.setInt(3,batch);
            pstmt.setString(4,type);
            pstmt.setString(5,sup);
            pstmt.setString(6,submit);
            int row=pstmt.executeUpdate();
            System.out.println(row);
        }catch(SQLException w) {
            JOptionPane.showMessageDialog(null,"Already inserted that employee with this id","Error",JOptionPane.ERROR_MESSAGE);
            //System.out.println(w.getMessage());
        }
    }
    public void insertNotes(String submit,int code,int id,int emp_id){
        try{
            //Anomalies_Page ap=new Anomalies_Page();
            String sql1="INSERT INTO notes (note_id,course_code,emp_id,submitted) VALUES(?,?,?,?)";
            pstmt=connection.prepareStatement(sql1);
            //System.out.println(ap.emp_id.getText()+"   ssa");
            pstmt.setInt(1,id);
            pstmt.setInt(2,code);
            pstmt.setInt(3,emp_id);
            pstmt.setString(4,submit);
            int row=pstmt.executeUpdate();
            System.out.println(row);
        }catch(SQLException w) {
            JOptionPane.showMessageDialog(null,"Already inserted that employee with this id","Error",JOptionPane.ERROR_MESSAGE);
            //System.out.println(w.getMessage());
        }
    }
    public void insertThesis(String title,String type,int batch,int id,int project){
        try{
            //Anomalies_Page ap=new Anomalies_Page();
            String sql1="INSERT INTO thesis (thesis_id,thesis_title,batch,thesis_type,pro_id) VALUES(?,?,?,?,?)";
            pstmt=connection.prepareStatement(sql1);
            //System.out.println(ap.emp_id.getText()+"   ssa");
            pstmt.setInt(1,id);
            pstmt.setString(2,title);
            pstmt.setInt(3,batch);
            pstmt.setString(4,type);
            pstmt.setInt(5,project);
            int row=pstmt.executeUpdate();
            System.out.println(row);
        }catch(SQLException w) {
            JOptionPane.showMessageDialog(null,"Already inserted that employee with this id","Error",JOptionPane.ERROR_MESSAGE);
            //System.out.println(w.getMessage());
        }
    }
    public void insertPublication(String title,String type,int year,String emp_id,int id){
        try{
            String sql1="INSERT INTO publications (pub_id,pub_title,pub_type,pub_year,emp_id) VALUES(?,?,?,?,?)";
            pstmt=connection.prepareStatement(sql1);
            pstmt.setInt(1,id);
            pstmt.setString(2,title);
            pstmt.setString(3,type);
            pstmt.setInt(4,year);
            pstmt.setString(5,emp_id);
            int row=pstmt.executeUpdate();
            System.out.println(row);
        }catch(SQLException w) {
            JOptionPane.showMessageDialog(null,"Already inserted that employee with this id","Error",JOptionPane.ERROR_MESSAGE);
            System.out.println(w.getMessage());
        }
    }
    public void insertBookAuthor(String author,int book_id,int author_id){
        try{
            //Anomalies_Page ap=new Anomalies_Page();
            String sql1="INSERT INTO book_author (author_id,author,book_id) VALUES(?,?,?)";
            pstmt=connection.prepareStatement(sql1);
            pstmt.setInt(1,author_id);
            pstmt.setString(2,author);
            pstmt.setInt(3,book_id);
            int row=pstmt.executeUpdate();
            System.out.println(row);
        }catch(SQLException w) {
            JOptionPane.showMessageDialog(null,"Already inserted that employee with this id","Error",JOptionPane.ERROR_MESSAGE);
            System.out.println(w.getMessage());
        }
    }
    public void insertTtp(String link,int code,int id){
        try{
            String sql1="INSERT INTO ttp (ttp_id,ttp_link,course_code) VALUES(?,?,?)";
            pstmt=connection.prepareStatement(sql1);
            pstmt.setInt(1,id);
            pstmt.setString(2,link);
            pstmt.setInt(3,code);
            int row=pstmt.executeUpdate();
            System.out.println(row);
        }catch(SQLException w) {
            JOptionPane.showMessageDialog(null,"Already inserted that employee with this id","Error",JOptionPane.ERROR_MESSAGE);
            System.out.println(w.getMessage());
        }
    }
   
    public void deleteEmployee(String id){
        try{
            //Anomalies_Page ap=new Anomalies_Page();
            stmt=connection.createStatement();
            String sql1="DELETE FROM employee WHERE emp_id='"+id+"'";
            int row=stmt.executeUpdate(sql1);
            System.out.println(row);
        }catch(SQLException w) {
            JOptionPane.showMessageDialog(null,"Already inserted that employee with this id","Error",JOptionPane.ERROR_MESSAGE);
            System.out.println(w.getMessage());
        }
    }
    public void deleteCourse(int courseCode){
        try{
        stmt=connection.createStatement();
        String sql="DELETE FROM course where course_code='"+courseCode+"'";
        int row=stmt.executeUpdate(sql);
        System.out.println(row);
        }catch(SQLException d){
            JOptionPane.showMessageDialog(null, "Cannot delete course: due to: "+d.getMessage());
        }
    }
    public void deleteCourseBook(int bookId){
        try{
        stmt=connection.createStatement();
        String sql="DELETE FROM course_book where book_id ='"+bookId+"'";
        int row=stmt.executeUpdate(sql);
        System.out.println(row);
        }catch(SQLException d){
            JOptionPane.showMessageDialog(null, "Cannot delete book due to: "+d.getMessage());
        }
    }
    public void deleteProject(int proId){
        try{
        stmt=connection.createStatement();
        String sql="DELETE FROM project where pro_id ='"+proId+"'";
        int row=stmt.executeUpdate(sql);
        System.out.println(row);
        }catch(SQLException d){
            JOptionPane.showMessageDialog(null, "Cannot delete project: due to: "+d.getMessage());
        }
    }
    public void deleteNotes(int noteId){
        try{
        stmt=connection.createStatement();
        String sql="DELETE FROM notes where note_id= '"+noteId+"'";
        int row=stmt.executeUpdate(sql);
        System.out.println(row);
        }catch(SQLException d){
            JOptionPane.showMessageDialog(null, "Cannot delete notes: due to: "+d.getMessage());
        }
    }
    public void deleteThesis(int thesisId){
        try{
        stmt=connection.createStatement();
        String sql="DELETE FROM thesis where thesis_id ='"+thesisId+"'";
        int row=stmt.executeUpdate(sql);
        System.out.println(row);
        }catch(SQLException d){
            JOptionPane.showMessageDialog(null, "Cannot delete Thesis: due to: "+d.getMessage());
        }
    }
    public void deletePublication(int pubId){
        try{
        stmt=connection.createStatement();
        String sql="DELETE FROM publications where pub_id ='"+pubId+"'";
        int row=stmt.executeUpdate(sql);
        System.out.println(row);
        }catch(SQLException d){
            JOptionPane.showMessageDialog(null, "Cannot delete publications: due to: "+d.getMessage());
        }
    }
    public void deleteBookAuthor(int authorId){
        try{
        stmt=connection.createStatement();
        String sql="DELETE FROM book_author where author_id= '"+authorId+"'";
        int row=stmt.executeUpdate(sql);
        System.out.println(row);
        }catch(SQLException d){
            JOptionPane.showMessageDialog(null, "Cannot delete course: due to: "+d.getMessage());
        }
    }
    public void deleteTtp(int ttpId){
        try{
        stmt=connection.createStatement();
        String sql="DELETE FROM ttp where ttp_id ='"+ttpId+"'";
        int row=stmt.executeUpdate(sql);
        System.out.println(row);
        }catch(SQLException d){
            JOptionPane.showMessageDialog(null, "Cannot delete ttp: due to: "+d.getMessage());
        }
    }
    
    public void updateEmployee(String name,String email,String address,String desi,String id,int phone){
        try{
            String sql1="UPDATE employee SET emp_name=?,emp_email=?,emp_ph_no=?,emp_address=?,emp_designation=?,chairman=? WHERE emp_id='"+id+"'";
            pstmt=connection.prepareStatement(sql1);
            pstmt.setString(1,name);
            pstmt.setString(2,email);
            pstmt.setInt(3,phone);
            pstmt.setString(4,address);
            pstmt.setString(5,desi);
            pstmt.setString(6,"1");
            int row=pstmt.executeUpdate();
            System.out.println(row);
        }catch(SQLException w) {
            JOptionPane.showMessageDialog(null,"Already inserted that employee with this id","Error",JOptionPane.ERROR_MESSAGE);
            System.out.println(w.getMessage());
        }
    }
    public void updateCourse(String title,String area,String pre,int code,int hours,String id){
        try{
            String sql1="UPDATE course SET course_title=?,credit_hours=?,knowlege_area=?,pre_requisite=?,emp_id=? WHERE course_code='"+code+"'";
            pstmt=connection.prepareStatement(sql1);
            pstmt.setString(1,title);
            pstmt.setInt(2,hours);
            pstmt.setString(3,area);
            pstmt.setString(4,pre);
            pstmt.setString(5,id);
            int row=pstmt.executeUpdate();
            System.out.println(row);
        }catch(SQLException w) {
            JOptionPane.showMessageDialog(null,"Already inserted that employee with this id","Error",JOptionPane.ERROR_MESSAGE);
            System.out.println(w.getMessage());
        }
    }
    public void updateCourseBook(String title,int id,int code){
        try{
            String sql1="UPDATE course_book SET book_title=?,course_code=? WHERE book_id='"+id+"'";
            pstmt=connection.prepareStatement(sql1);
            pstmt.setString(1,title);
            pstmt.setInt(2,code);
            int row=pstmt.executeUpdate();
            System.out.println(row);
        }catch(SQLException w) {
            JOptionPane.showMessageDialog(null,"Already inserted that employee with this id","Error",JOptionPane.ERROR_MESSAGE);
            System.out.println(w.getMessage());
        }
    }
    public void updateProject(String title,int  batch,String type,String sup,String submit,int id){
        try{
            String sql1="UPDATE project SET pro_title=?,batch=?,pro_type=?,supervior=?,submitted=? WHERE pro_id='"+id+"'";
            pstmt=connection.prepareStatement(sql1);
            pstmt.setString(1,title);
            pstmt.setInt(2,batch);
            pstmt.setString(3,type);
            pstmt.setString(4,sup);
            pstmt.setString(5,submit);
            int row=pstmt.executeUpdate();
            System.out.println(row);
        }catch(SQLException w) {
            JOptionPane.showMessageDialog(null,"Already inserted that employee with this id","Error",JOptionPane.ERROR_MESSAGE);
            System.out.println(w.getMessage());
        }
    }
    public void updateNotes(int code,int emp_id,String submit,int id){
        try{
            String sql1="UPDATE notes SET course_code=?,emp_id=?,submitted=? WHERE note_id='"+id+"'";
            pstmt=connection.prepareStatement(sql1);
            pstmt.setInt(1,code);
            pstmt.setInt(2,emp_id);
            pstmt.setString(3,submit);
            int row=pstmt.executeUpdate();//note_id, course_code, emp_id, submitted
            System.out.println(row);
        }catch(SQLException w) {
            JOptionPane.showMessageDialog(null,"Already inserted that employee with this id","Error",JOptionPane.ERROR_MESSAGE);
            System.out.println(w.getMessage());
        }
    }
    public void updateThesis(String title,int batch,String type,int project,int id){
        try{
            //Anomalies_Page ap=new Anomalies_Page();
            String sql1="UPDATE thesis SET thesis_title=?,batch=?,thesis_type=?,pro_id=? WHERE thesis_id='"+id+"'";
            pstmt=connection.prepareStatement(sql1);
            pstmt.setString(1,title);
            pstmt.setInt(2,batch);
            pstmt.setString(3,type);
            pstmt.setInt(4,project);
            int row=pstmt.executeUpdate();
            System.out.println(row);
        }catch(SQLException w) {
            JOptionPane.showMessageDialog(null,"Already inserted that employee with this id","Error",JOptionPane.ERROR_MESSAGE);
            System.out.println(w.getMessage());
        }
    }
    public void updatePublication(String title,String type,int year,String emp_id,int id){
        try{
            String sql1="UPDATE publications SET pub_title=?,pub_type=?,pub_year=?,emp_id=? WHERE pub_id='"+id+"'";
            pstmt=connection.prepareStatement(sql1);
            pstmt.setString(1,title);
            pstmt.setString(2,type);
            pstmt.setInt(3,year);
            pstmt.setString(4,emp_id);
            int row=pstmt.executeUpdate();
            System.out.println(row);
        }catch(SQLException w) {
            JOptionPane.showMessageDialog(null,"Already inserted that employee with this id","Error",JOptionPane.ERROR_MESSAGE);
            System.out.println(w.getMessage());
        }
    }
    public void updateBookAuthor(String author,int book_code,int id){
        try{
            String sql1="UPDATE book_author SET author=?,book_id=? WHERE author_id='"+id+"' ";
            pstmt=connection.prepareStatement(sql1);
            pstmt.setString(1,author);
            pstmt.setInt(2,book_code);
            int row=pstmt.executeUpdate();
            System.out.println(row);
        }catch(SQLException w) {
            JOptionPane.showMessageDialog(null,"Already inserted that employee with this id","Error",JOptionPane.ERROR_MESSAGE);
            System.out.println(w.getMessage());
        }
    }
    public void updateTtp(String link,int code,int id){
        try{
            String sql1="UPDATE ttp SET ttp_link=?,course_code=? WHERE ttp_id='"+id+"' ";
            pstmt=connection.prepareStatement(sql1);
            pstmt.setString(1,link);
            pstmt.setInt(2,code);
            int row=pstmt.executeUpdate();//ttp_id, ttp_link, course_code
            System.out.println(row);
        }catch(SQLException w) {
            JOptionPane.showMessageDialog(null,"Already inserted that employee with this id","Error",JOptionPane.ERROR_MESSAGE);
            System.out.println(w.getMessage());
        }
    }
    
    public ResultSet getEmployee(){
        try {
            stmt= connection.createStatement();
            String sql="SELECT * FROM employee";
            result=stmt.executeQuery(sql);            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return result;
    }
    public ResultSet getCourse(){
        try {
            stmt= connection.createStatement();
            String sql="SELECT * FROM course";
            result=stmt.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return result;
    }
    public ResultSet getCourseBook(){
        try {
            stmt= connection.createStatement();
            String sql="SELECT * FROM course_book";
            result=stmt.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return result;
    }
    public ResultSet getProject(){
        try {
            stmt= connection.createStatement();
            String sql="SELECT * FROM project";
            result=stmt.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return result;
    }
    public ResultSet getNotes(){
        try {
            stmt= connection.createStatement();
            String sql="SELECT * FROM notes";
            result=stmt.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return result;
    }
    public ResultSet getThesis(){
        try {
            stmt= connection.createStatement();
            String sql="SELECT * FROM thesis";
            result=stmt.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return result;
    }
    public ResultSet getPublication(){
        try {
            stmt= connection.createStatement();
            String sql="SELECT * FROM publications";
            result=stmt.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return result;
    }
    public ResultSet getBookAuthor(){
        try {
            stmt=connection.createStatement();
            String sql="SELECT * FROM book_author";
            result=stmt.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return result;
    }
    public ResultSet getTtp(){
        try {
            stmt= connection.createStatement();
            String sql="SELECT * FROM ttp";
            result=stmt.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return result;
    }
   public Object[] search(String table,String search) throws Exception{
       if(table.equals("employee")){
           Object[] ob=new Object[7];
           String sql="SELECT * FROM employee WHERE emp_id='"+search+"' OR emp_name='"+search+"' OR emp_email='"+search+"' OR emp_ph_no='"+search+"' OR emp_address='"+search+"' OR emp_designation='"+search+"' OR chairman='"+search+"'";
           result=stmt.executeQuery(sql);
           if(result.next()){
               //ob[0]=result.getInt();
           }
       }else if(table.equals("course")){
           Object[] ob=new Object[6];
       }else if(table.equals("book_author")){
           Object[] ob=new Object[3];
       }else if(table.equals("course_book")){
           Object[] ob=new Object[3];
       }else if(table.equals("notes")){
           Object[] ob=new Object[4];
       }else if(table.equals("ttp")){
           Object[] ob=new Object[3];
       }else if(table.equals("publications")){
           Object[] ob=new Object[5];
       }else if(table.equals("project")){
           Object[] ob=new Object[6];
       }else if(table.equals("thesis")){
           Object[] ob=new Object[5];
       }
       throw new Exception("Table does't exist");
       //return ob;
   }
}