
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
        int n=8;
        int espace=0;
        triangle(n,espace);
    }
}
