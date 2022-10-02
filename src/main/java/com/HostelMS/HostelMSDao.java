

package com.HostelMS;
//importing required packages to be used in further
import com.hostelMS.Exception.GlobalException;
import com.hostelMS.model.User;

//craeting a interface with tha name og HostelMs dao
public interface HostelMSDao {

	
	
		public int registration(User u1) throws GlobalException;
		public User login(String userName,String password) throws GlobalException;
		

	}