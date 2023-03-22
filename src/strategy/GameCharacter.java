package strategy;

public class GameCharacter implements Weapon {
    private Weapon weapon;
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    @Override
    public void attack() {
        if(weapon==null){
            System.out.println("맨손 공격");
        }
        else{
            weapon.attack();
        }
    }
}
