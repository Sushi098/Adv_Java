package com.rays.modeltest;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import com.rays.bean.UserBean;
import com.rays.model.UserModel;

public class UserModelTest {
	
public static void main(String[] args) throws Exception {
		
//		testAdd();
//		testUpdate();
//		testDelete();
//		testFindByPk();
//		testAuth();
		testSearch();
		
	}

	private static void testAdd() throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		UserBean bean = new UserBean();
		
		bean.setFirstName("Virat");
		bean.setLastName("Kohli");
		bean.setLoginId("virat9@gmail.com");
		bean.setPassword("virat@9");
		bean.setPhoneNo("89845676");
		bean.setDob(sdf.parse("17/09/2000"));
		bean.setGender("Male");
		
		UserModel model = new UserModel();
		UserBean existBean = model.findByLogin(bean.getLoginId());
		
		if(existBean != null) {
			System.out.println("Login already exist...");
		}else {
			model.add(bean);
		}
		model.add(bean);
		
		
	}
	
	private static void testUpdate() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		UserBean bean = new UserBean();

		bean.setId(5);
		bean.setFirstName("Abhishek");
		bean.setLastName("Parmar");
		bean.setLoginId("anish5@gmail.com");
		bean.setPassword("anish@5");
		bean.setPhoneNo("898578456");
		bean.setDob(sdf.parse("11/09/1999"));
		bean.setGender("male");

		UserModel model = new UserModel();
		model.update(bean);

	}

	private static void testDelete() throws Exception {

		UserModel model = new UserModel();

		UserBean bean = model.findByPk(8);

		if (bean != null) {
			model.delete(bean.getId());
		} else {
			System.out.println("Id Not Available");
		}

	}

	private static void testFindByPk() throws Exception {

		UserModel model = new UserModel();

		UserBean bean = model.findByPk(5);

		if (bean != null) {

			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLoginId());
			System.out.print("\t" + bean.getPassword());
			System.out.print("\t" + bean.getPhoneNo());
			System.out.print("\t" + bean.getDob());
			System.out.println("\t" + bean.getGender());

		} else {
			System.out.println("Id Not Available...");
		}

	}

	private static void testAuth() throws Exception {

		UserModel model = new UserModel();

		UserBean bean = model.authenticate("anish5@gmail.com", "anish@5");

		if (bean != null) {

			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLoginId());
			System.out.print("\t" + bean.getPassword());
			System.out.print("\t" + bean.getPhoneNo());
			System.out.print("\t" + bean.getDob());
			System.out.println("\t" + bean.getGender());

		} else {
			System.out.println("Invalid LoginId and Password...");
		}

	}

	private static void testSearch() throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		UserBean bean = new UserBean();
		UserModel model = new UserModel();

//		bean.setFirstName("s");
//		bean.setDob(sdf.parse("25/01/2001"));

		List list = model.search(bean);

		Iterator it = list.iterator();

		if (!it.hasNext()) {

			System.out.println("Record Not Found");

		}

		while (it.hasNext()) {

			bean = (UserBean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLoginId());
			System.out.print("\t" + bean.getPassword());
			System.out.print("\t" + bean.getPhoneNo());
			System.out.print("\t" + bean.getDob());
			System.out.println("\t" + bean.getGender());

		}

	}


}
