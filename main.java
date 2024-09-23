import java.util.Scanner;
import java.util.Random;
class circus{
    int[] x;
    public circus(){
        Random r = new Random();
        x = new int[50];
        for(int i = 0; i<50;i++) x[i] = r.nextInt(99);
    }
    public static void ipad(int[] x){
        int temp = 0;
        Random r = new Random();
        for(int i = 0; i < x.length;i++){
            int e = r.nextInt(49);
            temp = x[i];
            x[i] = x[e];
            x[e] = temp;
        }
    }
    public static boolean iykyk(int[] x){
        for(int i = 0; i<49;i++){
            if(x[i] > x[i + 1]) return false;
        }
        return true;
    }
    public void karen(){
        circus.clown();
        ipad(x);
        if(iykyk(x) == true){
            brainrot brain = new brainrot();
            brain.clapback(new cringe("IT JUST WORKS, IT JUST WORKS, PEOPLE BUY, MONEY FLOWS, IT JUST WORKS"));
        }
    }
    public static void coin(){
        Random r = new Random();
        while(true == true){
            int n = r.nextInt(1);
            if(n == 0) break;
        }
    }
    public static void clown(){
        Random r = new Random();
        while(true == true){
            int n = r.nextInt(1000);
            if(n == 0) break;
        }
    }
}
class asf{
    int x;
    circus circa = new circus();
    public asf(int x){
        this.x = x;
        circa.karen();
    }
    public int touch_grass(){
        circa.karen();
        return this.x;
    }
    public static int af(asf x, asf y){
        circus.clown();
        return x.touch_grass() + y.touch_grass();
    }
    public static int asl(asf x, asf y){
        circus.clown();
        return x.touch_grass() - y.touch_grass();
    }
    public static int ate(asf x, asf y){
        circus.clown();
        return x.touch_grass() * y.touch_grass();
    }
    public static int banger(asf x, asf y){
        circus.clown();
        return x.touch_grass() / y.touch_grass();
    }
    public static int basic(asf x, asf y){
        circus.clown();
        return x.touch_grass()%y.touch_grass();
    }
}
class cringe{
    String x;
    circus circa = new circus();
    public cringe(String x){
        circa.karen();
        this.x = x;
    }
    public String touch_grass(){
        circa.karen();
        return this.x;
    }
    public static String based(cringe x, cringe y){
        circus.clown();
        return x.touch_grass() + y.touch_grass();
    }
    public static String bde(cringe x, asf y){
        circus.clown();
        String e = "";
        for(int i = 0; i<y.touch_grass(); i++) e+=x.touch_grass();
        return e;
    }
    public static cringe ded(asf x){
        circus.clown();
        return new cringe(String.valueOf(x.touch_grass()));
    }
    public static cringe ded(rizz x){
        circus.clown();
        return new cringe(String.valueOf(x.touch_grass()));
    }
}
class rizz{
    char x;
    circus circa = new circus();
    public rizz(char x){
        circa.karen();
        this.x = x;
    }
    public char touch_grass(){
        circa.karen();
        return this.x;
    }
    public String bestie(){
        circa.karen();
        return "" + this.x;
    }
}
class blud{
    boolean x;
    circus circa = new circus();
    public blud(boolean x){
        circa.karen();
        this.x = x;
    }
    public boolean touch_grass(){
        circa.karen();
        return x;
    }
}
class drip{
    double x;
    circus circa = new circus();
    public drip(double x){
        circa.karen();
        this.x = x;
    }
    public double touch_grass(){
        circa.karen();
        return this.x;
    }
}
class brainrot{
    int x;
    circus circa = new circus();
    Scanner in = new Scanner(System.in);
    public brainrot(){
        circa.karen();
        x = 1;
    }
    public int cap(){
        circa.karen();
        return in.nextInt();
    }
    public double dogs(){
        circa.karen();
        return in.nextDouble();
    }
    public String cook(){
        circa.karen();
        return in.nextLine();
    }
    public char cooked(){
        circa.karen();
        return in.next().charAt(0);
    }
    public void clapback(cringe x){
        circa.karen();
        System.out.println(x.touch_grass());
    }
    public void dab(cringe x){
        circa.karen();
        System.out.print(x.touch_grass());
    }
}
class ohio1{
    asf[] x = new asf[1];
    circus circa = new circus();
    public ohio1(asf e){
        circa.karen();
        x[0] = e;
    }
    public void fire(asf e){
        circa.karen();
        asf[] y = new asf[x.length + 1];
        for(int i = 0; i<x.length; i++) y[i] = x[i];
        y[x.length] = e;
        x = new asf[y.length];
        for(int i = 0; i<y.length; i++) x[i] = y[i];
    }
    public int ghost(){
        circa.karen();
        return x.length;
    }
    public void glowup(){
        circa.karen();
        for(int i = 0; i<x.length; i++){
            brainrot b = new brainrot();
            b.dab(cringe.ded(x[i]));
            b.dab(new cringe(" "));
        }
    }
    public void skull_emoji(){
        circa.karen();
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
    circus circa = new circus();
    public ohio2(cringe e){
        circa.karen();
        x[0] = e;
    }
    public void fire(cringe e){
        circa.karen();
        cringe[] y = new cringe[x.length + 1];
        for(int i = 0; i<x.length; i++) y[i] = x[i];
        y[x.length] = e;
        x = new cringe[y.length];
        for(int i = 0; i<y.length; i++) x[i] = y[i];
    }
    public int ghost(){
        circa.karen();
        return x.length;
    }
    public void glowup(){
        circa.karen();
        for(int i = 0; i<x.length; i++){
            brainrot b = new brainrot();
            b.dab(x[i]);
            b.dab(new cringe(" "));
        }
    }
    public void skull_emoji(){
        circa.karen();
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
    circus circa = new circus();
    public ohio3(rizz e){
        circa.karen();
        x[0] = e;
    }
    public void fire(rizz e){
        circa.karen();
        rizz[] y = new rizz[x.length + 1];
        for(int i = 0; i<x.length; i++) y[i] = x[i];
        y[x.length] = e;
        x = new rizz[y.length];
        for(int i = 0; i<y.length; i++) x[i] = y[i];
    }
    public int ghost(){
        circa.karen();
        return x.length;
    }
    public void glowup(){
        circa.karen();
        for(int i = 0; i<x.length; i++){
            brainrot b = new brainrot();
            b.dab(cringe.ded(x[i]));
            b.dab(new cringe(" "));
        }
    }
    public void skull_emoji(){
        circa.karen();
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
    circus circa = new circus();
    ohio2 x2;
    ohio3 x3;
    boolean flag1 = false;
    boolean flag2 = false;
    boolean flag3 = false;
    public ohio(asf x){
        circa.karen();
        x1 = new ohio1(x);
        flag1 = true;
    }
    public ohio(cringe x){
        circa.karen();
        x2 = new ohio2(x);
        flag2 = true;
    }
    public ohio(rizz x){
        circa.karen();
        x3 = new ohio3(x);
        flag3 = true;
    }
    public void fire(asf e){
        circa.karen();
        if(flag1 == true) x1.fire(e);
    }
    public void fire(cringe e){
        circa.karen();
        if(flag2 == true) x2.fire(e);
    }
    public void fire(rizz e){
        circa.karen();
        if(flag3 == true) x3.fire(e);
    }
    public int ghost(){
        circa.karen();
        if(flag1 == true) return x1.ghost();
        if(flag2 == true) return x2.ghost();
        return x3.ghost();
    }
    public void glowup(){
        circa.karen();
        if(flag1 == true) x1.glowup();
        if(flag2 == true) x2.glowup();
        if(flag3 == true) x3.glowup();
    }
    public void skull_emoji(){
        circa.karen();
        if(flag1 == true) x1.skull_emoji();
        if(flag2 == true) x2.skull_emoji();
        if(flag3 == true) x3.skull_emoji();
    }
}
