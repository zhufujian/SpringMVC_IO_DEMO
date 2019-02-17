package com.study.demo.rmi.service.client;

import java.rmi.Naming;
import java.util.List;

import com.study.demo.rmi.bean.Student;
import com.study.demo.rmi.service.StudentService;
/**
 * 
*
* @Description: 创建一个客户程序进行RMI调用
* @ClassName: GetService 
* @author zhufj
* @date 2019年2月17日 下午8:12:44 
*
 */
public class GetService {
  public static void main(String[] args) {
      try {
          StudentService studentService=(StudentService) Naming.lookup("rmi://127.0.0.1:5008/StudentService");
          List<Student> list = studentService.getList();
          for (Student s : list) {
              System.out.println("姓名："+s.getName()+",年龄："+s.getAge());
          }
      } catch (Exception e) { 
          e.printStackTrace();
      }
  }
}