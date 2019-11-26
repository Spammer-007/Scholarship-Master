package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "AdminMaster")
public class AdminMaster {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private String Role;
		
		private String AdminId;
		private String Password;
		
		public String getRole() {
			return Role;
		}
		public void setRole(String role) {
			Role = role;
		}
		
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		public String getAdminId() {
			return AdminId;
		}
		public void setAdminId(String adminId) {
			AdminId = adminId;
		}
		

}
