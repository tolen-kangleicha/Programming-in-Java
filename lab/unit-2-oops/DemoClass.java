class DemoClass {
  int xid;
  String xname;

  public void GetData(int id, String name) {
    xid = id;
    xname = name;
  }

  public DemoClass(int id, String name) {
    xid = 0;
    xname = "NULL";
  }

  public static void main(String args[]) {
    DemoClass ob = new DemoClass(123, "Lala");
    //ob.id = 123;
    //ob.name = "Lala";
    //ob.GetData(123, "Lala");

    System.out.println(ob.xid + "  " + ob.xname);
  }
}
