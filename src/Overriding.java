public class Overriding {
    String overide(){
        return  "abc";
    }
}
class Saman extends Overriding{
    String overide(){
        return  "5 ft";
    }
}
class Amara extends Overriding{
    String overide(){
        return "60 kg";
    }
}
class Kamal extends Overriding{
    String overide(){
        return "Dissanayaka";
    }
}
class Print{
    public static void main(String[] args) {
        Saman sa = new Saman();
        Amara am = new Amara();
        Kamal km = new Kamal();
        System.out.println("Saman's Height " + sa.overide());
        System.out.println("Amara's Weight " + am.overide());
        System.out.println("Kamal's Surname " + km.overide());
    }
}

