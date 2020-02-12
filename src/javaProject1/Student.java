package javaProject1;


	

	import java.util.Comparator;

	public class Student implements Comparator<Student>
	{
		
	    private int id;
		private String name;
		private float percentage;
		
		public int getId() {
			return id;
		}

		

		public String getName() {
			return name;
		}

		

		public float getPercentage() {
			return percentage;
		}

		

		public Student(int a,String b,float c)
		{
			this.id=a;
			this.name=b;
			this.percentage=c;
			}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
		}

		@Override
		public int compare(Student s1,Student s2){
			return (int)(s1.getId()-s2.getId());  
			
			/*if(s1.id==s2.id)  
			return 0;  
			else if(s1.id>s2.id)  
			return 1;  
			else  
			return -1; */ 
			}  
			}  
		
		





