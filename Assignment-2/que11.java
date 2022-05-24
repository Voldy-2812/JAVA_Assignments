abstract class Monster {}
 
class Vampire extends Monster {}
class Werewolf extends Monster {}
class Zombie extends Monster {}
 
public class que11 {
    public static void main(String args[]) {
        Monster[] monster = new Monster[6];
        Vampire Orlok = new Vampire();
        Vampire Ambrosia = new Vampire();
        Werewolf Adalwolf = new Werewolf();
        Werewolf Fenris = new Werewolf();
        Zombie Biters = new Zombie();
        Zombie Lurkers = new Zombie();
        monster[0] = Orlok;
        monster[1] = Ambrosia;
        monster[2] = Adalwolf;
        monster[3] = Fenris;
        monster[4] = Biters;
        monster[5] = Lurkers;
       
        for (int i = 0; i < 6; i++) {
            //compiler writes here monster[i].toString()
            System.out.println(monster[i]);
        }
    }
}
