public class undead implements character{
    protected String name;
    protected String gender;
    public int level=1;
    public String tribe;
    public double attack;
    public double charattack;
    public double mana;
    public double charmana;
    public double defense;
    public double health;
    public double movement_speed;

    public double returnstat;

    public String weapon;
    public int countweapon=0;
    public double manafromweapon=0;
    public double attackfromweapon=0;

    @Override
    public void characterinfomation(String name,String gender){
        this.name=name;
        this.gender=gender;
    };//เป็นfunctionที่รับinputเป็นชื่อและเพศ โดยเอาไว้เซ็ทค่าnameและgenderเฉย จะไม่มีoutputออกมา
    @Override
    public void getstat(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Tribe: " + tribe);
        System.out.println("Level: " + level);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: " + defense);
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Movement Speed: " + movement_speed);
        if (weapon != null) {
            System.out.println("Weapon: " + weapon);
        } else {
            System.out.println("Your hand is empty. Equip a weapon!");
        }
    };//เป็นfunctionที่ไม่มีinput output เอาไว้printค่าstatusตัวละคร
    @Override
    public void defaultstat(){
        tribe="undead";
        attack = 30;
        charattack =30;
        defense = 2;
        health = 50;
        mana = 30;
        charmana=30;
        movement_speed = 15;
    };//เป็นfunctionที่ไม่มีinput output เอาไว้setค่าstatusเริ่มต้น
    @Override
    public void skill(){
        System.out.println("Necrotic Touch : Inflicts a curse on enemies,causing damage over time and weakening their abilities ");
    };//เป็นfunctionที่ไม่มีinput output เอาไว้print skillของตัวละครแต่ละเผ่า

    @Override
    public void levelup(){
        charattack +=2*level;
        attack=charattack+attackfromweapon;
        defense +=4*level;
        health +=5*level;
        charmana +=3*level;
        mana=charmana+manafromweapon;
        movement_speed += (0.1+0.03*level);
        level++;
        System.out.println("Levelup+++");
    };//เป็นfunctionที่ไม่มีinput output เอาไว้เปลี่ยนstatusตอนlevel up

    @Override
    public void equip(sword a){
        if(countweapon<1){
            undead data= new undead();
            returnstat = a.getstat(data);
            attackfromweapon +=returnstat;
            weapon="sword";
            countweapon++;
            attack=charattack+attackfromweapon;
            System.out.println("Equip already.");
        }else{
            System.out.println("Your hand is full.");
        }

    }//เป็นfunctionที่มีinputเป็นobject sword ไม่มีoutput เอาไว้ใส่อาวุธ โดยจะใส่ได้แค่ชิ้นเดียว ซึ่งจะเปลี่ยนแปลงstatusบางส่วน statusที่เปลี่ยนจะเรียกมาจากfunction getstat ของclassอาวุธ
    @Override
    public void equip(ward a){
        if(countweapon<1){
            undead data= new undead();
            returnstat = a.getstat(data);
            manafromweapon +=returnstat;
            weapon="ward";
            countweapon++;
            mana=charmana+manafromweapon;
            System.out.println("Equip already.");
        }else{
            System.out.println("Your hand is full.");
        }

    }//เป็นfunctionที่มีinputเป็นobject ward ไม่มีoutput เอาไว้ใส่อาวุธ โดยจะใส่ได้แค่ชิ้นเดียว ซึ่งจะเปลี่ยนแปลงstatusบางส่วน statusที่เปลี่ยนจะเรียกมาจากfunction getstat ของclassอาวุธ
    @Override
    public void unequip(){
        if(weapon.equals("ward")){
            manafromweapon -=returnstat;
            countweapon--;
            mana=manafromweapon+charmana;
        }else if(weapon.equals("sword")){
            attackfromweapon -=returnstat;
            countweapon--;
            attack=charattack+attackfromweapon;
        }else{
            System.out.println("you don't have any weapon.");
        }
    }//เป็นfunctionที่ไม่มีinput ไม่มีoutput แต่เอาไว้เปลี่ยนค่าstatusกลับ

    @Override
    public void attack(undead a){
        System.out.println(name+" attack "+a.name);
        if(attack*0.5-a.defense >= 0){
            a.health-=attack*0.5-a.defense;
        }else{
            a.health = 0;
            System.out.println("Your attack is less than enemy defense.");
        }
    }//input เป็นcharacterเผ่าundeadโดยจะสร้างความเสียหายเป็น0.5เท่าของattack-ด้วยdefense outputไม่มี

    @Override
    public void attack(human a){
        System.out.println(name+" attack "+a.name);
        if(attack-a.defense >= 0){
            a.health-=attack-a.defense;
        }else{
            a.health = 0;
            System.out.println("Undead attack is less than Human defense.");
        }
    }//input เป็นcharacterเผ่าhumanโดยจะสร้างความเสียหายเป็นattack-ด้วยdefense outputไม่มี

}
