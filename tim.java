import java.util.ArrayList;
public class tim {
    private String nama;
    private ArrayList<member> member;

    public tim(String nama) {
        this.nama = nama;
        member = new ArrayList<>();
       }
    
    public void addmember(member m){
        member.add(m);
        }

        public void displayfullmember() {
            System.out.println("MEMBER  : " + nama);
            for(member m : member) {
                m.display();
                System.out.println();
            }
        }
        public void displaytrainee() {
            System.out.println("TRAINEE : " + nama);
            for(member m : member) {
                if(m instanceof trainee) {
                    trainee trainee = (trainee) m;
                    trainee.display();
                    System.out.println();
            }
        }
    }
}