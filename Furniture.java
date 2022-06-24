class Furniture{

String name;
int price;

 public Furniture(){

 System.out.println("The Furniture object is created");
 }
public Furniture(String name,int  price){

this();
this.name = name;
this.price = price;
}

public static void main(String a[]){
Furniture fur = new Furniture(" wood Land",20000);

System.out.println("The fruiture name is :"+ fur.name  + " The fruniture price is: " + fur.price);

}
}