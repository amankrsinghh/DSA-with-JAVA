package OOPs;

public class Encapsulationn {

    public static class Studnet {
        private String name;

        public void setName(String name){
            if(!name.isEmpty() && name != null){
                this.name = name;
            }
        }
        public String getName(){
            return this.name;
        }

    }
    public static void main(String[] args) {
        Studnet s1 = new Studnet();
        s1.setName("Aman");
        System.out.println(s1.getName());




    }

}
