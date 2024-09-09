public class UserdefinedExc {
  public static void main(String args[])
  {
    public static void vote()
    {
      if(age<18)
      {
        throw new InvalidageException("Not eligible for voting");
      }
      else{
        System.out.println("Eligible for voting");
      }
    }
  }

}
