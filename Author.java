package lab51;

public class Author {
    private String name;
    private  String email;
    private char gender;

    public Author (String name, String email , char gender ){
        this.name = name;
        this.email = email;
        this.gender =gender;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public char getGender(){
        return this.gender;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String toString(){
        return "Author [name=" + name +"\t"+ "email="  + email +"\t"+ "gender ="  + gender + "]";
    }

//    public static void main(String[] args) {
//        Author s1 = new Author("Son", "abc@gmail.com",'m');
//        System.out.println(s1);
//
//        s1.setEmail("sonset1996@gmail.com");
//        System.out.println("name is: "+s1.getName());
//        System.out.println("email is: "+s1.getEmail());
//        System.out.println("email is: "+s1.getGender());
//    }
}
