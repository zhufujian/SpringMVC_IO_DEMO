package com.study.demo.rmi.service.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import com.study.demo.rmi.bean.Student;
import com.study.demo.rmi.service.StudentService;
/**
 * 
*
* @Description: 要想创建一个远程对象，扩展UnicastRemoteObject是最容易的方法
* @ClassName: StudentServiceImpl 
* @author zhufj
* @date 2019年2月17日 下午8:16:22 
*
 */
public class StudentServiceImpl extends UnicastRemoteObject implements
      StudentService {
	private static final long serialVersionUID = 1L;
	public StudentServiceImpl() throws RemoteException {
  }
  public List<Student> getList() throws RemoteException {
      List<Student> list=new ArrayList<Student>();
      Student s1=new Student();
      s1.setName("张三");
      s1.setAge(15);
      Student s2=new Student();
      s2.setName("李四");
      s2.setAge(20);
      list.add(s1);
      list.add(s2);
      return list;
  }
}