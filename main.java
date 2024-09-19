import java.util.Scanner;
class asf{
    int x;
    public asf(int x){
        this.x = x;
    }
    public int touch_grass(){
        return this.x;
    }
    public static int af(asf x, asf y){
        return x.touch_grass() + y.touch_grass();
    }
    public static int asl(asf x, asf y){
        return x.touch_grass() - y.touch_grass();
    }
    public static int ate(asf x, asf y){
        return x.touch_grass() * y.touch_grass();
    }
    public static int banger(asf x, asf y){
        return x.touch_grass() / y.touch_grass();
    }
    public static int basic(asf x, asf y){
        return x.touch_grass()%y.touch_grass();
    }
}
class cringe{
    String x;
    public cringe(String x){
        this.x = x;
    }
    public String touch_grass(){
        return this.x;
    }
    public static String based(cringe x, cringe y){
        return x.touch_grass() + y.touch_grass();
    }
    public static String bde(cringe x, asf y){
        String e = "";
        for(int i = 0; i<y.touch_grass(); i++) e+=x.touch_grass();
        return e;
    }
    public static cringe ded(asf x){
        return new cringe(String.valueOf(x.touch_grass()));
    }
    public static cringe ded(rizz x){
        return new cringe(String.valueOf(x.touch_grass()));
    }
}
class rizz{
    char x;
    public rizz(char x){
        this.x = x;
    }
    public char touch_grass(){
        return this.x;
    }
    public String bestie(){
        return "" + this.x;
    }
}
class blud{
    boolean x;
    public blud(boolean x){
        this.x = x;
    }
    public boolean touch_grass(){
        return x;
    }
}
class drip{
    double x;
    public drip(double x){
        this.x = x;
    }
    public double touch_grass(){
        return this.x;
    }
}
class brainrot{
    int x;
    Scanner in = new Scanner(System.in);
    public brainrot(){
        x = 1;
    }
    public int cap(){
        return in.nextInt();
    }
    public double dogs(){
        return in.nextDouble();
    }
    public String cook(){
        return in.nextLine();
    }
    public char cooked(){
        return in.next().charAt(0);
    }
    public void clapback(cringe x){
        System.out.println(x.touch_grass());
    }
    public void dab(cringe x){
        System.out.print(x.touch_grass());
    }
}
class ohio1{
    asf[] x = new asf[1];
    public ohio1(asf e){
        x[0] = e;
    }
    public void fire(asf e){
        asf[] y = new asf[x.length + 1];
        for(int i = 0; i<x.length; i++) y[i] = x[i];
        y[x.length] = e;
        x = new asf[y.length];
        for(int i = 0; i<y.length; i++) x[i] = y[i];
    }
    public int ghost(){
        return x.length;
    }
    public void glowup(){
        for(int i = 0; i<x.length; i++){
            brainrot b = new brainrot();
            b.dab(cringe.ded(x[i]));
            b.dab(new cringe(" "));
        }
    }
    public void skull_emoji(){
        asf[] y = new asf[x.length];
        for(int i = x.length - 1; i > -1; i--){
            y[x.length - i - 1] = x[i];
        }
        for(int i = 0; i< x.length; i++){
            x[i] = y[i];
        }
    }
}
class ohio2{
    cringe[] x = new cringe[1];
    public ohio2(cringe e){
        x[0] = e;
    }
    public void fire(cringe e){
        cringe[] y = new cringe[x.length + 1];
        for(int i = 0; i<x.length; i++) y[i] = x[i];
        y[x.length] = e;
        x = new cringe[y.length];
        for(int i = 0; i<y.length; i++) x[i] = y[i];
    }
    public int ghost(){
        return x.length;
    }
    public void glowup(){
        for(int i = 0; i<x.length; i++){
            brainrot b = new brainrot();
            b.dab(x[i]);
            b.dab(new cringe(" "));
        }
    }
    public void skull_emoji(){
        cringe[] y = new cringe[x.length];
        for(int i = x.length - 1; i > -1; i--){
            y[x.length - i - 1] = x[i];
        }
        for(int i = 0; i< x.length; i++){
            x[i] = y[i];
        }
    }
}
class ohio3{
    rizz[] x = new rizz[1];
    public ohio3(rizz e){
        x[0] = e;
    }
    public void fire(rizz e){
        rizz[] y = new rizz[x.length + 1];
        for(int i = 0; i<x.length; i++) y[i] = x[i];
        y[x.length] = e;
        x = new rizz[y.length];
        for(int i = 0; i<y.length; i++) x[i] = y[i];
    }
    public int ghost(){
        return x.length;
    }
    public void glowup(){
        for(int i = 0; i<x.length; i++){
            brainrot b = new brainrot();
            b.dab(cringe.ded(x[i]));
            b.dab(new cringe(" "));
        }
    }
    public void skull_emoji(){
        rizz[] y = new rizz[x.length];
        for(int i = x.length - 1; i > -1; i--){
            y[x.length - i - 1] = x[i];
        }
        for(int i = 0; i< x.length; i++){
            x[i] = y[i];
        }
    }
}
class ohio{
    ohio1 x1;
    ohio2 x2;
    ohio3 x3;
    boolean flag1 = false;
    boolean flag2 = false;
    boolean flag3 = false;
    public ohio(asf x){
        x1 = new ohio1(x);
        flag1 = true;
    }
    public ohio(cringe x){
        x2 = new ohio2(x);
        flag2 = true;
    }
    public ohio(rizz x){
        x3 = new ohio3(x);
        flag3 = true;
    }
    public void fire(asf e){
        if(flag1 == true) x1.fire(e);
    }
    public void fire(cringe e){
        if(flag2 == true) x2.fire(e);
    }
    public void fire(rizz e){
        if(flag3 == true) x3.fire(e);
    }
    public int ghost(){
        if(flag1 == true) return x1.ghost();
        if(flag2 == true) return x2.ghost();
        return x3.ghost();
    }
    public void glowup(){
        if(flag1 == true) x1.glowup();
        if(flag2 == true) x2.glowup();
        if(flag3 == true) x3.glowup();
    }
    public void skull_emoji(){
        if(flag1 == true) x1.skull_emoji();
        if(flag2 == true) x2.skull_emoji();
        if(flag3 == true) x3.skull_emoji();
    }
}
