class arrayexample{
    void demoarray(){
        int[]ages=new int[3];
        ages[0]=34;
        ages[1]=45;
        ages[2]=28;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages.length);
    }
}
public class basic_array {
    public static void main(String[] args) {
        arrayexample obj=new arrayexample();
        obj.demoarray();
    }
}
