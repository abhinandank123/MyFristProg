public class RevStr {
    public static void main(String [] args){

    
    
        String name="abhinandan";
         String sname="";
        for(int i=0; i<name.length()-1; i++){
            char cname=name.charAt(i);
            sname=cname+sname;

        }
        System.out.println("Reverse String is "+sname);
    }
}
