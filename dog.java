//public class dog {
//     int id_no;
//    // string color=black;
//    // string breed=german;
//}
//public class main{
//    public static void main(string[] args){
//        dog.obj=new dog();
//        obj,id_no=123;
//        System.out.println(obj.id_no);
//       // System.out.println(obj.color);
//       // System.out.println(obj.breed);
//
//    }
//}

class pet{
    int id_no;
    String breed;
    String color;
}
public class dog{
    public static void main(String[] args){
        pet obj=new pet();
        obj.id_no=123;
        obj.breed="german";
        obj.color="black";
        System.out.println(obj.id_no);
        System.out.println(obj.breed);
        System.out.println(obj.color);
    }
}