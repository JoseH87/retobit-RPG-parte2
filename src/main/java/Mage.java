public class Mage extends Character {

    int mana;

    public Mage(String name, int health, int mana) {
        super(name, health);
        this.mana = mana;
    }

    public void castSpell(Character target) {

        if(mana < 10){
            System.out.println("No tienes suficiente mana");
        } else{
            target.health -= 10;
            target.status = Status.POISONED;
            mana -= 10;
        }
    }

    public void heal(Character target) {
        mana -= 15;
        target.health += 20;
    }

    public int getMana() {
        return mana;
    }
}

