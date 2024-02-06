void main(){

    int y=0;
    while (y < 9) {
        y++;
        int x =0;
        while (x<((6>y?6-y:y-4))){
            x++;
            System.out.print(" * ");
        }
        System.out.println();
    }

}