public class trainee extends member {
    private int lamatraining;

    public trainee(String nama, int umur, int lamatraining) {
        super(nama, umur); 
        this.lamatraining = lamatraining;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Lama Training (tahun) : " + lamatraining);
    }
}