package com.subrata.bean;

public class MyDao {

		private int id;
		private String msg;
		
		public MyDao(int id, String msg) {
			
			this.id = id;
			this.msg = msg;
		}
		public int getId() {
			return id;
		}
//		public void setId(int id) {
//			this.id = id;
//		}
		public String getMsg() {
			return msg;
		}
//		public void setMsg(String msg) {
//			this.msg = msg;
//		}
		
}
