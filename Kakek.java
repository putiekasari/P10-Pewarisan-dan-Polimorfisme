class Kakek{
    void dariKakek(){
        System.out.println("Ini dari Kakek.");
    }
}

class Bapak extends Kakek{
    void dariBapak(){
        System.out.println("Ini dari Bapak");
    }
}

class Cucu extends Bapak{
    void dariCucu(){
        System.out.println("Dan ini dari cucu.");

    }
}

class Contoh {
    public static void main(String[]args){
        Cucu obj=new Cucu();
        obj.dariKakek();
        obj.dariBapak();
        obj.dariCucu();
    }
}