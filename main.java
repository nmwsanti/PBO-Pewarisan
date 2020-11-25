public class main {
        public static void main(String[] args) {
        tim itzy = new tim("itzy");
        

        member m1 = new member("Ryujin", 19);
        member m2 = new member("Yeji", 20);
        member m3 = new member("Lia", 20);
       
        trainee t1 = new trainee("Chaeryeong", 19, 5);
        trainee t2 = new trainee("Yuna", 16, 3);

        itzy.addmember(m1); 
        itzy.addmember(m2);
        itzy.addmember(m3);

        itzy.addmember(t1);
        itzy.addmember(t2);

        System.out.println("Full Member:");
        itzy.displayfullmember();
        System.out.println("\nTrainee");
        itzy.displaytrainee();    
        }
    }