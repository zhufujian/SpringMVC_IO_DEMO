package com.study.demo.rmi.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import com.study.demo.rmi.bean.Student;
public interface StudentService extends Remote { 
  List<Student> getList() throws RemoteException;
}