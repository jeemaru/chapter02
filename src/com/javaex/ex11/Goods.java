package com.javaex.ex11;

public class Goods {


		private String name;
		private int price;
		public static int count;
		
		public Goods() {
			this.count = count+1;
		}
		
		public Goods(String name, int price) {
			this.name = name;
			this.price = price;
			this.count = count+1;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	
		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
		

		public static int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		@Override
		public String toString() {
			return "Goods [name=" + name + ", price=" + price + ", count=" + count + "]";
		}


		

		
		
		
}
