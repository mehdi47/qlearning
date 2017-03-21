
public class Robot{
    
    public static final int recompensefinal = 100 ;



public static void goRight(int i, double[][] array){
        
    int taille = array[i].length;
    int k;
    Bloc b=new Bloc();
    d = b.qDroite;
    for(k = 1 ; k<=taille ; k++){
        array[0][0] = d;
        array[i][k] = array[i][k+1];
            if(array[i][k] == array[i][taille] || array[i][k] == 0){
                    system.out.print("Vous ne pouvez pas aller a droite");
                    break;
} 
}
}



public static void goLeft(int i, double[][] array){

     int taille = array[i].length;
     int k;
     Bloc b=new Bloc();
     g = b.qGauche;
     g = 0;
    for (k = taille -1 ; k>=0 ; k--){
        array[0][0] = g;
        array[i][k] = array[i][k-1];
            if(array[i][k] == array[0][k] || array[i][k] == 0){
                system.out.print("Vous ne pouvez pas aller a gauche");
                break;
}
    }
}


public static void goDown(int i, double[][] array){

    int taille = array[î].length;
    int k;
    Bloc b=new Bloc();
    bas = b.qBas;
    for(k = 1; k <=length ; k++){
         array[0][0] = bas;
         array[k][i] = array[k+1][i];
             if(array[i][k] == array[i][taille] || array[i][k] == 0){
                    system.out.print("Vous ne pouvez pas aller en bas");
                    break;
}            
}}


public static void goUp (int i, double[][] array){

    int taille = array[i].length;
    int k;
    Bloc b=new Bloc();
    haut = b.qHaut;
    for(k=length - 1;k>=0 ; k--){
            array[0][0] = haut;
            array[k][i] = array[k-1][i];
                if(array[i][k] == array[0][k] || array[i][k] == 0){
                    system.out.print("Vous ne pouvez pas aller en haut");
                    break;
}
}}


public static void calculate (double[][] array                     ){


    int i,j;
    int taille = array[i].length;
    int rcmpblock = 0;
    int recmp = Robot.recompensefinal;

    for (i = 0; i<=taille; i++){
        for(j = 0; j <= taille; j++){
            if(array[i][j] == -1){

                rcmpblock --;
                }
            else if(array[i][j] == 0){
                
                
    
           
