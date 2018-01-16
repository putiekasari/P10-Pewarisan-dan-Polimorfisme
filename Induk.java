class Induk{
    static void dariInduk(){
        System.out.println("ini dari induk.");
      }
}

class Anak extends Induk{
    static void dariAnak(){
        System.out.println("ini dari anak.");
    }
}

class Contoh{
    public static void main(String[] args){
        Anak obj = new Anak(); //membuat objek dr kelas anak
        obj.dariInduk(); //method dari class induk
        obj.dariAnak(); //method dr class anak
    }
}