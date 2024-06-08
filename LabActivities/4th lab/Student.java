//prgm to create 10 objects of class Student

import java.util.*;//package

 class Student //class
   {
     int sid;//members
    String sname;
    double marks;

    public Student(int sid, String sname,double marks)// parameterise constructor
    {
        this.sid = sid;
        this.sname = sname;
        this.marks=marks;
    }

    public int getId() //getId() method
          {             
        return sid;
    }

    public String getName() //getName() method
     {
        return sname;
    }
     
     public double getMarks()//getMarks() method
      {
        return marks;
     }

    public String toString() //toString() method
    {
        return "StudentID:" + sid + ", Name:" + sname +", Marks: "+ marks;
    }

    public static void main(String[] args)//main() method
	{
        ArrayList<Student> st = new ArrayList<Student>();

        // Adding 10 student objects to the ArrayList
        st.add(new Student(11, "Janavi" ,80.56));
        st.add(new Student(12, "Akshada",78.89));
        st.add(new Student(13, "Divya"  ,90.00));
        st.add(new Student(14, "Manoj"  ,50.23));
        st.add(new Student(15, "Prajkta",67.45));
        st.add(new Student(16, "Lina"   ,82.23));
        st.add(new Student(17, "Monika" ,98.33));
        st.add(new Student(18, "Saran"  ,56.00));
        st.add(new Student(19, "Tanika" ,65.7));
        st.add(new Student(20, "Samir"  ,45.90));

        // Printing the ArrayList using a for-each loop
        for (Student student1 : st) 
         {
            System.out.println(student1);
        }
    }
}
