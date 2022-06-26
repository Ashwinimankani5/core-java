class LaptopTester{

  public static void main(String a[]){

   Dell del = new Dell();

   del.modleType="Vostro";
   del.price=30000;
   del.operatingSystem="Windows11home";

  del.playGame();

  System.out.println(del.modleType+"    "+del.price+"    "+del.operatingSystem+"   ");
  }

} 