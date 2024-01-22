package oop.interfaces;

public abstract class Bar {

    String type;
    String signatureDrink;
    final int ageLimit = 18;

    void serveSignatureDrink(){
        System.out.println("Serving: "  + signatureDrink);
    }

    abstract void open();

    abstract void sell();

} class LaTria extends Bar {

    @Override
    void open() {
        System.out.println("Opening every friday...");
    }

    @Override
    void sell() {
        System.out.println("Selling..");
    }

    public static void main(String[] args) {
        LaTria laTria = new LaTria();
        laTria.type = "Regular one";
//        laTria.ageLimit = 18; //nepujde, je konstantni
        laTria.signatureDrink = "Tequila";

        PrancingPony prancingPony = new PrancingPony();
        prancingPony.type = "The one in Bree";
        prancingPony.signatureDrink = "Tea";
    }
}

class PrancingPony extends Bar{

    @Override
    void open() {
        System.out.println("We are opening soon");
    }

    @Override
    void sell() {
        System.out.println("We dont sell to hobbits GRrrr");
    }
}
