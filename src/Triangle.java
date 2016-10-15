
public class Triangle {
    public static void triangle(int n,int espace){
        String etoile=" ";
        int i=0;
        int j=0;
        for(i=0;i<n;i++){
          espace=n-i;
            for(j=0;j<espace;j++){
                System.out.print(" ");
            }
            etoile=etoile+"* ";
            System.out.println(etoile);
        }
    }
    public static void main (String[] args){
           System.out.println("combien de ligne ?"); // j'ai ajouté un affichage et modifié ns
           Scanner x = new Scanner(System.in);
            n = x.nextInt();
        
        int espace=0;
        triangle(n,espace);
    }
}
