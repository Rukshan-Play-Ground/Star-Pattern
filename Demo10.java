void main(){
    /*
    Star Pattern
     * * * * *
     * * * *
     * * *
     * *
     *

     */
    int i =0;
    while (i<=19){
        System.out.print((i==6)?"\n":(i==11)?"\n":(i==15)?"\n":(i==18)?"\n":" *" );
        i++;
    }
}